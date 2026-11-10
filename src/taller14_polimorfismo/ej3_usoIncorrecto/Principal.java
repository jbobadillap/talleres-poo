package taller14_polimorfismo.ej3_usoIncorrecto;

public class Principal {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Moto();
        vehiculo.mover();

        System.out.println("\nEl codigo compila, pero Moto no cambia el comportamiento.");
        System.out.println("Sobrescribir solo para llamar a super no aporta nada.");
    }
}
