package taller09_super.ej2_animalPez;

public class Principal {

    public static void main(String[] args) {
        Pez pez = new Pez("Tiburon", "Salada");

        System.out.println("Datos del pez:");
        pez.mostrarEspecie();

        System.out.println("\nLlamada con referencia Animal:");
        Animal animal = pez;
        animal.mostrarEspecie();
    }
}
