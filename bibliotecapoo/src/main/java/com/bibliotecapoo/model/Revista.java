package com.bibliotecapoo.model;

public class Revista extends RecursoBibliografico {
    private String issn;
    private int anioPublicacion;
    private int ejemplares;

    public Revista(String titulo, String issn, int anioPublicacion, int ejemplares) {
        super(titulo); // Llama al constructor de la clase base
        this.issn = issn;
        this.anioPublicacion = anioPublicacion;
        this.ejemplares = ejemplares;
    }

    @Override
    public void mostrarDetalles() {
        System.out.printf("Revista: %s | ISSN: %s | Año de Publicación: %d | Ejemplares Disponibles: %d%n",
            getTitulo(), issn, anioPublicacion, ejemplares);
    }

    public boolean prestar() {
        if (ejemplares > 0) {
            ejemplares--;
            return true; // Prestamo exitoso
        } else {
            return false; // No hay ejemplares disponibles
        }
    }

    public void devolver() {
        ejemplares++; // Incrementa el número de ejemplares disponibles
    }

}
