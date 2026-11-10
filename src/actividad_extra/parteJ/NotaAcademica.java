package actividad_extra.parteJ;

public class NotaAcademica {
    public String asignatura;
    public double nota1;
    public double nota2;
    public double nota3;

    public double calcularDefinitiva() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public void mostrarDefinitiva() {
        System.out.println(asignatura + " | Definitiva: " + calcularDefinitiva());
    }
}
