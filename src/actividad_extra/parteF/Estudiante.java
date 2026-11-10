package actividad_extra.parteF;

public class Estudiante {
    public String nombre;
    public String codigo;
    public int semestre;

    public Estudiante() {
    }

    public Estudiante(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public Estudiante(String nombre, String codigo, int semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
    }

    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " | Codigo: " + codigo + " | Semestre: " + semestre);
    }
}
