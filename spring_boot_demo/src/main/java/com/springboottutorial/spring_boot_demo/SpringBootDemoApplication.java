package com.springboottutorial.spring_boot_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

		/*
			Bad approach. We don't call the bean methods using context.
			We use application.properties to provide value externally without hardcoded the value into the actual code.
		 */
//		PaymentGateway paymentGateway = context.getBean(PaymentGateway.class);

//		paymentGateway.setType("Paytm");
//		paymentGateway.setRetryCount(5);

//		System.out.println(paymentGateway.getType());
//		System.out.println(paymentGateway.getRetryCount());
//		System.out.println(paymentGateway.isEnable());
//		System.out.println(paymentGateway.getTimeout());
	}

}
