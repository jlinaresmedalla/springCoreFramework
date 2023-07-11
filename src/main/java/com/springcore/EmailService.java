package com.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    DataSource dataSource;
    @Autowired
    public EmailService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void sendEmail(){
        for (String email : dataSource.getEmail()) {
            System.out.println("Sending email to: " + email);
        }
    }

}
