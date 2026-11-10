package actividad_extra.parteA;

public class Vehiculo {
    public String marca;
    public String modelo;
    public int velocidadActual;

    public void mostrarEstado() {
        System.out.println("Vehiculo: " + marca + " " + modelo + " | Velocidad actual: " + velocidadActual + " km/h");
    }
}
