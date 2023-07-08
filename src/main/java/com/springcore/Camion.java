package com.springcore;

import org.springframework.stereotype.Component;

@Component
public class Camion implements Vehiculo{

    @Override
    public void viajar(){
        System.out.println("Viajando en camion");
    }
}
