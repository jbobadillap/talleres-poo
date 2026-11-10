package actividad_extra.parteJ;

public class Avion {
    public String aerolinea;
    public String destino;
    public int pasajeros;

    public void abordar(int cantidad) {
        pasajeros += cantidad;
    }

    public void mostrarEstado() {
        System.out.println("Avion " + aerolinea + " | Destino: " + destino + " | Pasajeros: " + pasajeros);
    }
}
