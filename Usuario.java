/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.HolaMundo;

/**
 *
 * @author Raini
 */
import java.util.ArrayList;
import java.util.List;

/**
 * Representa un usuario de la biblioteca.
 */
public class Usuario {
    private static int contadorId = 1;

    private String nombre;
    private int id; // ID único
    private List<Libro> librosPrestados;

    /**
     * Constructor principal: crea el usuario y asigna un ID único automáticamente.
     */
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.id = contadorId++;
        this.librosPrestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    /**
     * Devuelve una copia de la lista para no exponer la lista interna.
     */
    public List<Libro> getLibrosPrestados() {
        return new ArrayList<>(librosPrestados);
    }

    /**
     * Intenta prestar un libro:
     * - Si está disponible, lo marca como prestado y lo agrega a la colección del usuario.
     * - Si no, no hace el préstamo.
     */
    public boolean prestarLibro(Libro libro) {
        if (libro == null) return false;

        if (libro.consultarDisponibilidad()) {
            libro.prestarLibro();
            librosPrestados.add(libro);
            return true;
        }
        return false;
    }

    /**
     * Devuelve un libro:
     * - Si el usuario lo tenía prestado, lo elimina de su lista y lo marca como disponible.
     */
    public boolean devolverLibro(Libro libro) {
        if (libro == null) return false;

        if (librosPrestados.remove(libro)) {
            libro.devolverLibro();
            return true;
        }
        return false;
    }

    /**
     * Consulta disponibilidad de un libro (delegado al Libro).
     */
    public boolean consultarDisponibilidad(Libro libro) {
        if (libro == null) return false;
        return libro.consultarDisponibilidad();
    }
}
