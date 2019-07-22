package com.jt.listener;

import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
@Configuration
public class MyServletContextListener  implements ServletContextListener{
    @Override
    public void contextInitialized(ServletContextEvent sce) {
       String app= sce.getServletContext().getContextPath();
       sce.getServletContext().setAttribute("app",app);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
