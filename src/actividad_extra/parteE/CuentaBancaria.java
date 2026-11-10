package actividad_extra.parteE;

public class CuentaBancaria {
    public String numero;
    public String titular;
    public double saldo;

    public CuentaBancaria(String numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void mostrarCuenta() {
        System.out.println("Cuenta: " + numero + " | Titular: " + titular + " | Saldo: $" + saldo);
    }
}
