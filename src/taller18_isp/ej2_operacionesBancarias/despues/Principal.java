package taller18_isp.ej2_operacionesBancarias.despues;

public class Principal {

    public static void main(String[] args) {
        Transferible transferencias = new ServicioTransferencias();
        Retirable retiros = new CajeroAutomatico();
        PagoFacturas pagos = new ServicioPagos();

        transferencias.transferir(100000, "AH-002");
        retiros.retirar(200000);
        pagos.pagarFactura("Energia", 80000);

        System.out.println("\nCada servicio implementa solo lo que realmente ofrece.");
    }
}
