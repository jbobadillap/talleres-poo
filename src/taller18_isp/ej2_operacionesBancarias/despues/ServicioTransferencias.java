package taller18_isp.ej2_operacionesBancarias.despues;

public class ServicioTransferencias implements Transferible {

    @Override
    public void transferir(double monto, String cuentaDestino) {
        System.out.println("Transferencia de " + monto + " a la cuenta " + cuentaDestino);
    }
}
