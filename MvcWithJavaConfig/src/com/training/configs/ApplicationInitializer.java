package com.training.configs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class ApplicationInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();

        ctx.register(WebConfig.class);//Adding class where beans are registered

        DispatcherServlet dispatcherServlet = new DispatcherServlet(ctx);

        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("DispatcherServlet",dispatcherServlet);

        dispatcher.addMapping("/");

    }
}
