package taller16_ocp.ej2_documentos.antes;

public class Documento {

    private final String titulo;
    private final String contenido;

    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public void exportarPDF() {
        System.out.println("Exportando a PDF: " + titulo);
        System.out.println(contenido);
    }
}
