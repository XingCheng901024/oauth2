package com.xc.bootdemo.concept;

public class SonTwo extends Father{

    public void call(){
        invoke();
    }

    @Override
    protected void print() {
        System.out.println("I'm SonTwo");
    }
}
