package taller16_ocp.ej2_documentos.despues;

public class Documento {

    private final String titulo;
    private final String contenido;

    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }
}
