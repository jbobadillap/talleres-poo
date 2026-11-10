package taller06_protected.ej2_vehiculoMoto.otroPaquete;

import taller06_protected.ej2_vehiculoMoto.vehiculos.Vehiculo;

public class Moto extends Vehiculo {

    private int cilindrada;

    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    public void mostrarInfo() {
        mostrarDetalles();
        System.out.println("Acceso por herencia -> tipo: " + tipo
                + ", marca: " + marca);
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}
