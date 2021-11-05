package com.xc.bootdemo.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.Map;

@Component
public class SpringFactory implements ApplicationContextAware {
    private static ApplicationContext applicationContext = null;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if(SpringFactory.applicationContext == null){
            SpringFactory.applicationContext  = applicationContext;
        }
        //LinkedHashMap按放入的顺序返回
        Map<String, Object> returnMap=new LinkedHashMap<>();
        String[] arr = SpringFactory.getAllBeanNames();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+"---"+arr[i]);
            returnMap.put((i+1)+"", arr[i]);
        }
        //System.out.println(returnMap);
    }
    //获取所有在ioc容器里面的bean的名字
    public static String[] getAllBeanNames(){
        return applicationContext.getBeanNamesForType(Object.class);
    }
}
