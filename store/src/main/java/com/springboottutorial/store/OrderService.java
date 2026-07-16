package com.springboottutorial.store;

public class OrderService {
    private PaymentService paymentService;

    // constructor injections is the preferred way to inject a dependency in a class
//    public OrderService(PaymentService paymentService){
//        this.paymentService = paymentService;
//    }

    // setter injection to inject a dependency
    public void setPaymentService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void placeOrder(){
//        System.out.println("problem");
        paymentService.processPayment(10);
    }
}
