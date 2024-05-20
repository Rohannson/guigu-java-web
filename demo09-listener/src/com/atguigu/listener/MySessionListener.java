package com.atguigu.listener;

import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

public class MySessionListener implements HttpSessionListener, HttpSessionAttributeListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        // Any Session context creation will trigger this method

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        // Any Session Context destroy will trigger this method

    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        HttpSessionAttributeListener.super.attributeAdded(se);
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {
        HttpSessionAttributeListener.super.attributeRemoved(se);
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {
        HttpSessionAttributeListener.super.attributeReplaced(se);
    }
}
