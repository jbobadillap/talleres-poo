package taller10_sobrescritura.ej1_personaEstudianteProfesor;

public class Estudiante extends Persona {

    private String carrera;

    public Estudiante(String nombre, String carrera) {
        super(nombre);
        this.carrera = carrera;
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, soy el estudiante " + getNombre()
                + " de " + carrera + ".");
    }
}
