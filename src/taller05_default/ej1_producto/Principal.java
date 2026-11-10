package taller05_default.ej1_producto;

public class Principal {

    public static void main(String[] args) {
        Producto producto = new Producto("Teclado mecanico", 150000, 12);

        producto.mostrarInfo();

        producto.precio = 135000;
        producto.stock = 10;
        System.out.println("Acceso directo desde el mismo paquete:");
        producto.mostrarInfo();
    }
}
