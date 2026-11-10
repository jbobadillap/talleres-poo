package taller04_private.ej1_estudiante;

public class Estudiante {

    private String nombre;
    private int edad;
    private double notaPromedio;

    public Estudiante(String nombre, int edad, double notaPromedio) {
        setNombre(nombre);
        setEdad(edad);
        setNotaPromedio(notaPromedio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            System.out.println("Nombre invalido: se conserva el valor anterior.");
            return;
        }
        this.nombre = nombre.trim();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0 || edad > 120) {
            System.out.println("Edad invalida: debe estar entre 0 y 120.");
            return;
        }
        this.edad = edad;
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio < 0.0 || notaPromedio > 5.0) {
            System.out.println("Nota invalida: debe estar entre 0.0 y 5.0.");
            return;
        }
        this.notaPromedio = notaPromedio;
    }

    @Override
    public String toString() {
        return "Estudiante{nombre='" + nombre + "', edad=" + edad
                + ", notaPromedio=" + notaPromedio + "}";
    }
}
