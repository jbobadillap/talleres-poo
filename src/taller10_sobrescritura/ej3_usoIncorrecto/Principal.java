package taller10_sobrescritura.ej3_usoIncorrecto;

public class Principal {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal gato = new Gato();

        animal.hacerSonido();
        gato.hacerSonido();

        System.out.println("\nLa clase Gato sobrescribe sin @Override.");
        System.out.println("Funciona, pero el compilador no avisa si la firma cambia.");
    }
}
