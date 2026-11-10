package taller19_dip.ej2_almacenamiento;

import java.util.HashMap;
import java.util.Map;

public class AlmacenamientoLocal implements Almacenamiento {

    private final Map<String, String> archivos = new HashMap<>();

    @Override
    public void guardar(String nombre, String contenido) {
        archivos.put(nombre, contenido);
        System.out.println("Archivo guardado en disco local: " + nombre);
    }

    @Override
    public String recuperar(String nombre) {
        return archivos.get(nombre);
    }
}
