package taller14_polimorfismo.ej2_persona;

public class Estudiante extends Persona {

    public Estudiante(String nombre) {
        super(nombre);
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, soy el estudiante " + nombre + ".");
    }
}
