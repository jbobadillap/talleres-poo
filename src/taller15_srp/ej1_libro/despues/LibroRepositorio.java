package taller15_srp.ej1_libro.despues;

public class LibroRepositorio {

    public void guardar(Libro libro) {
        System.out.println("Guardando el libro " + libro.getTitulo() + " en la base de datos.");
    }
}
