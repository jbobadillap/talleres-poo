package actividad_extra.parteC;

public class MainParteC {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 11 y 12: acelerar y frenar ===");
        Vehiculo v = new Vehiculo();
        v.marca = "Honda";
        v.modelo = "Civic";
        v.velocidadActual = 20;
        v.mostrarEstado();
        v.acelerar();
        v.mostrarEstado();
        v.frenar();
        v.frenar();
        v.frenar();
        v.mostrarEstado();

        System.out.println("=== Ejercicio 13 y 14: consignar y retirar ===");
        CuentaBancaria c = new CuentaBancaria();
        c.numero = "100";
        c.titular = "Maria";
        c.saldo = 200000;
        c.mostrarCuenta();
        c.consignar(50000);
        c.mostrarCuenta();
        c.retirar(100000);
        c.mostrarCuenta();
        c.retirar(999999);
        c.mostrarCuenta();

        System.out.println("=== Ejercicio 15 y 16: vender y reabastecer ===");
        Producto p = new Producto();
        p.nombre = "Televisor";
        p.precio = 1500000;
        p.stock = 10;
        p.mostrarProducto();
        p.vender(3);
        p.mostrarProducto();
        p.reabastecer(5);
        p.mostrarProducto();

        System.out.println("=== Ejercicio 17: cambiarSemestre ===");
        Estudiante e = new Estudiante();
        e.nombre = "Pedro";
        e.codigo = "20241002";
        e.semestre = 2;
        e.mostrarInfo();
        e.cambiarSemestre(5);
        e.mostrarInfo();

        System.out.println("=== Ejercicio 18: cumplirAnios ===");
        Mascota m = new Mascota();
        m.nombre = "Michi";
        m.especie = "Gato";
        m.edad = 3;
        m.mostrarMascota();
        m.cumplirAnios();
        m.mostrarMascota();
    }
}
