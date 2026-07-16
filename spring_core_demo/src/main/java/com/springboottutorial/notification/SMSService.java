package com.springboottutorial.notification;

import com.springboottutorial.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // tells spring core that you manage this class
@Qualifier // it tells, SMSService type of bean is qualify for a certain dependency
public class SMSService implements NotificationService {

    @Override
    public void sendNotification(){
        System.out.println("SMS notification sent");
    }
}
