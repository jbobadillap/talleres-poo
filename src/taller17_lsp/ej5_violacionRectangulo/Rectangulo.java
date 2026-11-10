package taller17_lsp.ej5_violacionRectangulo;

public class Rectangulo {

    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho > 0 ? ancho : 0;
        this.alto = alto > 0 ? alto : 0;
    }

    public void setAncho(double ancho) {
        if (ancho > 0) {
            this.ancho = ancho;
        }
    }

    public void setAlto(double alto) {
        if (alto > 0) {
            this.alto = alto;
        }
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double calcularArea() {
        return ancho * alto;
    }
}
