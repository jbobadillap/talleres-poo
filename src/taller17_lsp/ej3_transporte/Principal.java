package taller17_lsp.ej3_transporte;

public class Principal {

    public static void main(String[] args) {
        Transporte[] transportes = {
                new Bicicleta(),
                new Coche()
        };

        for (Transporte transporte : transportes) {
            transporte.mover();
        }

        System.out.println("\nLos dos transportes se usan sin cambiar el programa.");
    }
}
