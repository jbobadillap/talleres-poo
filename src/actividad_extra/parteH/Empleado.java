package actividad_extra.parteH;

public class Empleado {
    public String nombre;
    public String cargo;
    public double salario;

    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre + " | Cargo: " + cargo + " | Salario: $" + salario);
    }
}
