/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.HolaMundo;

/**
 *
 * @author Raini
 */
public class Plan {
    private int minutosIncluidos;
    private double datosGbIncluidos;
    private double precioMensual;

    public Plan(int minutosIncluidos, double datosGbIncluidos, double precioMensual) {
        this.minutosIncluidos = minutosIncluidos;
        this.datosGbIncluidos = datosGbIncluidos;
        this.precioMensual = precioMensual;
    }

    public int getMinutosIncluidos() {
        return minutosIncluidos;
    }

    public double getDatosGbIncluidos() {
        return datosGbIncluidos;
    }

    public double getPrecioMensual() {
        return precioMensual;
    }
}


