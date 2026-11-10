package taller15_srp.ej2_producto.despues;

public class PrecioService {

    public double calcularPrecioFinal(Producto producto, double impuesto) {
        return producto.getPrecioBase() * (1 + impuesto);
    }
}
