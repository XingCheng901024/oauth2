package com.xc.bootdemo.controller;

import com.xc.bootdemo.actor.make.MakeVehicle;
import com.xc.bootdemo.executor.ServiceLocator;
import com.xc.bootdemo.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DataController {

    @Autowired
    MakeVehicle makeVehicle;
    @Autowired
    ServiceLocator serviceLocator;

    @RequestMapping("data")
    public String dataSer(){
        StackTraceElement[] stackTraceElements = new RuntimeException().getStackTrace();
        return "hello Resource";
    }

    @RequestMapping("vehicle")
    public String vehicle(){
        return makeVehicle.makeVehicleByType("Bicycle", 10);
    }

    @RequestMapping("localImplments")
    public void localImplments(){
        Map<String, Iservice> map = serviceLocator.getMap();
        System.out.println(map);
    }

}
