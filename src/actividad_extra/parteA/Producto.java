package actividad_extra.parteA;

public class Producto {
    public String nombre;
    public double precio;
    public int stock;

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Stock: " + stock);
    }
}
