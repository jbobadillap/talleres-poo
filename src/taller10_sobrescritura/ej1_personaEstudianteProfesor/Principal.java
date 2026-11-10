package taller10_sobrescritura.ej1_personaEstudianteProfesor;

public class Principal {

    public static void main(String[] args) {
        Persona[] personas = {
                new Persona("Ana Torres"),
                new Estudiante("Luis Gomez", "Ingenieria de Sistemas"),
                new Profesor("Marta Diaz", "Programacion Orientada a Objetos")
        };

        System.out.println("Presentaciones con polimorfismo:");
        for (Persona persona : personas) {
            persona.presentarse();
        }
    }
}
