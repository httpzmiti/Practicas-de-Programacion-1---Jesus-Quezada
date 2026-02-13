/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.HolaMundo;

/**
 *
 * @author Raini
 */
public class MainVehiculo {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo(); // por defecto
        Vehiculo v2 = new Vehiculo("ABC-123"); // basico
        Vehiculo v3 = new Vehiculo("XYZ-999", "Toyota", "Corolla"); // completo

        System.out.println("v1 -> placa: " + v1.getPlaca() + ", marca: " + v1.getMarca() + ", modelo: " + v1.getModelo());
        System.out.println("v2 -> placa: " + v2.getPlaca() + ", marca: " + v2.getMarca() + ", modelo: " + v2.getModelo());
        System.out.println("v3 -> placa: " + v3.getPlaca() + ", marca: " + v3.getMarca() + ", modelo: " + v3.getModelo());

        int km = 25000;

        System.out.println("Costo mantenimiento (solo km): " + v3.calcularMantenimiento(km));
        System.out.println("Costo mantenimiento (km + tipo basico): " + v3.calcularMantenimiento(km, "basico"));
        System.out.println("Costo mantenimiento (km + tipo completo): " + v3.calcularMantenimiento(km, "completo"));
        System.out.println("Costo mantenimiento (km + revision general): " + v3.calcularMantenimiento(km, true));
    }
}


