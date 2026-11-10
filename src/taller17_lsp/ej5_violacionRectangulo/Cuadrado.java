package taller17_lsp.ej5_violacionRectangulo;

public class Cuadrado extends Rectangulo {

    public Cuadrado(double lado) {
        super(lado, lado);
    }

    @Override
    public void setAncho(double ancho) {
        super.setAncho(ancho);
        super.setAlto(ancho);
    }

    @Override
    public void setAlto(double alto) {
        super.setAlto(alto);
        super.setAncho(alto);
    }
}
