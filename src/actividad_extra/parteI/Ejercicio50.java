package actividad_extra.parteI;

/*
 * Ejemplo errado:
 *
 * public class Reloj {
 *     int hora;
 *     int minuto;
 *     public void mostrarHora() {
 *         System.out.println(hora + ":" + minuto);
 *     }
 * }
 *
 * public class Main {
 *     public static void main(String[] args) {
 *         // Se creo la clase pero NUNCA se construyo el objeto con new.
 *         // El metodo mostrarHora() no se invoca sobre ninguna instancia.
 *     }
 * }
 *
 * Mensaje de error / problema:
 * No hay error de compilacion: el programa compila y corre, pero no hace nada.
 * Para usar la clase es obligatorio instanciarla: Reloj r = new Reloj();
 */

public class Ejercicio50 {
    public static void main(String[] args) {
        Reloj r = new Reloj();
        r.hora = 14;
        r.minuto = 30;
        r.mostrarHora();
    }
}

class Reloj {
    public int hora;
    public int minuto;

    public void mostrarHora() {
        System.out.println(hora + ":" + minuto);
    }
}
