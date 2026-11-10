package taller16_ocp.ej2_documentos.despues;

public class ExportadorExcel implements ExportadorDocumento {

    @Override
    public void exportar(Documento documento) {
        System.out.println("Exportando a Excel: " + documento.getTitulo());
        System.out.println(documento.getContenido());
    }
}
