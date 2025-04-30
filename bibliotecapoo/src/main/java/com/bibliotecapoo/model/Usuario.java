package com.bibliotecapoo.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String dni;
    private List<RecursoBibliografico> recursosPrestados;
    
    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.recursosPrestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    /*TODO:* Intenta prestar un recurso; retorna true si tuvo éxito */

    /*TODO:* Devuelve un recurso previamente prestado */

    public void listarRecursosPrestados() {
        System.out.println("Recursos prestados de " + nombre + ":");
        for (RecursoBibliografico recurso : recursosPrestados) {
            recurso.mostrarDetalles();
        }
    }
}
