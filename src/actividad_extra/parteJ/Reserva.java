package actividad_extra.parteJ;

public class Reserva {
    public String nombreCliente;
    public String fecha;
    public boolean activa;

    public void confirmar() {
        activa = true;
    }

    public void cancelar() {
        activa = false;
    }

    public void mostrarEstado() {
        System.out.println("Reserva de " + nombreCliente + " | Fecha: " + fecha + " | Activa: " + activa);
    }
}
