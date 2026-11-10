package taller17_lsp.ej2_cuentas;

public class Principal {

    public static void main(String[] args) {
        CuentaAhorros ahorros = new CuentaAhorros(100000, 5);
        CuentaBancaria cuenta = ahorros;

        cuenta.depositar(50000);
        cuenta.retirar(20000);
        ahorros.aplicarInteres();

        System.out.println("Saldo final: " + cuenta.getSaldo());
        System.out.println("\nCuentaAhorros mantiene el contrato de CuentaBancaria.");
    }
}
