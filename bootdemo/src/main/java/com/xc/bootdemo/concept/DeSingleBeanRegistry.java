package com.xc.bootdemo.concept;

import org.springframework.beans.factory.ObjectFactory;

public class DeSingleBeanRegistry {

    public Object getSingleton(ObjectFactory<?> singletonFactory) {
        return singletonFactory.getObject();
    }

}
