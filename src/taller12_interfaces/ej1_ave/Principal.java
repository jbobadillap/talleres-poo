package taller12_interfaces.ej1_ave;

public class Principal {

    public static void main(String[] args) {
        Ave ave = new Ave("Canario");

        ave.volar();
        ave.cantar();
        ave.planear();
        Volador.avisar();

        System.out.println("\nUso con referencias de las interfaces:");
        Volador volador = ave;
        Cantante cantante = ave;
        volador.volar();
        cantante.cantar();
    }
}
