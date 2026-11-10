package actividad_extra.parteK;

/*
 * Diseno antes del codigo - Clase Biblioteca
 *
 * Atributos:
 *   - nombre (String): nombre de la biblioteca
 *   - direccion (String): ubicacion
 *   - numeroLibros (int): cantidad de libros disponibles
 *
 * Metodos:
 *   - mostrarInfo(): muestra los datos de la biblioteca
 *   - prestarLibro(): disminuye en 1 el numero de libros disponibles
 *
 * Objetos reales que podrian construirse:
 *   - Biblioteca Central con 5000 libros
 *   - Biblioteca de Barrio con 800 libros
 *   - Biblioteca Universitaria con 12000 libros
 */

public class Biblioteca {
    public String nombre;
    public String direccion;
    public int numeroLibros;

    public void mostrarInfo() {
        System.out.println("Biblioteca " + nombre + " | Direccion: " + direccion + " | Libros: " + numeroLibros);
    }

    public void prestarLibro() {
        numeroLibros--;
    }
}
