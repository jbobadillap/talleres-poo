package actividad_extra.parteG;

public class Pelicula {
    public String nombre;
    public String genero;
    public int minutos;

    public void mostrarFicha() {
        System.out.println("Pelicula: " + nombre + " | Genero: " + genero + " | Duracion: " + minutos + " min");
    }
}
