package taller14_polimorfismo.ej2_persona;

public class Principal {

    public static void main(String[] args) {
        Persona[] personas = {
                new Persona("Ana"),
                new Estudiante("Camilo"),
                new Profesor("Laura")
        };

        for (Persona persona : personas) {
            persona.presentarse();
        }

        System.out.println("\nEl mismo metodo se ejecuta de forma diferente en cada objeto.");
    }
}
