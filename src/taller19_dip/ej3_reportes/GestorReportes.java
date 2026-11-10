package taller19_dip.ej3_reportes;

public class GestorReportes {

    private final GeneradorReporte generador;

    public GestorReportes(GeneradorReporte generador) {
        this.generador = generador;
    }

    public void exportar(String datos) {
        System.out.println(generador.generar(datos));
    }
}
