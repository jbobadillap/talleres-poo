package actividad_extra.parteF;

public class MainParteF {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 29 y 30: tres formas de construir Estudiante ===");
        Estudiante e1 = new Estudiante();
        e1.nombre = "Carlos";
        e1.codigo = "A001";
        e1.semestre = 1;
        e1.mostrarInfo();

        Estudiante e2 = new Estudiante("Laura", "A002");
        e2.mostrarInfo();

        Estudiante e3 = new Estudiante("Diego", "A003", 4);
        e3.mostrarInfo();

        System.out.println("=== Ejercicio 31 y 32: metodo fabrica ===");
        Producto basico1 = Producto.crearProductoBasico();
        Producto basico2 = Producto.crearProductoBasico();
        basico1.mostrarProducto();
        basico2.mostrarProducto();

        System.out.println("=== Ejercicio 33 y 34: constructor copia ===");
        Libro original = new Libro("La Odisea", "Homero", 400);
        Libro copia = new Libro(original);

        original.mostrarInfo();
        copia.mostrarInfo();
    }
}
