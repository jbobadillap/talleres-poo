package taller14_polimorfismo.ej1_figura;

public class Principal {

    public static void main(String[] args) {
        Figura figura = new Circulo(3);
        figura.calcularArea();

        figura = new Rectangulo(4, 5);
        figura.calcularArea();

        System.out.println("\nLa referencia es Figura, pero se ejecuta la version de cada subclase.");
    }
}
