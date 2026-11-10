package taller04_private.ej3_usoIncorrecto;

public class Principal {

    public static void main(String[] args) {
        ProductoSinAcceso producto = new ProductoSinAcceso(100.0);

        System.out.println("Precio con IVA: " + producto.calcularPrecioConIva());

        producto.actualizarPrecio(-50.0);
        System.out.println("Precio con IVA tras actualizar a -50: "
                + producto.calcularPrecioConIva());

        producto.aplicarDescuento(200);
        System.out.println("Precio con IVA tras descuento del 200%: "
                + producto.calcularPrecioConIva());

        System.out.println("\nConsecuencias:");
        System.out.println("- No existe getPrecio(): el precio no puede consultarse.");
        System.out.println("- No existe setPrecio() con validacion: se aceptan valores negativos.");
        System.out.println("- La clase queda desprotegida e incomoda de reutilizar.");
    }
}
