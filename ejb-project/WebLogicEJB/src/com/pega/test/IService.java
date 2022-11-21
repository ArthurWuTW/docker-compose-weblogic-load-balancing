package com.pega.test;

interface IService {
    interface IServiceLocal extends IService {

    }

    public String sayHello() throws Exception;
}
