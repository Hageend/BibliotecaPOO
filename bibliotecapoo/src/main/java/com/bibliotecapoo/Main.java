package com.bibliotecapoo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}



//HERENCIA
// Clase base 
abstract class RecursoBibliografico {
    protected String titulo;

    public RecursoBibliografico(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public abstract void mostrarDetalle();
}

// Subclase Libro
class Libro extends RecursoBibliografico {
    private String autor;
    private String ISBN;
    private boolean prestado;

    public Libro(String titulo, String autor, String ISBN, boolean prestado) {
        super(titulo);
        this.autor = autor;
        this.ISBN = ISBN;
        this.prestado = prestado;
    }

    public void mostrarDetalle() {
        System.out.println("Libro:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Prestado: " + (prestado ? "Sí" : "No"));
    }
}

// Subclase Revista
class Revista extends RecursoBibliografico {
    private String ISSN;
    private int anioPublicacion;
    private int ejemplares;
  //aun por completar
}


