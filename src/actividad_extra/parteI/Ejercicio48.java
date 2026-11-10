package actividad_extra.parteI;

/*
 * Ejemplo errado:
 *
 * public class Persona {
 *     String nombre = "Pedro";     // atributo de la clase
 *
 *     public void saludar() {
 *         String nombre = "Ana";   // variable LOCAL que sombrea al atributo
 *         System.out.println(nombre); // imprime "Ana", no el atributo
 *     }
 * }
 *
 * Mensaje de error / problema:
 * No es un error de compilacion, sino un error de logica: la variable local
 * "nombre" oculta al atributo "nombre". Para referirse al atributo hay que
 * usar la palabra this.nombre.
 */

public class Ejercicio48 {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        c.saludar();
    }
}

class Cliente {
    public String nombre = "Pedro";

    public void saludar() {
        String nombre = "Ana";
        System.out.println("Local: " + nombre + " | Atributo: " + this.nombre);
    }
}
