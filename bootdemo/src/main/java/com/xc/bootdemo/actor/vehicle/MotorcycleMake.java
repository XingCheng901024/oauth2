package com.xc.bootdemo.actor.vehicle;

import org.springframework.stereotype.Component;

@Component("Motorcycle")
public class MotorcycleMake extends AbstractMake {

    @Override
    public String getDynamicSystem(){
        return "Yamaha发动机";
    }

    @Override
    public String getAppearance(){
        return "铝镁合金摩托车车架";
    }

    @Override
    public Integer getWheelNumber(Integer carNumber){
        return carNumber*2;
    }

}
