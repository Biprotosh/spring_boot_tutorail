package com.springboottutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.springboottutorial.circularDependency.OrderServiceCD;


public class Main {
    static void main() {
//        NotificationService notification = new SMSService();

//        OrderService order = new OrderService(notification); // injecting notification dependency to OrderService
//        OrderService order = new OrderService(); // using setter
//        order.setter(notification);
//        order.placeOrder();


        // ------------------> Spring core <------------------

        // start IOC container using annotation based configuration and get the rules from the reflection of AppConfig
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        /*
            As the above line executed IOC container created the beans for our classes which have @Component annotation.
            Now we don't have to create an object using new keyword, we just call the object
         */

//        EmailService emailNotification = context.getBean(EmailService.class);
//        emailNotification.sendNotification();

//        OrderService order = context.getBean(OrderService.class);
//        order.placeOrder();
//
//        UserService user = context.getBean(UserService.class);
//        System.out.println(user.getName());


        // ------------------> Circular Dependency <------------------
        // we solve this by refactoring the code and dividing the responsibilities, because circular dependency
        // always need to be avoided even if we can refactor it
        
//        OrderServiceCD order = context.getBean(OrderServiceCD.class);
    }
}
