package actividad_extra.parteG;

public class Puerta {
    public String material;
    public boolean abierta;

    public void abrir() {
        abierta = true;
    }

    public void cerrar() {
        abierta = false;
    }

    public void mostrarEstado() {
        System.out.println("Puerta de " + material + " | Abierta: " + abierta);
    }
}
