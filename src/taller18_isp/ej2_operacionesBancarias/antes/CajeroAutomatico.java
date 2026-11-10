package taller18_isp.ej2_operacionesBancarias.antes;

public class CajeroAutomatico implements OperacionBancaria {

    @Override
    public void transferir(double monto, String cuentaDestino) {
        System.out.println("El cajero no ofrece transferencias, pero debe implementarlas.");
    }

    @Override
    public void retirar(double monto) {
        System.out.println("Retiro realizado por " + monto);
    }

    @Override
    public void pagarFactura(String servicio, double monto) {
        System.out.println("El cajero no paga facturas, pero debe implementarlo.");
    }
}
