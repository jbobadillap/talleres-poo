package actividad_extra.parteI;

/*
 * Ejemplo errado:
 *
 * public class Persona {
 *     String nombre;
 * }
 *
 * public void saludar() {          // el metodo quedo FUERA de la clase
 *     System.out.println("Hola");
 * }
 *
 * Mensaje de error del compilador:
 * "class, interface, enum, or record expected"
 * Java espera encontrar la declaracion de una clase, pero se encontro un
 * metodo suelto en el archivo. Todo metodo debe vivir dentro de una clase.
 */

public class Ejercicio45 {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.nombre = "Ana";
        p.saludar();
    }
}

class Persona {
    public String nombre;

    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
}
