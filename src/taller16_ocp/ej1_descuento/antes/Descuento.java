package taller16_ocp.ej1_descuento.antes;

public class Descuento {

    public double aplicar(double monto, double porcentaje) {
        return monto - (monto * porcentaje / 100);
    }
}
