package taller05_default.ej3_privateVsDefault;

public class Persona {

    private String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        setNombre(nombre);
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            System.out.println("Nombre invalido.");
            return;
        }
        this.nombre = nombre.trim();
    }
}
