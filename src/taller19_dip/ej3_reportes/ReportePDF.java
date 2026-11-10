package taller19_dip.ej3_reportes;

public class ReportePDF implements GeneradorReporte {

    @Override
    public String generar(String datos) {
        return "Reporte PDF con los datos: " + datos;
    }
}
