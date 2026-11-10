package taller14_polimorfismo.ej1_figura;

public class Circulo extends Figura {

    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * radio * radio;
        System.out.println("Area del circulo: " + area);
    }
}
