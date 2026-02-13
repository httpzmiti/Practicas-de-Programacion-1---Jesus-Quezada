/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.HolaMundo;

/**
 *
 * @author Raini
 */
public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;

    // Constructor 1: valores por defecto
    public Vehiculo() {
        this.placa = "SIN-PLACA";
        this.marca = "SIN-MARCA";
        this.modelo = "SIN-MODELO";
    }

    // Constructor 2: basico (solo placa)
    public Vehiculo(String placa) {
        this.placa = placa;
        this.marca = "SIN-MARCA";
        this.modelo = "SIN-MODELO";
    }

    // Constructor 3: completo
    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    // Metodo sobrecargado 1: solo km
    public double calcularMantenimiento(int km) {
        if (km < 0) return 0;

        // Regla simple: cada 10,000 km cuesta 50
        return (km / 10000) * 50.0;
    }

    // Metodo sobrecargado 2: km + tipo de servicio
    public double calcularMantenimiento(int km, String tipoServicio) {
        double base = calcularMantenimiento(km);

        if (tipoServicio == null) return base;

        if (tipoServicio.equalsIgnoreCase("basico")) {
            return base + 30.0;
        } else if (tipoServicio.equalsIgnoreCase("completo")) {
            return base + 100.0;
        }
        return base;
    }

    // Metodo sobrecargado 3: km + revision general
    public double calcularMantenimiento(int km, boolean revisionGeneral) {
        double base = calcularMantenimiento(km);

        if (revisionGeneral) {
            return base + 80.0;
        }
        return base;
    }
}


