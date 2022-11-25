package com.pega.test;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.Properties;

public class ClientTest {
    public static void main(String[] args){
        System.out.println("123");
        Properties properties = new Properties();
        properties.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
        properties.put(Context.PROVIDER_URL, "t3://localhost:7001");

        try {
            InitialContext ctx = new InitialContext(properties);
            IService a = (IService)ctx.lookup("Service#com.pega.test.IService");
            System.out.println(a.sayHello());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
