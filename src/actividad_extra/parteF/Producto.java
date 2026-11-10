package actividad_extra.parteF;

public class Producto {
    public String nombre;
    public double precio;
    public int stock;

    public Producto() {
    }

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public static Producto crearProductoBasico() {
        Producto p = new Producto();
        p.nombre = "Producto basico";
        p.precio = 0;
        p.stock = 0;
        return p;
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Stock: " + stock);
    }
}
