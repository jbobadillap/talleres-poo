package taller04_private.ej2_coche;

public class Coche {

    private String marca;
    private String modelo;
    private double velocidadMaxima;

    public Coche(String marca, String modelo, double velocidadMaxima) {
        setMarca(marca);
        setModelo(modelo);
        setVelocidadMaxima(velocidadMaxima);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isBlank()) {
            System.out.println("Marca invalida.");
            return;
        }
        this.marca = marca.trim();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()) {
            System.out.println("Modelo invalido.");
            return;
        }
        this.modelo = modelo.trim();
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        if (velocidadMaxima < 0) {
            System.out.println("La velocidad maxima no puede ser negativa.");
            return;
        }
        this.velocidadMaxima = velocidadMaxima;
    }

    public void acelerar(double incremento) {
        if (incremento <= 0) {
            System.out.println("El incremento debe ser positivo.");
            return;
        }
        velocidadMaxima += incremento;
    }

    @Override
    public String toString() {
        return "Coche{marca='" + marca + "', modelo='" + modelo
                + "', velocidadMaxima=" + velocidadMaxima + " km/h}";
    }
}
