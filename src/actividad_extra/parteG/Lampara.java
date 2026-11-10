package actividad_extra.parteG;

public class Lampara {
    public String marca;
    public boolean encendida;

    public void encender() {
        encendida = true;
    }

    public void apagar() {
        encendida = false;
    }

    public void mostrarEstado() {
        System.out.println("Lampara " + marca + " | Encendida: " + encendida);
    }
}
