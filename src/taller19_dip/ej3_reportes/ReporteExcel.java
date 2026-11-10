package taller19_dip.ej3_reportes;

public class ReporteExcel implements GeneradorReporte {

    @Override
    public String generar(String datos) {
        return "Reporte Excel con los datos: " + datos;
    }
}
