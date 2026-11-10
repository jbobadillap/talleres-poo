package actividad_extra.parteJ;

public class Semaforo {
    public String colorActual;

    public void cambiar() {
        if (colorActual.equals("rojo")) {
            colorActual = "verde";
        } else if (colorActual.equals("verde")) {
            colorActual = "amarillo";
        } else {
            colorActual = "rojo";
        }
    }

    public void mostrarEstado() {
        System.out.println("Semaforo en: " + colorActual);
    }
}
