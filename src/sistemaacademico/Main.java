
package sistemaacademico;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    
    private static ArrayList<String> estudiantes = new ArrayList<>();
    private static ArrayList<String> asignaturas = new ArrayList<>();
    private static ArrayList<Double> notas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
    }
    
    public static void mostrarMenu() {
        int opcion;
        
        do {
            System.out.println("\n=== SISTEMA ACADÉMICO ===");
            System.out.println("1. Registrar Estudiante");
            System.out.println("2. Listar Estudiantes");
            System.out.println("3. Buscar Estudiante");
            System.out.println("4. Actualizar Estudiante");
            System.out.println("5. Eliminar Estudiante");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcion) {
                case 1:
                    System.out.println("Opción 1: Registrar Estudiante");
                    break;
                case 2:
                    System.out.println("Opción 2: Listar Estudiantes");
                    break;
                case 3:
                    System.out.println("Opción 3: Buscar Estudiante");
                    break;
                case 4:
                    System.out.println("Opción 4: Actualizar Estudiante");
                    break;
                case 5:
                    System.out.println("Opción 5: Eliminar Estudiante");
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while(opcion != 6);
    }
}
    
    
    
    
