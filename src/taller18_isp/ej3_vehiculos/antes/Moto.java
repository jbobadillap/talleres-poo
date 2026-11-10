package taller18_isp.ej3_vehiculos.antes;

public class Moto implements Vehiculo {

    @Override
    public void conducir() {
        System.out.println("La moto se conduce por la via.");
    }

    @Override
    public void cargarMercancia() {
        System.out.println("Una moto no esta pensada para cargar mercancia.");
    }
}
