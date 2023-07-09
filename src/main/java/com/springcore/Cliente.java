package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

public class Cliente {
    public static void main(String[] args) {

        //Crea el IoC Container, basa su configuracion en la clase AppConfig
        ApplicationContext appcontext = new AnnotationConfigApplicationContext(AppConfig.class);

        //Maneja el ciclo de vida de los beans mediante anotaciones
        Viajero viajero = appcontext.getBean(Viajero.class);
        viajero.comienzaViaje();

        DemoService demoService = appcontext.getBean(DemoService.class);
        DemoRepository demoRepository = appcontext.getBean(DemoRepository.class);
        DemoController demoController = appcontext.getBean(DemoController.class);

        demoController.probando();
        demoRepository.probando();
        demoService.probando();

    }

}
