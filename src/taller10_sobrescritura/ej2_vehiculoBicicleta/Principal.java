package taller10_sobrescritura.ej2_vehiculoBicicleta;

public class Principal {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        Vehiculo bicicleta = new Bicicleta();

        System.out.println("Llamadas desde referencias Vehiculo:");
        vehiculo.moverse();
        bicicleta.moverse();
    }
}
