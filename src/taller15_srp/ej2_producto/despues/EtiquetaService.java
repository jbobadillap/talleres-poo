package taller15_srp.ej2_producto.despues;

public class EtiquetaService {

    public void generar(Producto producto) {
        System.out.println("Etiqueta: " + producto.getNombre()
                + " - $" + producto.getPrecioBase());
    }
}
