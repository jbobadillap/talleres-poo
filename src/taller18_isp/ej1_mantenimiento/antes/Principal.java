package taller18_isp.ej1_mantenimiento.antes;

public class Principal {

    public static void main(String[] args) {
        Tecnico tecnico = new Tecnico();

        tecnico.reparar();
        tecnico.limpiar();

        System.out.println("\nProblema: la interfaz Mantenimiento obliga al tecnico");
        System.out.println("a implementar una tarea que no le corresponde.");
    }
}
