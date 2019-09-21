package com.acharya.FIFA;

import org.springframework.beans.factory.BeanFactory;

public class App 
{
    public static void main( String[] args )
    {		
    	BeanFactory factory = new BeanFactory("Spring.xml");
    	GOATS obj = (GOATS) factory.getBean("Something");
        obj.golazzo();
    }
}
