package com.anotaciones.ejemplo.models;

import com.anotaciones.ejemplo.JsonAttribute;

import java.time.LocalDate;

public class Producto {

    @JsonAttribute
    private String nombre;
    @JsonAttribute
    private long precio;

    private LocalDate fecha;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
