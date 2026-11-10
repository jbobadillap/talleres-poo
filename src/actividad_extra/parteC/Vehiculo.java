package actividad_extra.parteC;

public class Vehiculo {
    public String marca;
    public String modelo;
    public int velocidadActual;

    public void mostrarEstado() {
        System.out.println("Vehiculo: " + marca + " " + modelo + " | Velocidad actual: " + velocidadActual + " km/h");
    }

    public void acelerar() {
        velocidadActual += 10;
    }

    public void frenar() {
        velocidadActual -= 10;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
    }
}
