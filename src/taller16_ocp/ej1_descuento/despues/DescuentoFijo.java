package taller16_ocp.ej1_descuento.despues;

public class DescuentoFijo implements Descuento {

    private final double valor;

    public DescuentoFijo(double valor) {
        this.valor = valor;
    }

    @Override
    public double aplicar(double monto) {
        return Math.max(0, monto - valor);
    }
}
