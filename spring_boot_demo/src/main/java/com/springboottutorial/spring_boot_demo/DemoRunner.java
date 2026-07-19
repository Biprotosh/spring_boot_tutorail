package com.springboottutorial.spring_boot_demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner implements ApplicationRunner {

    private PaymentGateway paymentGateway;

    public DemoRunner(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }

    /*
        this method runs automatically after starting the application
     */
    @Override
    public void run(ApplicationArguments args) throws Exception {
        paymentGateway.print();
    }
}
