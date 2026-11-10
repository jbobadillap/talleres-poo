package taller15_srp.ej2_producto.antes;

public class Producto {

    private final String nombre;
    private final double precioBase;

    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public void mostrarDatos() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio base: " + precioBase);
    }

    public void generarEtiqueta() {
        System.out.println("Etiqueta: " + nombre + " - $" + precioBase);
    }

    public double calcularPrecioFinal(double impuesto) {
        return precioBase * (1 + impuesto);
    }
}
