package com.bibliotecapoo.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<RecursoBibliografico> recursosPrestados;
    
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.recursosPrestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    /** Intenta prestar un recurso; retorna true si tuvo éxito */
    public boolean prestarRecurso(RecursoBibliografico recurso) {
        if (recurso instanceof Revista) {
            Revista revista = (Revista) recurso;
            if (revista.prestar()) { // Intenta prestar la revista
                recursosPrestados.add(recurso);
                return true;
            }
        } else if (recurso instanceof Libro) {
            Libro libro = (Libro) recurso;
            if (!libro.isPrestado()) {
                libro.setPrestado(true); // Marca el libro como prestado
                recursosPrestados.add(recurso);
                return true;
            }
        }
        return false; 
    }

    /** Devuelve un recurso previamente prestado */
    public void devolverRecurso(RecursoBibliografico recurso) {
        if (recursosPrestados.contains(recurso)) {
            if (recurso instanceof Revista) {
                Revista revista = (Revista) recurso;
                revista.devolver();
            } else if (recurso instanceof Libro) {
                Libro libro = (Libro) recurso;
                libro.setPrestado(false); // Marca el libro como no prestado
            }
            recursosPrestados.remove(recurso);
        } else {
            System.out.println("El recurso no fue prestado por este usuario.");
        }
    }

    public void listarRecursosPrestados() {
        System.out.println("Recursos prestados de " + nombre + ":");
        for (RecursoBibliografico recurso : recursosPrestados) {
            recurso.mostrarDetalles();
        }
    }
}
