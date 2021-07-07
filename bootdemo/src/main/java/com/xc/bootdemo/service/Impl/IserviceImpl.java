package com.xc.bootdemo.service.Impl;

import com.xc.bootdemo.service.Iservice;
import org.springframework.stereotype.Service;

@Service
public class IserviceImpl implements Iservice {
    @Override
    public void print() {
        System.out.println("hello world;");
    }
}
