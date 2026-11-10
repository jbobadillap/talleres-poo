package actividad_extra.parteI;

/*
 * Ejemplo errado:
 *
 * public class Animal {
 *     String nombre;
 *
 *     public void mostrar() {
 *         System.out.println(perro.nombre);  // "perro" no existe aqui
 *     }
 * }
 *
 * Mensaje de error del compilador:
 * "cannot find symbol - variable perro"
 * El compilador no encuentra ningun objeto llamado "perro" dentro del metodo.
 * Un objeto no puede acceder a los atributos de otro objeto sin una referencia
 * valida. Para acceder a los atributos del MISMO objeto se usa this.
 */

public class Ejercicio49 {
    public static void main(String[] args) {
        Animal perro = new Animal();
        perro.nombre = "Rocky";
        perro.mostrar();
    }
}

class Animal {
    public String nombre;

    public void mostrar() {
        System.out.println("Nombre: " + this.nombre);
    }
}
