package taller12_interfaces.ej3_usoIncorrecto;

public class Principal {

    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        arbol.correr();

        System.out.println("\nEl codigo compila, pero la interfaz no tiene sentido");
        System.out.println("para un arbol. Es una mala practica de diseno.");
    }
}
