package taller02_encapsulamiento;

public class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante() {
        this("Sin nombre", 0);
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarEstudiante() {
        System.out.println("Estudiante: " + nombre + ", Edad: " + edad + " anios");
    }
}