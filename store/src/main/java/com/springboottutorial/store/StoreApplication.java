package com.springboottutorial.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
//        SpringApplication.run(StoreApplication.class, args);

//        OrderService orderService = new OrderService(new PaytmPaymentService());
        OrderService orderService = new OrderService();

        // not recommended, because what if we forget to set it. It will give NullPointer exception
        orderService.setPaymentService(new PaytmPaymentService());

        orderService.placeOrder();
    }
}
