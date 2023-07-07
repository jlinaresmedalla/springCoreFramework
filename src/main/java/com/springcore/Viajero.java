package com.springcore;

public class Viajero {

    public Vehiculo vehiculo;

    public Viajero(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }

    public void comienzaViaje(){
        System.out.println("El viajero está ");
        vehiculo.viajar();
    }

}
