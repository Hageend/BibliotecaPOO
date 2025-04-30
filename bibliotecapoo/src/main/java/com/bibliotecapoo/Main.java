package com.bibliotecapoo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

//Clase base
public abstract class RecursoBibliografico {
    private String titulo;

    public RecursoBibliografico(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract void mostrarDetalle();
}
