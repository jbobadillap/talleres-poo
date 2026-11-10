package actividad_extra.parteC;

public class CuentaBancaria {
    public String numero;
    public String titular;
    public double saldo;

    public void mostrarCuenta() {
        System.out.println("Cuenta: " + numero + " | Titular: " + titular + " | Saldo: $" + saldo);
    }

    public void consignar(double valor) {
        saldo += valor;
    }

    public void retirar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para retirar $" + valor);
        }
    }
}
