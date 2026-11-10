package taller18_isp.ej3_vehiculos.despues;

public class Camion implements Conducible, Transportable {

    @Override
    public void conducir() {
        System.out.println("El camion se conduce por la via.");
    }

    @Override
    public void cargarMercancia() {
        System.out.println("El camion carga mercancia.");
    }
}
