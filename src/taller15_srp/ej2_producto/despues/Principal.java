package taller15_srp.ej2_producto.despues;

public class Principal {

    public static void main(String[] args) {
        Producto producto = new Producto("Teclado", 120000);
        EtiquetaService etiquetas = new EtiquetaService();
        PrecioService precios = new PrecioService();

        etiquetas.generar(producto);
        System.out.println("Precio final: " + precios.calcularPrecioFinal(producto, 0.19));

        System.out.println("\nProducto solo guarda sus datos.");
    }
}
