package taller18_isp.ej2_operacionesBancarias.despues;

public class CajeroAutomatico implements Retirable {

    @Override
    public void retirar(double monto) {
        System.out.println("Retiro realizado por " + monto);
    }
}
