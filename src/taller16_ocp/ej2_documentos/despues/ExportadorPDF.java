package taller16_ocp.ej2_documentos.despues;

public class ExportadorPDF implements ExportadorDocumento {

    @Override
    public void exportar(Documento documento) {
        System.out.println("Exportando a PDF: " + documento.getTitulo());
        System.out.println(documento.getContenido());
    }
}
