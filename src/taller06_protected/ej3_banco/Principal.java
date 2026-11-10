package taller06_protected.ej3_banco;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Version insegura (saldo protected):");
        Banco banco = new Banco(1000);
        banco.mostrarSaldo();
        banco.saldo = -500; // Acceso permitido por protected dentro del paquete.
        banco.mostrarSaldo();

        System.out.println("\nVersion segura (saldo private):");
        BancoSeguro bancoSeguro = new BancoSeguro(1000);
        System.out.println("Saldo inicial: " + bancoSeguro.getSaldo());

        bancoSeguro.depositar(500);
        System.out.println("Despues de depositar 500: " + bancoSeguro.getSaldo());

        bancoSeguro.retirar(2000);
        bancoSeguro.retirar(300);
        System.out.println("Despues de retirar 300: " + bancoSeguro.getSaldo());

        bancoSeguro.depositar(-100);
        System.out.println("Saldo final: " + bancoSeguro.getSaldo());
    }
}
