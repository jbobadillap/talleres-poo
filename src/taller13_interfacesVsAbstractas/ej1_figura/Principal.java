package taller13_interfacesVsAbstractas.ej1_figura;

public class Principal {

    public static void main(String[] args) {
        Figura[] figuras = {
                new Rectangulo(6, 3),
                new Triangulo(6, 4)
        };

        for (Figura figura : figuras) {
            figura.mostrarArea();
        }
    }
}
