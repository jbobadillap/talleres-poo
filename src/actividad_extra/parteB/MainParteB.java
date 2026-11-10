package actividad_extra.parteB;

import actividad_extra.parteA.CuentaBancaria;
import actividad_extra.parteA.Estudiante;
import actividad_extra.parteA.Mascota;
import actividad_extra.parteA.Producto;
import actividad_extra.parteA.Vehiculo;

public class MainParteB {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 6 ===");
        Estudiante est1 = new Estudiante();
        est1.nombre = "Camilo";
        est1.codigo = "20241001";
        est1.semestre = 3;
        est1.mostrarInfo();

        System.out.println("=== Ejercicio 7 ===");
        Vehiculo v1 = new Vehiculo();
        v1.marca = "Toyota";
        v1.modelo = "Corolla";
        v1.velocidadActual = 60;
        v1.mostrarEstado();

        Vehiculo v2 = new Vehiculo();
        v2.marca = "Mazda";
        v2.modelo = "3";
        v2.velocidadActual = 90;
        v2.mostrarEstado();

        System.out.println("=== Ejercicio 8 ===");
        Producto p1 = new Producto();
        p1.nombre = "Lapiz";
        p1.precio = 1500;
        p1.stock = 100;
        p1.mostrarProducto();

        Producto p2 = new Producto();
        p2.nombre = "Cuaderno";
        p2.precio = 8500;
        p2.stock = 30;
        p2.mostrarProducto();

        Producto p3 = new Producto();
        p3.nombre = "Borrador";
        p3.precio = 1200;
        p3.stock = 5;
        p3.mostrarProducto();

        System.out.println("=== Ejercicio 9 ===");
        Mascota m1 = new Mascota();
        m1.nombre = "Rocky";
        m1.especie = "Perro";
        m1.edad = 2;
        m1.mostrarMascota();

        m1.edad = 4;
        m1.mostrarMascota();

        m1.edad = 6;
        m1.mostrarMascota();

        System.out.println("=== Ejercicio 10 ===");
        CuentaBancaria c1 = new CuentaBancaria();
        c1.numero = "001";
        c1.titular = "Ana";
        c1.saldo = 500000;
        c1.mostrarCuenta();

        CuentaBancaria c2 = new CuentaBancaria();
        c2.numero = "002";
        c2.titular = "Luis";
        c2.saldo = 150000;
        c2.mostrarCuenta();
    }
}
