/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.HolaMundo;

/**
 *
 * @author Raini
 */

/**
 * Representa un libro dentro de una biblioteca.
 */
public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    /**
     * Constructor principal.
     */
    public Libro(String titulo, String autor, String isbn, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = disponible;
    }

    // Getters (encapsulamiento: se accede por métodos públicos)
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    /**
     * Devuelve si el libro está disponible o no.
     * @return 
     */
    public boolean consultarDisponibilidad() {
        return disponible;
    }

    /**
     * Marca el libro como prestado (no disponible).
     */
    public void prestarLibro() {
        this.disponible = false;
    }

    /**
     * Marca el libro como devuelto (disponible).
     */
    public void devolverLibro() {
        this.disponible = true;
    }
}
