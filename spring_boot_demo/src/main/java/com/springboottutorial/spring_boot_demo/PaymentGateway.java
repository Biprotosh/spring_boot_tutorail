package com.springboottutorial.spring_boot_demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {
    private String type;

    // we can also write this. Uses auto wiring. Also accepts default value -> @Value("${paymentGateway.type:Paytm}")
    // If we have a lot of properties the @Value can be error-prone or it can happen that we map different value to different field
    @Value("${paymentGateway.retryCount:5}")
    private int retryCount;

    private PaymentGatewayProperties paymentGatewayProperties;

//    public PaymentGateway(@Value("${paymentGateway.type}") String type
//                            /*, @Value("${paymentGateway.retryCount}") int retryCount*/) {
//        this.type = type;
////        this.retryCount = retryCount;
//    }

    public PaymentGateway(PaymentGatewayProperties paymentGatewayProperties){
        this.paymentGatewayProperties = paymentGatewayProperties;
    }

    public String getType() {
        return paymentGatewayProperties.getType();
    }

    public int getRetryCount() {
        return paymentGatewayProperties.getRetryCount();
    }

    public boolean isEnable(){
        return paymentGatewayProperties.isEnable();
    }

    public int getTimeout(){
        return paymentGatewayProperties.getTimeout();
    }

    public void print(){
        System.out.println(getType());
        System.out.println(getRetryCount());
        System.out.println(isEnable());
        System.out.println(getTimeout());
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }
}
