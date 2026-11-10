package taller14_polimorfismo.ej1_figura;

public class Rectangulo extends Figura {

    private final double base;
    private final double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area = base * altura;
        System.out.println("Area del rectangulo: " + area);
    }
}
