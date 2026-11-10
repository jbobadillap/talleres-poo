package actividad_extra.parteK;

/*
 * Diseno antes del codigo - Clase Hospital
 *
 * Atributos:
 *   - nombre (String): nombre del hospital
 *   - ciudad (String): ciudad donde esta ubicado
 *   - numeroCamas (int): cantidad de camas disponibles
 *
 * Metodos:
 *   - mostrarInfo(): muestra los datos del hospital
 *   - recibirPaciente(): aumenta en 1 los pacientes (disminuye camas)
 *
 * Objetos reales que podrian construirse:
 *   - Hospital General de 200 camas
 *   - Clinica del Norte de 50 camas
 *   - Hospital Infantil de 120 camas
 */

public class Hospital {
    public String nombre;
    public String ciudad;
    public int numeroCamas;

    public void mostrarInfo() {
        System.out.println("Hospital " + nombre + " | Ciudad: " + ciudad + " | Camas: " + numeroCamas);
    }

    public void recibirPaciente() {
        numeroCamas--;
    }
}
