package taller18_isp.ej1_mantenimiento.antes;

public class Tecnico implements Mantenimiento {

    @Override
    public void reparar() {
        System.out.println("El tecnico repara el equipo.");
    }

    @Override
    public void limpiar() {
        System.out.println("El tecnico no deberia limpiar, pero debe implementarlo.");
    }
}
