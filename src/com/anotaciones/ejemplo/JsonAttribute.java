package com.anotaciones.ejemplo;


//Agregamos atributos que usamos

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)

public @interface JsonAttribute {

    String nombre() default "";

}
