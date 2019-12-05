package com.training.controllers;

import com.training.entity.User;
import com.training.ifaces.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

    @Autowired
    private ModelAndView mdlView;

    @Autowired
    private User user;

    @Autowired
    private UserDao dao;

    @RequestMapping("/")
    public ModelAndView init(){

        mdlView.addObject("command",user);
        mdlView.setViewName("index");
        return mdlView;
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView register() {
        mdlView.addObject("registerUser", user);
        mdlView.setViewName("register");
        return mdlView;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerUser(@ModelAttribute("register") User user, Model model) {
        String displayPage="register";
        try {
            dao.registerNewUser(user);
            displayPage="index";
            user.setUserName("");
            user.setPassWord("");
            model.addAttribute("command", user);

        }
        catch (Exception e){
            user.setUserName("");
            user.setPassWord("");
            user.setUserEmailId("");
            user.setUserContact(0);
            model.addAttribute("errorMessage","Incorrect Details, please enter valid details");
            model.addAttribute("command",user);
            e.getMessage();
        }
        return displayPage;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginUser(@ModelAttribute("login") User user, Model model) {
        String displayPage = "index";
        try {
            dao.authenticateUser(user.getUserName(),user.getPassWord());
            displayPage = "menu";
            model.addAttribute("Welcome",user.getUserName()+" successfully logged in");

        } catch (Exception e) {
            user.setUserName("");
            user.setPassWord("");
            model.addAttribute("errorMessage","Invalid user");
            model.addAttribute("command",user);
            e.getMessage();
        }
        return displayPage;
    }

}
