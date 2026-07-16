package com.springboottutorial.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // we are telling spring that this class should be used as a web controller for receiving web traffic
public class HomeController {
    /**
     * @Value() fetching the name in runtime from resources/application.yaml
     * and inject the name in appName
     */
    @Value("${spring.application.name}")
    private String appName;

    /**
     * To send a request to root of our website we want this index() method to be called
     * using the annotation we send a request to root of out website
     * to send a request to a different endpoint we can write something like this @RequestMapping("/about")
     */
    @RequestMapping("/")
    public String index(){
        System.out.println("App name: " + appName);
        return "index.html"; // returning the view we want to show to our website
    }
}
