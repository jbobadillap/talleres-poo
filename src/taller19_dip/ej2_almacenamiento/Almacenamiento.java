package taller19_dip.ej2_almacenamiento;

public interface Almacenamiento {

    void guardar(String nombre, String contenido);

    String recuperar(String nombre);
}
