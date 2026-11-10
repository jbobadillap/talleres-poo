package actividad_extra.parteG;

public class Celular {
    public String marca;
    public int bateria;
    public boolean prendido;

    public void encender() {
        prendido = true;
    }

    public void apagar() {
        prendido = false;
    }

    public void cargarBateria() {
        bateria += 10;
        if (bateria > 100) {
            bateria = 100;
        }
    }

    public void mostrarEstado() {
        System.out.println("Celular " + marca + " | Bateria: " + bateria + "% | Prendido: " + prendido);
    }
}
