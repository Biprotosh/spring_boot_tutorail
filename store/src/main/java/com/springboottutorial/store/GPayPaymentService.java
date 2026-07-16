package com.springboottutorial.store;

public class GPayPaymentService implements PaymentService{

    @Override
    public void processPayment(double amount){
        System.out.println("G-Pay");
        System.out.println("Amount: " + amount);
    }
}
