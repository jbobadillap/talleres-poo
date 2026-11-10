package actividad_extra.parteG;

public class Ventilador {
    public String marca;
    public int velocidad;
    public boolean encendido;

    public void encender() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
        velocidad = 0;
    }

    public void subirVelocidad() {
        velocidad++;
    }

    public void mostrarEstado() {
        System.out.println("Ventilador " + marca + " | Velocidad: " + velocidad + " | Encendido: " + encendido);
    }
}
