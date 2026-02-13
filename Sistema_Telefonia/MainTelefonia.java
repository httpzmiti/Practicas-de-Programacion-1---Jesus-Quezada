/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.HolaMundo;

/**
 *
 * @author Raini
 */
public class MainTelefonia {
    public static void main(String[] args) {
        Plan plan1 = new Plan(200, 5.0, 20.0);
        Cliente cliente1 = new Cliente("Luis", "555-1234", plan1);

        // Consumo real
        Factura factura1 = new Factura(cliente1, 260, 6.5);
        factura1.generarFactura();
    }
}


