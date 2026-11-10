package taller18_isp.ej1_mantenimiento.despues;

public class Principal {

    public static void main(String[] args) {
        Reparable tecnico = new TecnicoReparacion();
        Limpiable limpieza = new PersonalLimpieza();

        tecnico.reparar();
        limpieza.limpiar();

        System.out.println("\nCada clase implementa solo la interfaz que necesita.");
    }
}
