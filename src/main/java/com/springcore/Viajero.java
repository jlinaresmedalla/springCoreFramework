package com.springcore;

public class Viajero {

    public Vehiculo vehiculo;

    public Viajero(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }

    public void comienzaViaje(){
        vehiculo.viajar();
    }

}
