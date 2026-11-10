package taller11_abstractas.ej1_figura;

public class Principal {

    public static void main(String[] args) {
        Figura[] figuras = {
                new Circulo(3),
                new Rectangulo(5, 4)
        };

        for (Figura figura : figuras) {
            figura.mostrarArea();
        }
    }
}
