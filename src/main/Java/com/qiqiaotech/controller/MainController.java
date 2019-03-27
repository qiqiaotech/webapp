package com.qiqiaotech.controller;

import com.qiqiaotech.something.SomeObject;
import com.qiqiaotech.something.impl.SomeObjectImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.FrameworkServlet;

import javax.servlet.ServletContext;

@RestController
public class MainController {

    @Autowired
    public SomeObject someObject;

    @RequestMapping("/")
    public String init() {
        someObject.printSomething();
        return "first WebApp";
    }


    @RequestMapping("/context")
    public String getContext() {
        WebApplicationContext webApplicationContext= ContextLoader.getCurrentWebApplicationContext();
        ServletContext servletContext = webApplicationContext.getServletContext();
        ApplicationContext applicationContext = (ApplicationContext) servletContext.getAttribute(FrameworkServlet.SERVLET_CONTEXT_PREFIX+ "DispatcherServlet");
        return applicationContext.toString();
    }
}
