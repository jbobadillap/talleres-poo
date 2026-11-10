package taller05_default.ej2_vehiculoMoto.vehiculos;

public class PruebaVehiculos {

    public static void main(String[] args) {
        Moto moto = new Moto("Motocicleta", 250);

        System.out.println("Acceso valido dentro del mismo paquete:");
        moto.mostrarInfo();
        System.out.println("Acceso directo a tipo: " + moto.tipo);
        System.out.println("Acceso directo a cilindrada: " + moto.cilindrada);
    }
}
