package actividad_extra.parteK;

/*
 * Diseno antes del codigo - Clase EquipoDeFutbol
 *
 * Atributos:
 *   - nombre (String): nombre del equipo
 *   - ciudad (String): ciudad de origen
 *   - puntos (int): puntos en la tabla de posiciones
 *
 * Metodos:
 *   - mostrarInfo(): muestra los datos del equipo
 *   - sumarPuntos(int cantidad): suma puntos tras un partido
 *
 * Objetos reales que podrian construirse:
 *   - Junior de Barranquilla con 25 puntos
 *   - Nacional de Medellin con 30 puntos
 *   - America de Cali con 18 puntos
 */

public class EquipoDeFutbol {
    public String nombre;
    public String ciudad;
    public int puntos;

    public void mostrarInfo() {
        System.out.println("Equipo: " + nombre + " | Ciudad: " + ciudad + " | Puntos: " + puntos);
    }

    public void sumarPuntos(int cantidad) {
        puntos += cantidad;
    }
}
