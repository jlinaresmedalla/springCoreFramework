package com.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Viajero {


    public Vehiculo vehiculo;
    @Autowired
    public Viajero(@Qualifier("motocicleta") Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }

    public void comienzaViaje(){
        vehiculo.viajar();
    }

}
