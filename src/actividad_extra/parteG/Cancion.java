package actividad_extra.parteG;

public class Cancion {
    public String titulo;
    public String artista;
    public double duracion;

    public void mostrarInfo() {
        System.out.println("Cancion: " + titulo + " | Artista: " + artista + " | Duracion: " + duracion + " min");
    }
}
