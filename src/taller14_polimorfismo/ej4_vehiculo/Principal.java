package taller14_polimorfismo.ej4_vehiculo;

public class Principal {

    public static void main(String[] args) {
        Vehiculo coche = new Coche();
        Vehiculo bicicleta = new Bicicleta();

        coche.mover();
        bicicleta.mover();

        System.out.println("\nLos dos objetos usan la misma referencia Vehiculo.");
    }
}
