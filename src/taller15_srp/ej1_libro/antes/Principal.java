package taller15_srp.ej1_libro.antes;

public class Principal {

    public static void main(String[] args) {
        Libro libro = new Libro("Cien anos de soledad", "Gabriel Garcia Marquez", 85000);

        libro.mostrarInformacion();
        libro.generarReporte();
        libro.guardarEnBaseDeDatos();

        System.out.println("\nProblema: Libro tiene datos, reporte y persistencia.");
    }
}
