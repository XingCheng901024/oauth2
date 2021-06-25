package com.xc.bootdemo.actor.vehicle;

import org.springframework.stereotype.Component;

@Component("Bicycle")
public class BicycleMake extends AbstractMake {

    @Override
    public String getDynamicSystem(){
        return "踏板和链条";
    }

    @Override
    public String getAppearance(){
        return "炭纤维车架";
    }

    @Override
    public Integer getWheelNumber(Integer carNumber){
        return carNumber*2;
    }

}