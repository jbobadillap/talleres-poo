package actividad_extra.parteE;

public class MainParteE {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 23 y 24: constructores de Libro ===");
        Libro libroVacio = new Libro();
        libroVacio.titulo = "Sin titulo";
        libroVacio.autor = "Anonimo";
        libroVacio.paginas = 0;
        libroVacio.mostrarInfo();

        Libro libroConParametros = new Libro("El Hobbit", "J.R.R. Tolkien", 310);
        libroConParametros.mostrarInfo();

        System.out.println("=== Ejercicio 25 ===");
        Libro usandoVacio = new Libro();
        usandoVacio.mostrarInfo();

        Libro usandoParametros = new Libro("Rayuela", "Julio Cortazar", 600);
        usandoParametros.mostrarInfo();

        System.out.println("=== Ejercicio 26: Producto ===");
        Producto prodVacio = new Producto();
        prodVacio.mostrarProducto();

        Producto prodParametros = new Producto("Cafe", 12500, 40);
        prodParametros.mostrarProducto();

        System.out.println("=== Ejercicio 27 y 28: tres cuentas ===");
        CuentaBancaria cuenta1 = new CuentaBancaria("001", "Ana", 500000);
        CuentaBancaria cuenta2 = new CuentaBancaria("002", "Luis", 120000);
        CuentaBancaria cuenta3 = new CuentaBancaria("003", "Sofia", 0);

        cuenta1.mostrarCuenta();
        cuenta2.mostrarCuenta();
        cuenta3.mostrarCuenta();
    }
}
