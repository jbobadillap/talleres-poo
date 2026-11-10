package actividad_extra.parteL;

public class Asignatura {
    public String nombre;
    public String codigo;
    public int creditos;

    public void mostrarInfo() {
        System.out.println("Asignatura: " + nombre + " | Codigo: " + codigo + " | Creditos: " + creditos);
    }

    public void matricular() {
        System.out.println("Te has matriculado en " + nombre);
    }
}
