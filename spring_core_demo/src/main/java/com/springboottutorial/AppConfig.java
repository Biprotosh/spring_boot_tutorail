package com.springboottutorial;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // tells spring core, it is a configuration class, where we set the rules of how IOC manages beans
@ComponentScan("com.springboottutorial") // tells which classes should managed by spring core
// if we only write @ComponentScan then it only search inside the package where AppConfig stored
public class AppConfig {

}
