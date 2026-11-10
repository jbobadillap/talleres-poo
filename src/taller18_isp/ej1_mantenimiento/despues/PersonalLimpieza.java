package taller18_isp.ej1_mantenimiento.despues;

public class PersonalLimpieza implements Limpiable {

    @Override
    public void limpiar() {
        System.out.println("El personal de limpieza limpia el area.");
    }
}
