package com.springboottutorial.beanScopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class CartService {

    public CartService(){
        System.out.println("Cart service created");
    }
}

