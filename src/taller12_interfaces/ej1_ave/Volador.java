package taller12_interfaces.ej1_ave;

public interface Volador {

    void volar();

    default void planear() {
        System.out.println("El ave planea por el aire.");
    }

    static void avisar() {
        System.out.println("Aviso de la interfaz Volador.");
    }
}
