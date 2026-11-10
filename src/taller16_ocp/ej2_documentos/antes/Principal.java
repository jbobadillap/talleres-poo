package taller16_ocp.ej2_documentos.antes;

public class Principal {

    public static void main(String[] args) {
        Documento documento = new Documento("Informe", "Contenido del informe.");

        documento.exportarPDF();

        System.out.println("\nProblema: para exportar a Word o Excel");
        System.out.println("habria que modificar la clase Documento.");
    }
}
