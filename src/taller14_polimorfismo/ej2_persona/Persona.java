package taller14_polimorfismo.ej2_persona;

public class Persona {

    protected final String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void presentarse() {
        System.out.println("Hola, soy " + nombre + ".");
    }
}
