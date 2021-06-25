package com.xc.bootdemo.concept;

public abstract class Father {

    protected void invoke(){
        print();
    }

    protected void print(){
        System.out.println("I'm Father");
    }

}
