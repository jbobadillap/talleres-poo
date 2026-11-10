package taller18_isp.ej3_vehiculos.despues;

public class Principal {

    public static void main(String[] args) {
        Conducible coche = new Coche();
        Camion camion = new Camion();

        coche.conducir();
        camion.conducir();
        camion.cargarMercancia();

        System.out.println("\nEl coche solo conduce y el camion cumple las dos tareas.");
    }
}
