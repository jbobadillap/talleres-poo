package taller15_srp.ej2_producto.antes;

public class Principal {

    public static void main(String[] args) {
        Producto producto = new Producto("Teclado", 120000);

        producto.mostrarDatos();
        producto.generarEtiqueta();
        System.out.println("Precio final: " + producto.calcularPrecioFinal(0.19));

        System.out.println("\nProblema: Producto muestra datos, genera etiqueta y calcula precios.");
    }
}
