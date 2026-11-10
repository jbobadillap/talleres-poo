package taller16_ocp.ej1_descuento.antes;

public class Principal {

    public static void main(String[] args) {
        Descuento descuento = new Descuento();

        System.out.println("Precio con descuento: " + descuento.aplicar(200000, 10));

        System.out.println("\nProblema: para agregar un descuento fijo");
        System.out.println("habria que modificar la clase Descuento.");
    }
}
