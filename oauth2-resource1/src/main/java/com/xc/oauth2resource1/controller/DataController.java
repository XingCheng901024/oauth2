package com.xc.oauth2resource1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @RequestMapping("dataSer")
    public String dataSer(){
        return "hello Resource";
    }

}
