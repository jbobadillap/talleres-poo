package taller17_lsp.ej4_violacionVehiculo;

public class Principal {

    public static void main(String[] args) {
        Vehiculo vehiculo = new CocheElectrico();

        try {
            vehiculo.mover();
        } catch (UnsupportedOperationException e) {
            System.out.println("Fallo la sustitucion: " + e.getMessage());
        }

        System.out.println("\nUn programa que usa Vehiculo no espera esta excepcion.");
    }
}
