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

/**
 * Registra un préstamo: fecha, usuario y libro.
 */
public class Prestamo {
    private LocalDate fecha;
    private Usuario usuario;
    private Libro libro;

    /**
     * Constructor principal.
     */
    public Prestamo(LocalDate fecha, Usuario usuario, Libro libro) {
        this.fecha = fecha;
        this.usuario = usuario;
        this.libro = libro;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Libro getLibro() {
        return libro;
    }
}

