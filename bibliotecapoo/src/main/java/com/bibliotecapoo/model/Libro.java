package com.bibliotecapoo.model;

public class Libro extends RecursoBibliografico {
    private String autor;
    private String isbn;

    public Libro(String titulo, String autor, String isbn) {
        super(titulo); // Llama al constructor de la clase base
        this.autor = autor;
        this.isbn = isbn;
    }

    @Override
    public void mostrarDetalles() {
        System.out.printf("Libro: %s | Autor: %s | ISBN: %s | Prestado: %b%n",
            getTitulo(), autor, isbn, isPrestado());
    }

}
