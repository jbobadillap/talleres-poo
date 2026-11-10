package taller02_encapsulamiento;

public class Principal {
    public static void main(String[] args) {
        Producto p = new Producto("Laptop", 1500.00);
        p.mostrarProducto();

        Estudiante e1 = new Estudiante("Ana", 20);
        e1.mostrarEstudiante();

        Estudiante e2 = new Estudiante();
        e2.mostrarEstudiante();
    }
}
