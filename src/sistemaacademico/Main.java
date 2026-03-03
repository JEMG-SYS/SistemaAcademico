package sistemaacademico;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    
    private static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private static ArrayList<Asignatura> asignaturas = new ArrayList<>();
    private static ArrayList<Nota> listaNotas = new ArrayList<>();
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
            System.out.println("6. Registrar Asignatura");
            System.out.println("7. Listar Asignaturas");
            System.out.println("8. Registrar Nota");
            System.out.println("9. Listar Notas");
            System.out.println("10. Salir");
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
                     registrarAsignatura();
                    break;
                case 7:
                    listarAsignaturas();
                    break;

                case 8:
                    registrarNota();
                    break;

                case 9:
                    listarNotas();
                    break;

                case 10:
                System.out.println("¡Hasta luego!");
                     break;
                default:
                    System.out.println("Opción no válida");
            }
        } while(opcion != 10);
    }
    
    public static void registrarEstudiante() {

    System.out.println("\n--- REGISTRAR ESTUDIANTE ---");

    System.out.print("Código: ");
    String codigo = scanner.nextLine();

    System.out.print("Nombre: ");
    String nombre = scanner.nextLine();

    System.out.print("Programa: ");
    String programa = scanner.nextLine();

    System.out.print("Semestre: ");
    int semestre = scanner.nextInt();
    scanner.nextLine();

    Estudiante nuevo = new Estudiante(codigo, nombre, programa, semestre);
    estudiantes.add(nuevo);

    System.out.println("Estudiante registrado exitosamente!");
}
    
    
    public static void listarEstudiantes() {

    System.out.println("\n--- LISTA DE ESTUDIANTES ---");

    if(estudiantes.isEmpty()) {
        System.out.println("No hay estudiantes registrados.");
    } else {
        for(int i = 0; i < estudiantes.size(); i++) {
            System.out.println((i + 1) + ". " + estudiantes.get(i));
        }
    }
}

public static void buscarEstudiante() {

    System.out.println("\n--- BUSCAR ESTUDIANTE ---");
    System.out.print("Ingrese el nombre del estudiante a buscar: ");
    String nombreBuscado = scanner.nextLine();

    boolean encontrado = false;

    for(int i = 0; i < estudiantes.size(); i++) {

        if(estudiantes.get(i).getNombre().equalsIgnoreCase(nombreBuscado)) {

            System.out.println("Estudiante encontrado:");
            System.out.println(estudiantes.get(i));
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

        Estudiante estudiante = estudiantes.get(indice - 1);

        System.out.print("Nuevo nombre: ");
        estudiante.setNombre(scanner.nextLine());

        System.out.println("Estudiante actualizado correctamente.");

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

        Estudiante eliminado = estudiantes.remove(indice - 1);
        System.out.println("Estudiante eliminado: " + eliminado.getNombre());

    } else {
        System.out.println("Número no válido.");
    }
}
    public static void registrarAsignatura() {

    System.out.println("\n--- REGISTRAR ASIGNATURA ---");

    System.out.print("Código: ");
    String codigo = scanner.nextLine();

    System.out.print("Nombre: ");
    String nombre = scanner.nextLine();

    System.out.print("Créditos: ");
    int creditos = scanner.nextInt();
    scanner.nextLine();

    Asignatura nueva = new Asignatura(codigo, nombre, creditos);
    asignaturas.add(nueva);

    System.out.println("Asignatura registrada correctamente.");
}
    public static void listarAsignaturas() {

    System.out.println("\n--- LISTA DE ASIGNATURAS ---");

    if(asignaturas.isEmpty()) {
        System.out.println("No hay asignaturas registradas.");
    } else {
        for(Asignatura a : asignaturas) {
            System.out.println(a);
        }
    }
}
    public static void registrarNota() {

    if(estudiantes.isEmpty() || asignaturas.isEmpty()) {
        System.out.println("Debe existir al menos un estudiante y una asignatura.");
        return;
    }

    System.out.println("\n--- REGISTRAR NOTA ---");

    listarEstudiantes();
    System.out.print("Seleccione número del estudiante: ");
    int estIndex = scanner.nextInt() - 1;

    listarAsignaturas();
    System.out.print("Seleccione número de la asignatura: ");
    int asigIndex = scanner.nextInt() - 1;

    System.out.print("Ingrese la nota: ");
    double valor = scanner.nextDouble();
    scanner.nextLine();

    Nota nueva = new Nota(
        estudiantes.get(estIndex),
        asignaturas.get(asigIndex),
        valor
    );

    listaNotas.add(nueva);

    System.out.println("Nota registrada correctamente.");
}
    public static void listarNotas() {

    System.out.println("\n--- LISTA DE NOTAS ---");

    if(listaNotas.isEmpty()) {
        System.out.println("No hay notas registradas.");
    } else {
        for(Nota n : listaNotas) {
            System.out.println(n);
        }
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
    
    /*
    public static void eliminarAsignatura() {

    System.out.print("Ingrese código: ");
    String codigo = sc.nextLine();

    listaAsignaturas.removeIf(a -> a.getCodigo().equals(codigo));

    System.out.println("Proceso completado.");
}*/
    
    

    
    
    
    
    
    
}
    
    
    
    
