package com.springboottutorial.notification;

import com.springboottutorial.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // tells spring core that you manage this class
//@Primary // if we have multiple beans of type NotificationService then give priority to the class which have primary
@Qualifier
public class EmailService implements NotificationService {

    @Override
    public void sendNotification(){
        System.out.println("Email notification sent");
    }
}
