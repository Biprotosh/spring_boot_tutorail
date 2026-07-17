package com.springboottutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService order = context.getBean(OrderService.class);

    }
}

/*
    Circular Dependency happens when both the classes depend on each other so spring cant decide which one to create
    first. Can be solved using setter/field injection or with lazy initialization but circular dependency is bad coding
    practice so we avoid it and solve it by deviding the responsibilities. Like in the code after payment is done inside
    placeOrder() method we can call getOrderDetails().

    Using setter/field injection we solve it even if the field is private because as the bean has the metadata of a class
    in the bean definitions spring can inject dependencies to the private fields as well.

    Using @Lazy initialization, it only creates object when there is a need. And if we use @Lazy in the PaymentService
    class as well as write @Lazy before PaymentService payment in OrderService constructor (@Lazy PaymentService payment),
    spring will first create OrderService bean and will create a proxy bean of PaymentService which is basically a fake
    PaymentService. After the creation of OrderService when use PaymentService method in placeOrder() on that time spring
    will create the PaymentService bean in the container.
*/