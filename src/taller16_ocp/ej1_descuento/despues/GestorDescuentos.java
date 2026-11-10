package taller16_ocp.ej1_descuento.despues;

public class GestorDescuentos {

    public double aplicarDescuento(Descuento descuento, double monto) {
        return descuento.aplicar(monto);
    }
}
