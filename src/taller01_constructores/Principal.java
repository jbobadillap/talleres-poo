package taller01_constructores;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar datos de un Libro");
        System.out.print("Titulo: ");
        String titulo = sc.nextLine();
        System.out.print("Autor: ");
        String autor = sc.nextLine();
        System.out.print("Numero de paginas: ");
        int paginas = sc.nextInt();
        sc.nextLine();

        Libro libro = new Libro(titulo, autor, paginas);

        System.out.println("\nIngresar datos de una CuentaBancaria");
        System.out.print("Numero de cuenta: ");
        String numeroCuenta = sc.nextLine();
        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();
        sc.nextLine();
        System.out.print("Tipo de cuenta: ");
        String tipoCuenta = sc.nextLine();

        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, saldo, tipoCuenta);

        System.out.println("\nIngresar datos de un Estudiante");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Curso: ");
        String curso = sc.nextLine();

        Estudiante estudiante = new Estudiante(nombre, edad, curso);

        System.out.println("\nDetalles de los objetos");
        System.out.println("Libro:\n" + libro);
        System.out.println("\nCuentaBancaria:\n" + cuenta);
        System.out.println("\nEstudiante:\n" + estudiante);
    }
}