package com.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguracion {
    @Bean
    public Vehiculo motocicleta(){
        return new Motocicleta();
    }

    @Bean
    public Vehiculo camion(){
        return new Camion();
    }

    @Bean
    public Vehiculo auto(){
        return new Auto();
    }

    @Bean
    public Viajero viajero(){
        return new Viajero(camion());
    }
}
