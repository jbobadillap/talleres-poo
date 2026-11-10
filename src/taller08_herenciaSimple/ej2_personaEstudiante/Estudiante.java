package taller08_herenciaSimple.ej2_personaEstudiante;

public class Estudiante extends Persona {

    private String matricula;

    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad);
        this.matricula = matricula;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Matricula: " + matricula);
    }
}
