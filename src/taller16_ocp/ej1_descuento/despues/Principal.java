package taller16_ocp.ej1_descuento.despues;

public class Principal {

    public static void main(String[] args) {
        GestorDescuentos gestor = new GestorDescuentos();

        Descuento porcentaje = new DescuentoPorcentaje(10);
        Descuento fijo = new DescuentoFijo(25000);

        System.out.println("Precio con 10%: " + gestor.aplicarDescuento(porcentaje, 200000));
        System.out.println("Precio con descuento fijo: " + gestor.aplicarDescuento(fijo, 200000));

        System.out.println("\nSe agregaron descuentos nuevos sin modificar el gestor.");
    }
}
