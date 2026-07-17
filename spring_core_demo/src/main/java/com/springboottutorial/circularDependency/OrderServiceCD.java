package com.springboottutorial.circularDependency;

import org.springframework.stereotype.Component;

//@Component
public class OrderServiceCD {
    private PaymentServiceCD payment;

    OrderServiceCD(PaymentServiceCD payment){
        this.payment = payment;
    }

    public void placeOrder(){
        payment.pay();
        System.out.println("Order placed");
    }

    public void getOrderDetails(){
        System.out.println("Order details");
    }
}


