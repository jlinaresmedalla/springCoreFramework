package com.springcore;

public class Cliente {
    public static void main(String[] args) {
        //De esta forma se puede cambiar el vehiculo sin tener que cambiar el codigo
        //y estariamos aplicando el principio de inversion de dependencias
        // ya no seria tighly coupled ( estrechamente acoplado ) sino loosely coupled ( debilmente acoplado )

        Viajero viajero1 = new Viajero(new Motocicleta());
        Viajero viajero2 = new Viajero(new Camion());
        Viajero viajero3 = new Viajero(new Auto());

        viajero1.comienzaViaje();
        viajero2.comienzaViaje();
        viajero3.comienzaViaje();
    }

}
