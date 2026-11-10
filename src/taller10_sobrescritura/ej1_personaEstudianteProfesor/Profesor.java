package taller10_sobrescritura.ej1_personaEstudianteProfesor;

public class Profesor extends Persona {

    private String materia;

    public Profesor(String nombre, String materia) {
        super(nombre);
        this.materia = materia;
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, soy el profesor " + getNombre()
                + " de la materia " + materia + ".");
    }
}
