package taller18_isp.ej1_mantenimiento.despues;

public class TecnicoReparacion implements Reparable {

    @Override
    public void reparar() {
        System.out.println("El tecnico repara el equipo.");
    }
}
