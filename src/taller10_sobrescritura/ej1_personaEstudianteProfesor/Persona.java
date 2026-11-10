package taller10_sobrescritura.ej1_personaEstudianteProfesor;

public class Persona {

    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void presentarse() {
        System.out.println("Hola, soy " + nombre + ".");
    }
}
