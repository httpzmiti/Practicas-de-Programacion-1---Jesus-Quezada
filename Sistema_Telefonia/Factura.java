/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.HolaMundo;

/**
 *
 * @author Raini
 */
public class Factura {
    private Cliente cliente;
    private int minutosUsados;
    private double datosGbUsados;

    // Se guardan para mostrarlos en el resumen
    private double cargosExtras;
    private int minutosExtra;
    private double datosExtra;

    // Tarifas simples por exceso (ejemplo)
    private static final double COSTO_MINUTO_EXTRA = 0.10;
    private static final double COSTO_GB_EXTRA = 2.00;

    public Factura(Cliente cliente, int minutosUsados, double datosGbUsados) {
        this.cliente = cliente;
        this.minutosUsados = minutosUsados;
        this.datosGbUsados = datosGbUsados;

        this.cargosExtras = 0.0;
        this.minutosExtra = 0;
        this.datosExtra = 0.0;
    }

    public double calcularMontoTotal() {
        Plan plan = cliente.getPlan();

        // Calcular exceso de minutos
        int excesoMin = minutosUsados - plan.getMinutosIncluidos();
        if (excesoMin > 0) {
            minutosExtra = excesoMin;
        } else {
            minutosExtra = 0;
        }

        // Calcular exceso de datos
        double excesoDatos = datosGbUsados - plan.getDatosGbIncluidos();
        if (excesoDatos > 0) {
            datosExtra = excesoDatos;
        } else {
            datosExtra = 0.0;
        }

        // Calcular cargos extras
        cargosExtras = (minutosExtra * COSTO_MINUTO_EXTRA) + (datosExtra * COSTO_GB_EXTRA);

        return plan.getPrecioMensual() + cargosExtras;
    }

    public void generarFactura() {
        Plan plan = cliente.getPlan();
        double total = calcularMontoTotal();

        System.out.println("===== FACTURA =====");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Telefono: " + cliente.getNumeroTelefonico());

        System.out.println("--- Plan ---");
        System.out.println("Minutos incluidos: " + plan.getMinutosIncluidos());
        System.out.println("Datos incluidos (GB): " + plan.getDatosGbIncluidos());
        System.out.println("Precio mensual: " + plan.getPrecioMensual());

        System.out.println("--- Consumo ---");
        System.out.println("Minutos usados: " + minutosUsados);
        System.out.println("Datos usados (GB): " + datosGbUsados);

        // Mostrar Si/No en vez de true/false
        System.out.println("--- Exceso ---");
        System.out.println("Exceso de minutos: " + (minutosExtra > 0 ? "Si" : "No") + " (+" + minutosExtra + ")");
        System.out.println("Exceso de datos: " + (datosExtra > 0 ? "Si" : "No") + " (+" + datosExtra + " GB)");

        System.out.println("--- Cargos ---");
        System.out.println("Cargos extras: " + cargosExtras);
        System.out.println("TOTAL A PAGAR: " + total);
    }
}