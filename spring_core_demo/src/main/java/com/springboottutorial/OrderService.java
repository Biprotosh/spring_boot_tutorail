package com.springboottutorial;

import com.springboottutorial.notification.EmailService;
import com.springboottutorial.notification.SMSService;
import org.springframework.stereotype.Component;

@Component // tells spring core that you manage this class
public class OrderService {

//    EmailService emailNotification = new EmailService(); // tightly coupled with EmailService

    // But it is still tightly coupled because we are creating an object of a concrete class
//    NotificationService notification = new SMSService(); // loosely coupled, now we can use any notification services

    private NotificationService notification; // instance variable

//    public OrderService(NotificationService notification){
//        this.notification = notification;
//    }

    // setter is the another way of dependency injection
    public void setter(NotificationService notification){
        this.notification = notification;
    }

    public void placeOrder(){
        System.out.println("Order placed");
//        emailNotification.sendNotification();
        notification.sendNotification();
    }

}
