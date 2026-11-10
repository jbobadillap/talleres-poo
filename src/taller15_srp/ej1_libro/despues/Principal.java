package taller15_srp.ej1_libro.despues;

public class Principal {

    public static void main(String[] args) {
        Libro libro = new Libro("Cien anos de soledad", "Gabriel Garcia Marquez", 85000);
        LibroReporte reporte = new LibroReporte();
        LibroRepositorio repositorio = new LibroRepositorio();

        reporte.generar(libro);
        repositorio.guardar(libro);

        System.out.println("\nCada clase tiene una sola responsabilidad.");
    }
}
