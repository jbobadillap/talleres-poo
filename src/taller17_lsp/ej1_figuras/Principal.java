package taller17_lsp.ej1_figuras;

public class Principal {

    public static void main(String[] args) {
        Figura[] figuras = {
                new Circulo(3),
                new Rectangulo(4, 5)
        };

        for (Figura figura : figuras) {
            System.out.println("Area: " + figura.calcularArea());
        }

        System.out.println("\nLas dos figuras sustituyen a Figura sin alterar el calculo.");
    }
}
