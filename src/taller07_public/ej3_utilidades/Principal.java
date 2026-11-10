package taller07_public.ej3_utilidades;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Suma: " + Utilidades.sumar(8, 5));
        System.out.println("Resta: " + Utilidades.restar(8, 5));
        System.out.println("Multiplicacion: " + Utilidades.multiplicar(8, 5));
        System.out.println("Division: " + Utilidades.dividir(8, 5));
        System.out.println("Division entre cero: " + Utilidades.dividir(8, 0));
    }
}
