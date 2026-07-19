package com.springboottutorial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springboottutorial")
public class AppConfig {

//    @Bean(initMethod = "start", destroyMethod = "exit")
//    public CartService getCart(){
//        return new CartService();
//    }
}
