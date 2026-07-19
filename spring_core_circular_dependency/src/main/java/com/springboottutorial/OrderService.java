package com.springboottutorial;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private PaymentService payment;

    OrderService(PaymentService payment){
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


