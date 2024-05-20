package com.atguigu.listener;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;

public class MyRequestListener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        // 任何一个请求域对象的销毁都会trigger this method
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        // Any
    }
}
