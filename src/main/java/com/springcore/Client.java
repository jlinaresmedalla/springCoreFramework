package com.springcore;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        EmailService emailService = appContext.getBean(EmailService.class);
        emailService.sendEmail();
    }
}
