package taller11_abstractas.ej2_empleado;

public class Principal {

    public static void main(String[] args) {
        Empleado[] empleados = {
                new Gerente("Laura Pineda", 4500000, 800000),
                new Vendedor("Mario Cardenas", 2500000, 600000)
        };

        for (Empleado empleado : empleados) {
            empleado.mostrarDetalles();
        }
    }
}
