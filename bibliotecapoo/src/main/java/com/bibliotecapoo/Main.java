package com.bibliotecapoo;

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

    @Override
    public void mostrarDetalle() {
        System.out.println("Libro:");
        System.out.println("  Título: " + getTitulo());
        System.out.println("  Autor: " + autor);
        System.out.println("  ISBN: " + ISBN);
        System.out.println("  Prestado: " + (prestado ? "Sí" : "No"));
    }
}

// Subclase Revista
class Revista extends RecursoBibliografico {
    private String ISSN;
    private int anioPublicacion;
    private int ejemplares;

    public Revista(String titulo, String ISSN, int anioPublicacion, int ejemplares) {
        super(titulo);
        this.ISSN = ISSN;
        this.anioPublicacion = anioPublicacion;
        this.ejemplares = ejemplares;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Revista:");
        System.out.println("  Título: " + getTitulo());
        System.out.println("  ISSN: " + ISSN);
        System.out.println("  Año de publicación: " + anioPublicacion);
        System.out.println("  Ejemplares disponibles: " + ejemplares);
    }
}

// Clase Main para probar

