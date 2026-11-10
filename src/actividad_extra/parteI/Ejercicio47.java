package actividad_extra.parteI;

/*
 * Ejemplo errado:
 *
 * public class Main {
 *     public static void main(String[] args) {
 *         Producto p;              // se declara la variable pero NO se crea
 *         p.nombre = "Lapiz";      // se usa sin haberla inicializado
 *     }
 * }
 *
 * Mensaje de error del compilador:
 * "variable p might not have been initialized"
 * La variable p existe como referencia, pero no apunta a ningun objeto real
 * porque nunca se ejecuto new Producto().
 */

public class Ejercicio47 {
    public static void main(String[] args) {
        Producto p = new Producto();
        p.nombre = "Lapiz";
        p.mostrar();
    }
}

class Producto {
    public String nombre;

    public void mostrar() {
        System.out.println("Producto: " + nombre);
    }
}
