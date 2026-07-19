package com.springboottutorial;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    private OrderService order;

    public PaymentService(OrderService order){
        this.order = order;
    }

    public void pay(){
        System.out.println("Payment successful");
        order.getOrderDetails();
    }
}
