package com.springboottutorial.notification;

import com.springboottutorial.NotificationService;
import org.springframework.stereotype.Component;

@Component // tells spring core that you manage this class
public class EmailService implements NotificationService {

    @Override
    public void sendNotification(){
        System.out.println("Email notification sent");
    }
}
