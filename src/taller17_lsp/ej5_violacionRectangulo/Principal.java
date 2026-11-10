package taller17_lsp.ej5_violacionRectangulo;

public class Principal {

    public static void main(String[] args) {
        Rectangulo rectangulo = new Cuadrado(5);

        rectangulo.setAncho(10);

        System.out.println("Ancho: " + rectangulo.getAncho());
        System.out.println("Alto: " + rectangulo.getAlto());
        System.out.println("Area: " + rectangulo.calcularArea());

        System.out.println("\nSi fuera un rectangulo normal, el area esperada seria 50.");
        System.out.println("Cuadrado cambio el alto y por eso no puede sustituir a Rectangulo.");
    }
}
