package taller03_static;

public class Principal {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Ford", "Focus");
        Coche coche3 = new Coche("Seat", "Ibiza");
        Coche.mostrarCoches();

        System.out.println("Suma: " + Matematicas.suma(10, 5));
        System.out.println("Resta: " + Matematicas.resta(10, 5));
        System.out.println("Multiplicacion: " + Matematicas.multiplicacion(10, 5));
        System.out.println("Division: " + Matematicas.division(10, 5));
    }
}
