package com.jpmc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller
public class MyController {
    @RequestMapping("/hello")
    public String redirect(){
        return "viewPage";
    }

    @RequestMapping("/helloagain")
    public String display(){
        return "final";
    }
}

/*
Request->web.xml->DispatcherServlet->
*/