package com.bibliotecapoo;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import com.bibliotecapoo.model.Libro;
import com.bibliotecapoo.model.Revista;
import com.bibliotecapoo.model.RecursoBibliografico;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<RecursoBibliografico> recursos = new ArrayList<>();

         // Agregando 5 libros
         recursos.add(new Libro("Cien Años de Soledad", "Gabriel García Márquez", "123-456789"));
         recursos.add(new Libro("1984", "George Orwell", "234-567890"));
         recursos.add(new Libro("El Principito", "Antoine de Saint-Exupéry", "345-678901"));
         recursos.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "456-789012"));
         recursos.add(new Libro("Fahrenheit 451", "Ray Bradbury", "567-890123"));
 
         // Agregando 3 revistas
         recursos.add(new Revista("National Geographic", "987-654321", 2024, 50));
         recursos.add(new Revista("Scientific American", "876-543210", 2023, 30));
         recursos.add(new Revista("Muy Interesante", "765-432109", 2022, 20));
 
        int opcion;
        do {
            System.out.println("Biblioteca\n");
            System.out.println("1. Mostrar todos los recursos");
            System.out.println("2. Prestar una revista");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                System.out.println("\nLIBROS:");
                for (RecursoBibliografico recurso : recursos) {
                    if (recurso instanceof Libro) {
                        recurso.mostrarDetalles();
                    }
                }

                System.out.println("\nREVISTAS:");
                for (RecursoBibliografico recurso : recursos) {
                    if (recurso instanceof Revista) {
                        recurso.mostrarDetalles();
                    }
                }
                    break;

                case 2:
                boolean prestado = false;
                for (RecursoBibliografico recurso : recursos) {
                    if (recurso instanceof Revista) {
                        Revista rev = (Revista) recurso;
                        if (!rev.isPrestado() && rev.prestar()) {
                            System.out.println("Revista prestada exitosamente.");
                            prestado = true;
                            break;
                        }
                    }
                }
                if (!prestado) {
                    System.out.println("No hay revistas disponibles para prestar.");
                }
                    break;

                case 3:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }

            System.out.println();
        } while (opcion != 3);

        scanner.close();
    }
}
