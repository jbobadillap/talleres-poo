package taller16_ocp.ej2_documentos.despues;

public class Principal {

    public static void main(String[] args) {
        Documento documento = new Documento("Informe", "Contenido del informe.");
        GestorDocumentos gestor = new GestorDocumentos();

        gestor.exportar(documento, new ExportadorPDF());
        gestor.exportar(documento, new ExportadorWord());
        gestor.exportar(documento, new ExportadorExcel());

        System.out.println("\nLos formatos nuevos se agregaron sin modificar el gestor.");
    }
}
