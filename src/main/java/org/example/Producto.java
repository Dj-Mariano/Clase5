package org.example;

import java.time.LocalDate;

public class Producto {
    private String nombre;
    private LocalDate fechaDeAlta;
    private Double precio;
    private Integer cantidad;

    public Producto(String nombre, Double precio, Integer cantidad){
        this.nombre = nombre;
        this.fechaDeAlta = LocalDate.now();
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public String getNombre() {
        return nombre;
    }
    public LocalDate getFechaDeAlta() {
        return fechaDeAlta;
    }
    public Double getPrecio() {
        return precio;
    }
    public Integer getCantidad(){
        return cantidad;
    }
    public Double getPrecioTotal(){
        return precio*cantidad;
    }
}
