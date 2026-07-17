package com.springboottutorial.circularDependency;

import org.springframework.stereotype.Component;

//@Component
public class PaymentServiceCD {

    private OrderServiceCD order;

    public PaymentServiceCD(OrderServiceCD order){
        this.order = order;
    }

    public void pay(){
        System.out.println("Payment successful");
        order.getOrderDetails();
    }
}
