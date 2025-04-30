package com.bibliotecapoo.model;

public abstract class RecursoBibliografico {
    private String titulo;
    private boolean prestado;

    public RecursoBibliografico(String titulo) {
        this.titulo = titulo;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isPrestado() {
        return prestado;
    }

    protected void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public abstract void mostrarDetalles(); // Método abstracto para mostrar detalles del recurso
}
