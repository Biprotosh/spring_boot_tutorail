package com.springboottutorial;

import com.springboottutorial.notification.EmailService;
import com.springboottutorial.notification.SMSService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
//        NotificationService notification = new SMSService();

//        OrderService order = new OrderService(notification); // injecting notification dependency to OrderService
//        OrderService order = new OrderService(); // using setter
//        order.setter(notification);
//        order.placeOrder();


        // ------------------> Spring core <------------------

        // start IOC container using annotation based configuration
        ApplicationContext context = new AnnotationConfigApplicationContext();
    }
}
