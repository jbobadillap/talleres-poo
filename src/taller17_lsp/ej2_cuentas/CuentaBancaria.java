package taller17_lsp.ej2_cuentas;

public class CuentaBancaria {

    protected double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = Math.max(0, saldoInicial);
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
