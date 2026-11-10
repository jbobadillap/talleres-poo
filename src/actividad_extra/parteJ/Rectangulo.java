package actividad_extra.parteJ;

public class Rectangulo {
    public double base;
    public double altura;

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public void mostrarResultados() {
        System.out.println("Rectangulo base=" + base + " altura=" + altura
                + " | Area: " + calcularArea() + " | Perimetro: " + calcularPerimetro());
    }
}
