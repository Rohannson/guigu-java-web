package com.atguigu.listener;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class MyApplicationListener implements ServletContextListener, ServletContextAttributeListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext application = sce.getServletContext();
        System.out.println(application.hashCode() + "Application Context initialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext application = sce.getServletContext();
        System.out.println(application.hashCode() + "Application Context destroyed");
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent scae) {
        ServletContext application = scae.getServletContext();
        String key = scae.getName();
        Object value = scae.getValue();
        System.out.println(application.hashCode() + "application context increased " + key + ":" + value);
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent scae) {
        ServletContext application = scae.getServletContext();
        String key = scae.getName();
        Object value = scae.getValue();
        System.out.println(application.hashCode() + "application context removed " + key + ": " + value);
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent scae) {
        ServletContext application = scae.getServletContext();
        String key = scae.getName();
        Object value = scae.getValue(); // 获取的是旧的值
        Object newValue = application.getAttribute(key); // 获取最新的值
        System.out.println(application.hashCode() + "application context replaced " + key + ": " + value + " with: " + newValue);
    }
}
