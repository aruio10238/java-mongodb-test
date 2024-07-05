package com.aruio.mongodb.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;

/**
 * @Description TODO
 * @Date 2024/7/5 15:57
 * @Created by 10574
 */
public class SpringUtils implements ApplicationContextAware {
    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringUtils.context = applicationContext;
    }

    public static void publishEvent(ApplicationEvent event) {
        context.publishEvent(event);
    }
}
