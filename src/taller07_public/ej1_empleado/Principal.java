package taller07_public.ej1_empleado;

public class Principal {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Sofia Martinez", 3200000);

        System.out.println("Acceso directo al nombre publico: " + empleado.nombre);
        System.out.println("Salario por getter: " + empleado.getSalario());

        empleado.nombre = "Sofia Martinez Rojas";
        empleado.setSalario(3500000);
        empleado.mostrarInformacion();

        empleado.setSalario(-1000);
        System.out.println("Salario final: " + empleado.getSalario());
    }
}
