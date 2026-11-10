package taller07_public.ej2_cuentaBancaria;

public class CuentaBancaria {

    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta;

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        setSaldo(saldo);
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("Saldo invalido: no puede ser negativo.");
            return;
        }
        this.saldo = saldo;
    }

    public void mostrarDetalles() {
        System.out.println("Cuenta: " + numeroCuenta + ", Tipo: " + tipoCuenta
                + ", Saldo: " + saldo);
    }
}
