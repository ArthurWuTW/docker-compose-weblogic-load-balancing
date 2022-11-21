package com.pega.test;

public class Service implements IService{
    @Override
    public String sayHello() throws Exception {
        return "Hello World";
    }
}
