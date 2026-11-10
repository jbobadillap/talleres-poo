package taller15_srp.ej1_libro.despues;

public class LibroReporte {

    public void generar(Libro libro) {
        System.out.println("Reporte del libro: " + libro.getTitulo()
                + " escrito por " + libro.getAutor());
    }
}
