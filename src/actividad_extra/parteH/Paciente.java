package actividad_extra.parteH;

public class Paciente {
    public String nombre;
    public String documento;
    public String diagnostico;

    public void mostrarInfo() {
        System.out.println("Paciente: " + nombre + " | Documento: " + documento + " | Diagnostico: " + diagnostico);
    }
}
