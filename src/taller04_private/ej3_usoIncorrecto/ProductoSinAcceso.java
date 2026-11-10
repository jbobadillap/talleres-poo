package taller04_private.ej3_usoIncorrecto;

public class ProductoSinAcceso {

    private double precio;

    public ProductoSinAcceso(double precio) {
        this.precio = precio;
    }

    public void actualizarPrecio(double nuevoPrecio) {
        precio = nuevoPrecio;
    }

    public double calcularPrecioConIva() {
        return precio * 1.19;
    }

    public void aplicarDescuento(double porcentaje) {
        precio = precio - (precio * porcentaje / 100);
    }
}
