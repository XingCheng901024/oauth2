package com.xc.bootdemo.concept;

public class SonOne extends Father{

    public void call(){
        invoke();
    }

    @Override
    protected void print() {
        System.out.println("I'm SonOne");
    }
}
