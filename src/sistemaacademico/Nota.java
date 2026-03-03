package sistemaacademico;

public class Nota {

    private Estudiante estudiante;
    private Asignatura asignatura;
    private double valor;

    public Nota(Estudiante estudiante, Asignatura asignatura, double valor) {
        this.estudiante = estudiante;
        this.asignatura = asignatura;
        this.valor = valor;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Estudiante: " + estudiante.getNombre() +
               " | Asignatura: " + asignatura.getNombre() +
               " | Nota: " + valor;
    }
}