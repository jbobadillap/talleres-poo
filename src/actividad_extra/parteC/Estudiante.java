package actividad_extra.parteC;

public class Estudiante {
    public String nombre;
    public String codigo;
    public int semestre;

    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " | Codigo: " + codigo + " | Semestre: " + semestre);
    }

    public void cambiarSemestre(int nuevoSemestre) {
        semestre = nuevoSemestre;
    }
}
