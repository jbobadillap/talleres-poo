package taller17_lsp.ej4_violacionVehiculo;

public class CocheElectrico extends Vehiculo {

    @Override
    public void mover() {
        throw new UnsupportedOperationException("El coche electrico necesita recarga.");
    }
}
