package com.pega.test;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless(mappedName = "Service")
public class Service implements IService{
    @Override
    public String sayHello() throws Exception {
        return "Hello World";
    }
}
