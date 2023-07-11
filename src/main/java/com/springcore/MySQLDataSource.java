package com.springcore;

import org.springframework.stereotype.Component;

@Component

public class MySQLDataSource implements DataSource {
    @Override
    public String[] getEmail(){
        return new String[]{"pepito@gmail.com","juanito@gmail.com","messi@gmail.com","pele@gmail.com"};
    }


}
