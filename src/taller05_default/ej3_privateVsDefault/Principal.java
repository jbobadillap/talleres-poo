package taller05_default.ej3_privateVsDefault;

public class Principal {

    public static void main(String[] args) {
        Persona persona = new Persona("Carlos Perez", 28);

        System.out.println("Nombre (solo por getter): " + persona.getNombre());
        System.out.println("Edad (acceso directo de paquete): " + persona.edad);

        persona.setNombre("Carlos Perez Gomez");
        persona.edad = 29;

        System.out.println("Nombre actualizado: " + persona.getNombre());
        System.out.println("Edad actualizada directamente: " + persona.edad);

        // persona.nombre = "Otro"; // Error de compilacion: nombre es private.

        System.out.println("\nDiferencia:");
        System.out.println("- nombre es private: solo la clase Persona lo controla.");
        System.out.println("- edad es default: cualquier clase del paquete la modifica.");
    }
}
