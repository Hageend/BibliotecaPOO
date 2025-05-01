package com.bibliotecapoo;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import com.bibliotecapoo.model.Libro;
import com.bibliotecapoo.model.Revista;
import com.bibliotecapoo.model.RecursoBibliografico;
import com.bibliotecapoo.model.Usuario;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ;

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
        Usuario usuario = null;

        do {
            if (usuario == null) {
            System.out.println("No tienes un perfil creado. Por favor, crea un perfil para continuar.");
            System.out.print("Ingresa tu nombre: ");
            String nombre = scanner.next();
            usuario = new Usuario(nombre);
            System.out.println("Perfil creado exitosamente.\n");
            }

            System.out.println("Biblioteca\n");
            System.out.println("1. Mostrar todos los recursos");
            System.out.println("2. Prestar una revista o libro");
            System.out.println("3. Regresar un recurso prestado");
            System.out.println("4. Salir");
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
                System.out.println("Selecciona un recurso para prestar:");
                for (int i = 0; i < recursos.size(); i++) {
                    System.out.printf("%d. ", i + 1);
                    recursos.get(i).mostrarDetalles();
                }
                System.out.print("Ingresa el número del recurso: ");
                int recursoSeleccionado = scanner.nextInt() - 1;
                if (recursoSeleccionado >= 0 && recursoSeleccionado < recursos.size()) {
                    RecursoBibliografico recurso = recursos.get(recursoSeleccionado);
                    if (usuario.prestarRecurso(recurso)) {
                        System.out.println("Recurso prestado exitosamente.\n");
                    } else {
                        System.out.println("No se pudo prestar el recurso. Verifica la disponibilidad.\n");
                    }
                } else {
                    System.out.println("Número de recurso no válido.\n");
                }
                break;

            case 3:
                System.out.println("Selecciona un recurso para devolver:");
                usuario.listarRecursosPrestados();
                System.out.print("Ingresa el número del recurso: ");
                int recursoDevolver = scanner.nextInt() - 1;
                if (recursoDevolver >= 0 && recursoDevolver < recursos.size()) {
                    RecursoBibliografico recurso = recursos.get(recursoDevolver);
                    usuario.devolverRecurso(recurso);
                    System.out.println("Recurso devuelto exitosamente.\n");
                } else {
                    System.out.println("Número de recurso no válido.\n");
                }
                
                break;
            
            case 4:
                System.out.println("¡Hasta luego!");
                break;

            default:
                System.out.println("Opción no válida. Intenta nuevamente.");
            }

            System.out.println();
        } while (opcion != 4);

        scanner.close();
    }
}
