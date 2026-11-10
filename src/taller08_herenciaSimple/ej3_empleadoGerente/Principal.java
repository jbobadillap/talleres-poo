package taller08_herenciaSimple.ej3_empleadoGerente;

public class Principal {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Jorge Ramirez", 2800000);
        Gerente gerente = new Gerente("Paula Herrera", 5200000, "Operaciones");

        System.out.println("Empleado:");
        empleado.mostrarDetalles();

        System.out.println("\nGerente:");
        gerente.mostrarDetalles();

        System.out.println("\nGerente con referencia Empleado:");
        Empleado referencia = gerente;
        referencia.mostrarDetalles();
    }
}
