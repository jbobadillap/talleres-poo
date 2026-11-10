package taller12_interfaces.ej2_pez;

public class Principal {

    public static void main(String[] args) {
        Pez pez = new Pez("Tiburon");

        pez.nadar();
        pez.respirar();

        System.out.println("\nUso con referencias de las interfaces:");
        Nadador nadador = pez;
        Respirador respirador = pez;
        nadador.nadar();
        respirador.respirar();
    }
}
