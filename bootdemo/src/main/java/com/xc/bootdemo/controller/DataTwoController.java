package com.xc.bootdemo.controller;

import com.xc.bootdemo.actor.make.MakeVehicle;
import com.xc.bootdemo.executor.ServiceLocator;
import com.xc.bootdemo.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/*
@RestController
public class DataTwoController {

    @Autowired
    MakeVehicle makeVehicle;
    @Autowired
    ServiceLocator serviceLocator;

    @RequestMapping("dataTwo")
    public String dataSerTwo(){
        StackTraceElement[] stackTraceElements = new RuntimeException().getStackTrace();
        return "hello Resource";
    }

    @RequestMapping("vehicleTwo")
    public String vehicleTwo(){
        return makeVehicle.makeVehicleByType("Bicycle", 10);
    }

    @RequestMapping("localImplmentsTwo")
    public void localImplmentsTwo(){
        Map<String, Iservice> map = serviceLocator.getMap();
        System.out.println(map);
    }
}
*/
