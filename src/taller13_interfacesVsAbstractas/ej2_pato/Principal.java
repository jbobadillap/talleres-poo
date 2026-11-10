package taller13_interfacesVsAbstractas.ej2_pato;

public class Principal {

    public static void main(String[] args) {
        Pato pato = new Pato();

        pato.volar();
        pato.nadar();

        System.out.println("\nUso con referencias de las interfaces:");
        Volador volador = pato;
        Nadador nadador = pato;
        volador.volar();
        nadador.nadar();
    }
}
