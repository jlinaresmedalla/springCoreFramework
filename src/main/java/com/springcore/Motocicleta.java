package com.springcore;

import org.springframework.stereotype.Component;

@Component
public class Motocicleta implements Vehiculo{

    @Override
    public void viajar(){
        System.out.println("Viajando en motocicleta");
    }
}
