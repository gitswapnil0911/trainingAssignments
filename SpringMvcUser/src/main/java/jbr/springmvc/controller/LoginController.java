package jbr.springmvc.controller;

import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;
import jbr.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/login", method= RequestMethod.GET)
    public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response)
    {
        ModelAndView mav = new ModelAndView("login"); //Created a container to store individual objects
        mav.addObject("login", new Login());

        return mav;
    }

    @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
    public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("login") Login login)
    {
        ModelAndView mav= null;
        User user =userService.validateUser(login);

        if(user!=null) {
            mav = new ModelAndView("welcome");
            mav.addObject("firstname",user.getFirstname());
        }
        else{
            mav= new ModelAndView("login");
            mav.addObject("message","Username or Password is invalid!");
        }

        return mav;
    }



}
