package taller11_abstractas.ej3_usoIncorrecto;

public class Principal {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal perro = new Perro();

        animal.hacerSonido();
        perro.hacerSonido();

        System.out.println("\nEl metodo concreto no obliga a sobrescribir.");
        System.out.println("Si una subclase no lo cambia, usa el mensaje generico.");
        System.out.println("Si el cambio es obligatorio, el metodo deberia ser abstracto.");
    }
}
