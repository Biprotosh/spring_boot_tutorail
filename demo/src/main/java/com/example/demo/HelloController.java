package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // it tells spring boot you can write your api endpoints here
public class HelloController {

    @GetMapping("/hello") // it tells which method to call when some write /hello endpoint
    public String hello(){
        return "<h1>Hello world</h1>";
    }

    @GetMapping("/bye") // it tells which method to call when some write /hello endpoint
    public String greetBye(){
        return "<h1>Bye world</h1>";
    }

}
