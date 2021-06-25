package com.xc.bootdemo.actor.make;

import com.xc.bootdemo.actor.vehicle.Make;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class MakeVehicle implements IMakeVehicle {

    /*@Override
    public String makeVehicleByType(String vehicleType,Integer number){
        return "SUCCESS";
    }*/


    /**
     * 注入所有的Make方法
     */
    @Autowired
    private Map<String, Make> makeMap;

    @Override
    public String makeVehicleByType(String vehicleType,Integer number){
        //通过车辆类型字段判断当前引用的是哪个子类
        Make make = getMake(vehicleType);
        //通过不同子类的不同doing方法返回不同结果
        String result = make.makeVehicleDoing(number);
        System.out.println(result);
        if(result != null){
            return "SUCCESS";
        }else{
            return "ERROR";
        }
    }

    private Make getMake(String vehicleType){
        return makeMap.get(vehicleType);
    }

}