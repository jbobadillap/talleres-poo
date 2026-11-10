package taller18_isp.ej3_vehiculos.despues;

public class Coche implements Conducible {

    @Override
    public void conducir() {
        System.out.println("El coche se conduce por la via.");
    }
}
