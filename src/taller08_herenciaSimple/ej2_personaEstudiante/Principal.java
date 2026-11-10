package taller08_herenciaSimple.ej2_personaEstudiante;

public class Principal {

    public static void main(String[] args) {
        Persona persona = new Persona("Elena Castro", 22);
        Estudiante estudiante = new Estudiante("Elena Castro", 22, "2026-POO-045");

        System.out.println("Persona:");
        persona.mostrarDetalles();

        System.out.println("\nEstudiante:");
        estudiante.mostrarDetalles();

        System.out.println("\nEstudiante con referencia Persona:");
        Persona referencia = estudiante;
        referencia.mostrarDetalles();
    }
}
