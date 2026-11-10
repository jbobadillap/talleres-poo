package taller18_isp.ej2_operacionesBancarias.antes;

public class Principal {

    public static void main(String[] args) {
        CajeroAutomatico cajero = new CajeroAutomatico();

        cajero.retirar(200000);
        cajero.transferir(100000, "AH-002");
        cajero.pagarFactura("Energia", 80000);

        System.out.println("\nProblema: el cajero implementa operaciones que no ofrece.");
    }
}
