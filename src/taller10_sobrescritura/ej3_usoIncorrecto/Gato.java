package taller10_sobrescritura.ej3_usoIncorrecto;

public class Gato extends Animal {

    // Compila y funciona, pero falta @Override. Es una mala practica.
    public void hacerSonido() {
        System.out.println("El gato maulla.");
    }
}
