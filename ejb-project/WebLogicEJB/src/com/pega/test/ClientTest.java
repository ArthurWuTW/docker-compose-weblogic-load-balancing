package com.pega.test;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.Properties;

public class ClientTest {
    public static void main(String[] args){
        System.out.println("123");
        Properties properties = new Properties();
        properties.put("java.naming.factory.initial", "weblogic.jndi.WLInitialContextFactory");
        properties.put("java.naming.provider.url", "t3://0.0.0.0:7772,0.0.0.0:7878");

        try {
            InitialContext ctx = new InitialContext(properties);
            IService a = (IService)ctx.lookup("Service#com.pega.test.IService");
            System.out.println(a.sayHello());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
