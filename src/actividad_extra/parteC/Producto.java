package actividad_extra.parteC;

public class Producto {
    public String nombre;
    public double precio;
    public int stock;

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Stock: " + stock);
    }

    public void vender(int cantidad) {
        stock -= cantidad;
    }

    public void reabastecer(int cantidad) {
        stock += cantidad;
    }
}
