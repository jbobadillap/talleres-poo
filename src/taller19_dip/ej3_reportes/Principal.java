package taller19_dip.ej3_reportes;

public class Principal {

    public static void main(String[] args) {
        GestorReportes pdf = new GestorReportes(new ReportePDF());
        pdf.exportar("Ventas de octubre");

        GestorReportes excel = new GestorReportes(new ReporteExcel());
        excel.exportar("Ventas de octubre");

        System.out.println("\nSolo cambia la implementacion, no el gestor.");
    }
}
