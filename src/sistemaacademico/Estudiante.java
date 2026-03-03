/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaacademico;

/**
 *
 * @author 2jcue
 */
public class Estudiante {
    private String codigo;
    private String nombre;
    private String programa;
    private int semestre;
    
    // Constructor vacío
    public Estudiante() {
    }

    // Constructor con todos los atributos
    public Estudiante(String codigo, String nombre, String programa, int semestre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.programa = programa;
        this.semestre = semestre;
    }
    
}
