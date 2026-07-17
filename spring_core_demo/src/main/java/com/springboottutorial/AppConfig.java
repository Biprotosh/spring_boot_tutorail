package com.springboottutorial;

import com.springboottutorial.beanScopes.CartService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // tells spring core, it is a configuration class, where we set the rules of how IOC manages beans
@ComponentScan("com.springboottutorial") // tells which classes should managed by spring core
// if we only write @ComponentScan then it only search inside the package where AppConfig stored
public class AppConfig {

    @Bean // tells spring call this method and the objects it creates store those in the container
    // this method will call by spring so that it can take the first step and start managing beans
    public UserService createUser(){
        return new UserService("Charon", 25);
    }

    /*
        Bean scope example. In the methods getCart1(), getCart2() create 2 beans even if the scope is singleton because
        as we know this scope create beans per bean definition and both the bean are singleton by itself. And after the
        IOC container is up it also creates a bean because of eager initialization.
     */
    @Bean
    public CartService getCart1(){
        return new CartService();
    }

    @Bean
    public CartService getCart2(){
        return new CartService();
    }
}
