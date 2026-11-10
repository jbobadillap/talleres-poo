package taller08_herenciaSimple.ej1_vehiculoCoche;

public class Vehiculo {

    protected String marca;
    protected double velocidadMaxima;

    public Vehiculo(String marca, double velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca
                + ", Velocidad maxima: " + velocidadMaxima + " km/h");
    }
}
