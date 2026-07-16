package com.springboottutorial.store;

public class PaytmPaymentService implements PaymentService{

    @Override
    public void processPayment(double amount){
        System.out.println("Paytm");
        System.out.println("Amount: " + amount);
    }
}
