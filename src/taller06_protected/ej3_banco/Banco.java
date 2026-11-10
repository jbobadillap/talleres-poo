package taller06_protected.ej3_banco;

public class Banco {

    protected double saldo;

    public Banco(double saldo) {
        this.saldo = saldo;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }
}
