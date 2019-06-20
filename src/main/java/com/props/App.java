package com.props;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App //implements CommandLineRunner
{
	@Autowired
	MyProperties myProps;
	
	@Autowired
	OracleProperties oracleProps; 
	
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }

	public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
		System.out.println("lang is "+myProps.getName() +" version is "+myProps.getVersion()+ " messaging used "+myProps.isMessagingused());
		System.out.println("Oracle Props ="+oracleProps.toString());
	}
}
