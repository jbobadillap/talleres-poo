package taller15_srp.ej1_libro.antes;

public class Libro {

    private final String titulo;
    private final String autor;
    private final double precio;

    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Precio: " + precio);
    }

    public void generarReporte() {
        System.out.println("Reporte del libro: " + titulo + " escrito por " + autor);
    }

    public void guardarEnBaseDeDatos() {
        System.out.println("Guardando el libro " + titulo + " en la base de datos.");
    }
}
