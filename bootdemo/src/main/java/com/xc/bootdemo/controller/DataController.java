package com.xc.bootdemo.controller;

import com.xc.bootdemo.actor.make.MakeVehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @Autowired
    MakeVehicle makeVehicle;

    @RequestMapping("data")
    public String dataSer(){
        StackTraceElement[] stackTraceElements = new RuntimeException().getStackTrace();
        return "hello Resource";
    }

    @RequestMapping("vehicle")
    public String vehicle(){
        return makeVehicle.makeVehicleByType("Bicycle", 10);
    }

}
