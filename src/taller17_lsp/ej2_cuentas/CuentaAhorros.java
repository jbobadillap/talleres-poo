package taller17_lsp.ej2_cuentas;

public class CuentaAhorros extends CuentaBancaria {

    private final double tasaInteres;

    public CuentaAhorros(double saldoInicial, double tasaInteres) {
        super(saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    public void aplicarInteres() {
        saldo += saldo * tasaInteres / 100;
    }
}
