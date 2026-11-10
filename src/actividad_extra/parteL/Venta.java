package actividad_extra.parteL;

public class Venta {
    public String producto;
    public int cantidad;
    public double precioUnitario;

    public double calcularTotal() {
        return cantidad * precioUnitario;
    }

    public void mostrarVenta() {
        System.out.println("Venta de " + producto + " x" + cantidad + " | Total: $" + calcularTotal());
    }
}
