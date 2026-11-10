package actividad_extra.parteJ;

public class InventarioItem {
    public String nombre;
    public int cantidad;
    public double precioUnitario;

    public double calcularValorTotal() {
        return cantidad * precioUnitario;
    }

    public void mostrarItem() {
        System.out.println(nombre + " | Cantidad: " + cantidad
                + " | Precio unitario: $" + precioUnitario + " | Valor total: $" + calcularValorTotal());
    }
}
