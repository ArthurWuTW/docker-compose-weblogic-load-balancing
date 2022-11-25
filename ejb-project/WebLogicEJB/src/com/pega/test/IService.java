package com.pega.test;

import javax.ejb.Remote;

@Remote
public interface IService {

    public String sayHello() throws Exception;
}
