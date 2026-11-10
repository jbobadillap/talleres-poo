package taller03_static;

class Coche {
    String marca;
    String modelo;
    static int contadorCoches = 0;

    Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }

    static void mostrarCoches() {
        System.out.println("Coches creados: " + contadorCoches);
    }
}