package taller18_isp.ej3_vehiculos.antes;

public class Principal {

    public static void main(String[] args) {
        Moto moto = new Moto();

        moto.conducir();
        moto.cargarMercancia();

        System.out.println("\nProblema: la interfaz Vehiculo obliga a la moto");
        System.out.println("a implementar el transporte de mercancias.");
    }
}
