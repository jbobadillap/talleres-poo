package actividad_extra.parteI;

/*
 * Ejemplo errado:
 *
 * public class {           // falta el nombre de la clase
 *     String nombre;
 * }
 *
 * Mensaje de error del compilador:
 * "<identifier> expected"
 * Despues de la palabra class el compilador espera un identificador (el
 * nombre de la clase), pero se encontro una llave.
 */

public class Ejercicio46 {
    public static void main(String[] args) {
        Coche c = new Coche();
        c.marca = "Toyota";
        c.mostrar();
    }
}

class Coche {
    public String marca;

    public void mostrar() {
        System.out.println("Marca: " + marca);
    }
}
