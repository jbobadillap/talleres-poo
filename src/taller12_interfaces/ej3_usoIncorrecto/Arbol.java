package taller12_interfaces.ej3_usoIncorrecto;

public class Arbol implements Corredor {

    @Override
    public void correr() {
        System.out.println("Los arboles no pueden correr.");
    }
}
