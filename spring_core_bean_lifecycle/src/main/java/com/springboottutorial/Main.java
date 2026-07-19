package com.springboottutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        OrderService order = context.getBean(OrderService.class);
//        order.placeOrder();

        // Initialization callback
        CartService cart = context.getBean(CartService.class);
        cart.addToCart();
        System.out.println(cart.getValue(1));

        context.close();
    }
}

/*
    We used ConfigurableApplicationContext because it has close() method but in ApplicationContext interface we don't
    have the method and ConfigurableApplicationContext is the child interface of ApplicationContext
 */
