package actividad_extra.parteE;

public class Libro {
    public String titulo;
    public String autor;
    public int paginas;

    public Libro() {
    }

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + " | Autor: " + autor + " | Paginas: " + paginas);
    }
}
