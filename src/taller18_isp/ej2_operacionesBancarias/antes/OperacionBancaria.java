package taller18_isp.ej2_operacionesBancarias.antes;

public interface OperacionBancaria {

    void transferir(double monto, String cuentaDestino);

    void retirar(double monto);

    void pagarFactura(String servicio, double monto);
}
