package com.xc.bootdemo.concept;

public class Test {

    public static void main(String[] args) {
        SonOne sonOne = new SonOne();
        sonOne.call();
        DeSingleBeanRegistry deSingleBeanRegistry = new DeSingleBeanRegistry();
        deSingleBeanRegistry.getSingleton(()->{
            return new Object();
        });
    }

}
