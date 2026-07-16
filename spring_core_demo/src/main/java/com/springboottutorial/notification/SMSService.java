package com.springboottutorial.notification;

import com.springboottutorial.NotificationService;
import org.springframework.stereotype.Component;

@Component // tells spring core that you manage this class
public class SMSService implements NotificationService {

    @Override
    public void sendNotification(){
        System.out.println("SMS notification sent");
    }
}
