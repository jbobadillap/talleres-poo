package taller09_super.ej1_personaEmpleado;

public class Principal {

    public static void main(String[] args) {
        Persona persona = new Persona("Diana Lopez", 30);
        Empleado empleado = new Empleado("Carlos Rojas", 35, "Recursos Humanos");

        System.out.println("Persona:");
        persona.mostrarDetalles();

        System.out.println("\nEmpleado:");
        empleado.mostrarDetalles();

        System.out.println("\nLlamada con referencia Persona:");
        Persona referencia = empleado;
        referencia.mostrarDetalles();
    }
}
