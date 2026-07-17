package com.springboottutorial;

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
}
