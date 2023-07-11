package com.springcore;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PostgreSQLDataSource implements DataSource{

    @Override
    public String[] getEmail(){
        return new String[]{"pedrito@gmail.com","roger@gmail.com","maradona@gmail.com","ronaldo@gmail.com"};
    }
}
