package actividad_extra.parteL;

public class Despertador {
    public int hora;
    public int minuto;
    public boolean activo;

    public void mostrarAlarma() {
        System.out.println("Alarma: " + hora + ":" + minuto + " | Activa: " + activo);
    }

    public void activar() {
        activo = true;
    }

    public void desactivar() {
        activo = false;
    }
}
