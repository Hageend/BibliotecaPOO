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
        int opcion;
        do {
            System.out.println("1. Mostrar todos los recursos");
            System.out.println("2. Prestar una revista");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    for (RecursoBibliografico recurso : recursos) {
                        recurso.mostrarDetalles();  
                    }
                    break;

                case 2:
                    for (RecursoBibliografico recurso : recursos) {
                        if (recurso instanceof Revista) {
                            Revista rev = (Revista) recurso;
                            if (rev.prestar()) {
                                System.out.println("Revista prestada exitosamente.");
                            } else {
                                System.out.println("No hay ejemplares disponibles para prestar.");
                            }
                            break; // si solo quieres prestar una
                        }
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
