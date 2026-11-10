package taller06_protected.ej1_empleadoGerente;

public class Principal {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Laura Diaz", 2500000);
        Gerente gerente = new Gerente("Andres Ruiz", 4800000, "Tecnologia");

        System.out.println("Empleado:");
        empleado.mostrarInformacion();

        System.out.println("\nGerente:");
        gerente.mostrarInformacion();

        System.out.println("\nAcceso protected desde el mismo paquete:");
        System.out.println("Nombre del gerente: " + gerente.nombre);
        System.out.println("Salario del gerente: " + gerente.salario);
    }
}
