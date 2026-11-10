package taller16_ocp.ej2_documentos.despues;

public class GestorDocumentos {

    public void exportar(Documento documento, ExportadorDocumento exportador) {
        exportador.exportar(documento);
    }
}
