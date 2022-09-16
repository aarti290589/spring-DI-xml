package com.spring.dependency_injection.di_by_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.spring.dependency_injection.di_by_xml.client.SmartKitchenClientInterface;
import com.spring.dependency_injection.di_by_xml.service.SmartKitchenServiceInterface;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        SmartKitchenServiceInterface sk1 = (SmartKitchenServiceInterface) ac.getBean("smartKitchen1");
        SmartKitchenClientInterface sci1 = (SmartKitchenClientInterface) ac.getBean("smartClient1");
        SmartKitchenServiceInterface sk2 = (SmartKitchenServiceInterface) ac.getBean("smartKitchen2");
        SmartKitchenClientInterface sci2 = (SmartKitchenClientInterface) ac.getBean("smartClient2");
        System.out.println(sci1.turnOn());
        System.out.println(sci1.turnOff());
        System.out.println(sci1.timer());
        System.out.println(sci2.turnOn());
        System.out.println(sci2.turnOff());
        System.out.println(sci2.timer());
        
    }
}
