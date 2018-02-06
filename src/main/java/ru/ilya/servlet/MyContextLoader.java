package ru.ilya.servlet;

import org.springframework.beans.factory.parsing.BeanDefinitionParsingException;

import javax.servlet.ServletContextEvent;

public class MyContextLoader extends org.springframework.web.context.ContextLoaderListener {
    @Override
    public void contextInitialized(ServletContextEvent event) {
        try {
            super.contextInitialized(event);
        } catch (BeanDefinitionParsingException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
