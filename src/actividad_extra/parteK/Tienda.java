package actividad_extra.parteK;

/*
 * Diseno antes del codigo - Clase Tienda
 *
 * Atributos:
 *   - nombre (String): nombre de la tienda
 *   - categoria (String): tipo de productos que vende
 *   - numeroEmpleados (int): cantidad de empleados
 *
 * Metodos:
 *   - mostrarInfo(): muestra los datos de la tienda
 *   - contratarEmpleado(): aumenta en 1 el numero de empleados
 *
 * Objetos reales que podrian construirse:
 *   - Tienda de ropa con 5 empleados
 *   - Supermercado con 30 empleados
 *   - Ferreteria con 8 empleados
 */

public class Tienda {
    public String nombre;
    public String categoria;
    public int numeroEmpleados;

    public void mostrarInfo() {
        System.out.println("Tienda " + nombre + " | Categoria: " + categoria + " | Empleados: " + numeroEmpleados);
    }

    public void contratarEmpleado() {
        numeroEmpleados++;
    }
}
