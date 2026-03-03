package sistemaacademico;

public class Estudiante {

    private String codigo;
    private String nombre;
    private String programa;
    private int semestre;

    public Estudiante(String codigo, String nombre, String programa, int semestre) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.programa = programa;
    this.semestre = semestre;
}

public String getCodigo() {
    return codigo;
}

public void setCodigo(String codigo) {
    this.codigo = codigo;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getPrograma() {
    return programa;
}

public void setPrograma(String programa) {
    this.programa = programa;
}

public int getSemestre() {
    return semestre;
}

public void setSemestre(int semestre) {
    this.semestre = semestre;
}
}
