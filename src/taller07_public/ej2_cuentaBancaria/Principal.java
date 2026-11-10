package taller07_public.ej2_cuentaBancaria;

public class Principal {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("AH-001-2026", 500000, "Ahorros");

        cuenta.mostrarDetalles();
        System.out.println("Tipo de cuenta (publico): " + cuenta.tipoCuenta);

        cuenta.tipoCuenta = "Corriente";
        cuenta.setSaldo(750000);
        cuenta.mostrarDetalles();

        cuenta.setSaldo(-20000);
        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}
