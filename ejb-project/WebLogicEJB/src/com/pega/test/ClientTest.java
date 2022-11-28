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
//        properties.put("java.naming.provider.url", "t3://0.0.0.0:7772");
//        properties.put("java.naming.provider.url", "t3://0.0.0.0:7878");


        try {
            InitialContext ctx = null;
            for(Integer i=0;i<10;++i){
                ctx = new InitialContext(properties);
                IService a = (IService)ctx.lookup("Service#com.pega.test.IService");
                System.out.println(i.toString()+" "+a.sayHello());
                IService b = (IService)ctx.lookup("Service#com.pega.test.IService");
                System.out.println(i.toString()+" "+b.sayHello());
                IService c = (IService)ctx.lookup("Service#com.pega.test.IService");
                System.out.println(i.toString()+" "+c.sayHello());
                System.out.println("------------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
