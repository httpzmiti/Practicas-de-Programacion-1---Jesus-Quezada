/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.HolaMundo;

/**
 *
 * @author Raini
 */
import java.time.LocalDate;

public class MainBiblioteca {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El Quijote", "Cervantes", "ISBN-001", true);
        Usuario usuario1 = new Usuario("Ana");

        System.out.println("Disponible antes del prestamo: " 
            + (libro1.consultarDisponibilidad() ? "Si" : "No"));

        boolean prestado = usuario1.prestarLibro(libro1);
        if (prestado) {
            Prestamo p = new Prestamo(LocalDate.now(), usuario1, libro1);
            System.out.println("Prestamo registrado en fecha: " + p.getFecha());
        } else {
            System.out.println("No se pudo prestar el libro.");
        }

        System.out.println("Disponible despues del prestamo: " 
            + (usuario1.consultarDisponibilidad(libro1) ? "Si" : "No"));

        System.out.println("Libros prestados por " + usuario1.getNombre() + ": " 
            + usuario1.getLibrosPrestados().size());

        boolean devuelto = usuario1.devolverLibro(libro1);
        System.out.println("Devuelto: " + (devuelto ? "Si" : "No"));

        System.out.println("Disponible despues de devolucion: " 
            + (libro1.consultarDisponibilidad() ? "Si" : "No"));
    }
}



