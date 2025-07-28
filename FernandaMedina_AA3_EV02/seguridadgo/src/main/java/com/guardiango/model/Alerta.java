/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.guardiango.model;

/**
 * Modelo de datos para una Alerta.
 */
public class Alerta {
    private int id;
    private String descripcion;
    private String placa;
    private String fecha;

    // Constructor vacío
    public Alerta() {}

    // Constructor con parámetros
    public Alerta(int id, String descripcion, String placa, String fecha) {
        this.id = id;
        this.descripcion  = descripcion ;
        this.placa = placa;
        this.fecha = fecha;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion () {
        return descripcion ;
    }

    public void setdescripcion (String descripcion ) {
        this.descripcion  = descripcion ;
    }

    public String getPlaca() {
        return placa;
    }

    public void setplaca(String placa) {
        this.placa = placa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}

