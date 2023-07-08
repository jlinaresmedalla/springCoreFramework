package com.springcore;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Auto implements Vehiculo{

        @Override
        public void viajar(){
            System.out.println("Viajando en auto");
        }
}
