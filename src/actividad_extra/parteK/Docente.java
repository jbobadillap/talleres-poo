package actividad_extra.parteK;

/*
 * Diseno antes del codigo - Clase Docente
 *
 * Atributos:
 *   - nombre (String): nombre del docente
 *   - cedula (String): documento de identidad
 *   - materia (String): materia que imparte
 *
 * Metodos:
 *   - mostrarInfo(): muestra los datos del docente
 *   - asignarMateria(String nuevaMateria): cambia la materia que imparte
 *
 * Objetos reales que podrian construirse:
 *   - Un docente de matematicas llamado Carlos Perez
 *   - Una docente de POO llamada Maria Gomez
 *   - Un docente de fisica llamado Luis Torres
 */

public class Docente {
    public String nombre;
    public String cedula;
    public String materia;

    public void mostrarInfo() {
        System.out.println("Docente: " + nombre + " | Cedula: " + cedula + " | Materia: " + materia);
    }

    public void asignarMateria(String nuevaMateria) {
        materia = nuevaMateria;
    }
}
