package taller04_private.ej2_coche;

public class Principal {

    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 180);
        System.out.println("Coche inicial: " + coche);

        coche.acelerar(20);
        System.out.println("Despues de acelerar 20: " + coche);

        coche.acelerar(-50);
        System.out.println("Despues de intentar acelerar -50: " + coche);

        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Velocidad maxima: " + coche.getVelocidadMaxima());
    }
}
