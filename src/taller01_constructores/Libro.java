package taller01_constructores;

public class Libro {
    String titulo;
    String autor;
    int numeroPaginas;

    Libro(){
        titulo = "Sin titulo";
        autor = "Sin autor";
        numeroPaginas = 0;
    }
    Libro(String titulo, String autor, int numeroPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    void mostrarInfo(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + numeroPaginas);
    }

    public String toString(){
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nPaginas: " + numeroPaginas;
    }

}
