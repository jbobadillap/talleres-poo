package taller18_isp.ej2_operacionesBancarias.despues;

public class ServicioPagos implements PagoFacturas {

    @Override
    public void pagarFactura(String servicio, double monto) {
        System.out.println("Pago de " + monto + " al servicio " + servicio);
    }
}
