package taller06_protected.ej3_banco;

public class BancoSeguro {

    private double saldo;

    public BancoSeguro(double saldoInicial) {
        if (saldoInicial < 0) {
            System.out.println("Saldo inicial invalido: se inicia en 0.");
            this.saldo = 0;
        } else {
            this.saldo = saldoInicial;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("El deposito debe ser positivo.");
            return;
        }
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("El retiro debe ser positivo.");
            return;
        }
        if (monto > saldo) {
            System.out.println("Fondos insuficientes.");
            return;
        }
        saldo -= monto;
    }
}
