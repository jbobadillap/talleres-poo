package taller19_dip.ej4_violacion;

public class Principal {

    public static void main(String[] args) {
        TarjetaCredito tarjeta = new TarjetaCredito();
        ProcesadorPago procesador = new ProcesadorPago(tarjeta);

        procesador.realizarPago(150000);

        System.out.println("\nProblema: ProcesadorPago depende de TarjetaCredito.");
        System.out.println("Para agregar otro pago hay que modificar la clase de alto nivel.");
    }
}
