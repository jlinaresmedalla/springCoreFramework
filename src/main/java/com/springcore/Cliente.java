package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cliente {
    public static void main(String[] args) {

        // - ApplicationContext es una interfaz que implementa BeanFactory, lo que hace es generar el
        //   contenedor de beans, es decir, Spring IoC Container.
        // - Configura y maneja los beans segun las indicaciones de la clase de configuracion (AppConfiguracion)
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguracion.class);

        // - Obtiene el bean de la clase Viajero del contenedor de beans (Spring IoC Container)
        Viajero viajero1 = applicationContext.getBean(Viajero.class);
        viajero1.comienzaViaje();

    }
}
