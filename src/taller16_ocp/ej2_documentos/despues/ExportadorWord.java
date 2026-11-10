package taller16_ocp.ej2_documentos.despues;

public class ExportadorWord implements ExportadorDocumento {

    @Override
    public void exportar(Documento documento) {
        System.out.println("Exportando a Word: " + documento.getTitulo());
        System.out.println(documento.getContenido());
    }
}
