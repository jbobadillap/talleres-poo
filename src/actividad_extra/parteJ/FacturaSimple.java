package actividad_extra.parteJ;

public class FacturaSimple {
    public String numero;
    public String cliente;
    public double valor;

    public void aplicarDescuento() {
        valor -= valor * 0.10;
    }

    public void mostrarFactura() {
        System.out.println("Factura " + numero + " | Cliente: " + cliente + " | Valor: $" + valor);
    }
}
