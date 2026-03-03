
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
                    registrarEstudiante();
                    break;
                case 2:
                    System.out.println("Opción 2: Listar Estudiantes");
                    listarEstudiantes();
                    break;
                case 3:
                    System.out.println("Opción 3: Buscar Estudiante");
                    buscarEstudiante();
                    break;
                case 4:
                    System.out.println("Opción 4: Actualizar Estudiante");
                    actualizarEstudiante();
                    break;
                case 5:
                    System.out.println("Opción 5: Eliminar Estudiante");
                    eliminarEstudiante();
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while(opcion != 6);
    }
    
    public static void registrarEstudiante() {
    System.out.println("\n--- REGISTRAR ESTUDIANTE ---");
    System.out.print("Ingrese el nombre del estudiante: ");
    String nombre = scanner.nextLine();
    
    estudiantes.add(nombre);
    System.out.println("Estudiante registrado exitosamente!");
    System.out.println("Total de estudiantes: " + estudiantes.size());
}
    
    
    public static void listarEstudiantes() {
    System.out.println("\n--- LISTA DE ESTUDIANTES ---");
    
    if(estudiantes.isEmpty()) {
        System.out.println("No hay estudiantes registrados.");
    } else {
        for(int i = 0; i < estudiantes.size(); i++) {
            System.out.println((i + 1) + ". " + estudiantes.get(i));
        }
        System.out.println("Total: " + estudiantes.size() + " estudiantes");
    }
}

public static void buscarEstudiante() {
    System.out.println("\n--- BUSCAR ESTUDIANTE ---");
    System.out.print("Ingrese el nombre del estudiante a buscar: ");
    String nombreBuscado = scanner.nextLine();
    
    boolean encontrado = false;
    for(int i = 0; i < estudiantes.size(); i++) {
        if(estudiantes.get(i).equalsIgnoreCase(nombreBuscado)) {
            System.out.println("Estudiante encontrado en posición: " + (i + 1));
            System.out.println("Nombre: " + estudiantes.get(i));
            encontrado = true;
            break;
        }
    }
    
    if(!encontrado) {
        System.out.println("Estudiante no encontrado.");
    }
}
    public static void actualizarEstudiante() {
    System.out.println("\n--- ACTUALIZAR ESTUDIANTE ---");
    
    if(estudiantes.isEmpty()) {
        System.out.println("No hay estudiantes para actualizar.");
        return;
    }
    
    listarEstudiantes();
    
    System.out.print("Seleccione el número del estudiante a actualizar: ");
    int indice = scanner.nextInt();
    scanner.nextLine();
    
    if(indice > 0 && indice <= estudiantes.size()) {
        System.out.print("Ingrese el nuevo nombre: ");
        String nuevoNombre = scanner.nextLine();
        
        String nombreAnterior = estudiantes.get(indice - 1);
        estudiantes.set(indice - 1, nuevoNombre);
        
        System.out.println("Estudiante actualizado exitosamente!");
        System.out.println("Anterior: " + nombreAnterior);
        System.out.println("Nuevo: " + nuevoNombre);
    } else {
        System.out.println("Número no válido.");
    }
}
    
    
    
    
    public static void eliminarEstudiante() {
    System.out.println("\n--- ELIMINAR ESTUDIANTE ---");
    
    if(estudiantes.isEmpty()) {
        System.out.println("No hay estudiantes para eliminar.");
        return;
    }
    
    listarEstudiantes();
    
    System.out.print("Seleccione el número del estudiante a eliminar: ");
    int indice = scanner.nextInt();
    scanner.nextLine();
    
    if(indice > 0 && indice <= estudiantes.size()) {
        String estudianteEliminado = estudiantes.remove(indice - 1);
        System.out.println("Estudiante eliminado exitosamente: " + estudianteEliminado);
        System.out.println("Total ahora: " + estudiantes.size());
    } else {
        System.out.println("Número no válido.");
    }
}
    
    /*
 public void RegistrarAsignatura(){
        Asignatura a = new Asignatura();
         System.out.println("Codigo:");
         a.setCodigo(scanner.next());
         
         System.out.println("Nombre:");
         a.setCodigo(scanner.next());
         
         System.out.println("Creditos:");
         a.setCodigo(scanner.next());
         
         System.out.println("Docentos:");
         a.setCodigo(scanner.next());
         
       listaAsignaturas.add(a);
         
         System.out.println("Asignatura agregada correctamente");
         
     }*/
    
    /*
public static void listarAsignaturas() {

    if (listaAsignaturas.isEmpty()) {
        System.out.println("No hay asignaturas registradas.");
        return;
    }

    for (Asignatura a : listaAsignaturas) {
        System.out.println(a);
    }
}*/

/*
public static void buscarAsignatura() {

    System.out.print("Ingrese código: ");
    String codigo = sc.nextLine();

    for (Asignatura a : listaAsignaturas) {
        if (a.getCodigo().equals(codigo)) {
            System.out.println(a);
            return;
        }
    }

    System.out.println("Asignatura no encontrada.");
}*/
    
    /*
    public static void actualizarAsignatura() {

    System.out.print("Ingrese código: ");
    String codigo = sc.nextLine();

    for (Asignatura a : listaAsignaturas) {
        if (a.getCodigo().equals(codigo)) {

            System.out.print("Nuevo nombre: ");
            a.setNombre(sc.nextLine());

            System.out.println("Asignatura actualizada correctamente.");
            return;
        }
    }

    System.out.println("Asignatura no encontrada.");
}*/
    
    

    
    
    
    
    
    
}
    
    
    
    
