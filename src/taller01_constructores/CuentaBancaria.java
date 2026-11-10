package taller01_constructores;

public class CuentaBancaria {
    String numeroCuenta;
    double saldo;
    String tipoCuenta;

    CuentaBancaria(){
        numeroCuenta = "Sin numero";
        saldo = 0;
        tipoCuenta = "Sin tipo";
    }
    CuentaBancaria(String numeroCuenta, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        saldo = 0;
    }
    CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public String toString(){
        return "Numero de cuenta: " + numeroCuenta + "\nSaldo: " + saldo + "\nTipo de cuenta: " + tipoCuenta;
    }
}