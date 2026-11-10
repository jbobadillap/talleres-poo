package taller19_dip.ej2_almacenamiento;

public class GestorArchivos {

    private final Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void guardarArchivo(String nombre, String contenido) {
        almacenamiento.guardar(nombre, contenido);
    }

    public String leerArchivo(String nombre) {
        return almacenamiento.recuperar(nombre);
    }
}
