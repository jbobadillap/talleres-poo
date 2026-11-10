package taller14_polimorfismo.ej2_persona;

public class Profesor extends Persona {

    public Profesor(String nombre) {
        super(nombre);
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, soy el profesor " + nombre + ".");
    }
}
