package taller16_ocp.ej1_descuento.despues;

public class DescuentoPorcentaje implements Descuento {

    private final double porcentaje;

    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicar(double monto) {
        return monto - (monto * porcentaje / 100);
    }
}
