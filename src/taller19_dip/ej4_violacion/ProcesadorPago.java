package taller19_dip.ej4_violacion;

public class ProcesadorPago {

    private final TarjetaCredito tarjeta;

    public ProcesadorPago(TarjetaCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    public void realizarPago(double monto) {
        tarjeta.procesarPago(monto);
    }
}
