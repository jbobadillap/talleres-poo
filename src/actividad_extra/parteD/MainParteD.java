package actividad_extra.parteD;

import actividad_extra.parteA.Estudiante;
import actividad_extra.parteA.Producto;
import actividad_extra.parteA.Vehiculo;

public class MainParteD {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 19 ===");
        /*
         * Estudiante es una CLASE porque es una plantilla o molde que describe
         * que atributos (nombre, codigo, semestre) y que comportamientos
         * (mostrarInfo) tendra cualquier estudiante. No representa a ninguna
         * persona en concreto.
         *
         * est1 es un OBJETO porque es una instancia real creada a partir de esa
         * plantilla: ocupa memoria, tiene sus propios valores (Camilo, 20241001, 3)
         * y es con el que realmente trabajamos en el programa.
         */
        Estudiante est1 = new Estudiante();
        est1.nombre = "Camilo";
        est1.codigo = "20241001";
        est1.semestre = 3;
        est1.mostrarInfo();

        System.out.println("=== Ejercicio 20 ===");
        Vehiculo a = new Vehiculo();
        a.marca = "Renault";
        a.modelo = "Logan";
        a.velocidadActual = 40;

        Vehiculo b = new Vehiculo();
        b.marca = "Chevrolet";
        b.modelo = "Spark";
        b.velocidadActual = 70;

        Vehiculo c = new Vehiculo();
        c.marca = "Kia";
        c.modelo = "Picanto";
        c.velocidadActual = 55;

        a.mostrarEstado();
        b.mostrarEstado();
        c.mostrarEstado();
        /*
         * Los tres objetos comparten la MISMA ESTRUCTURA: todos tienen los
         * atributos marca, modelo y velocidadActual y el metodo mostrarEstado(),
         * porque fueron creados desde la misma clase Vehiculo.
         *
         * En lo que se DIFERENCIAN es en el ESTADO: cada uno guarda sus propios
         * valores (una marca, modelo y velocidad distinta), que estan almacenados
         * en ubicaciones de memoria independientes.
         */

        System.out.println("=== Ejercicio 21 ===");
        Producto x = new Producto();
        x.nombre = "Agua";
        x.precio = 3000;
        x.stock = 50;

        Producto y = new Producto();
        y.nombre = "Gaseosa";
        y.precio = 3000;
        y.stock = 10;

        x.mostrarProducto();
        y.mostrarProducto();
        System.out.println("Ambos productos comparten el mismo precio (3000) pero difieren en nombre y stock.");

        System.out.println("=== Ejercicio 22 ===");
        Libro l1 = new Libro();
        l1.titulo = "Cien anios de soledad";
        l1.autor = "Gabriel Garcia Marquez";
        l1.paginas = 471;

        Libro l2 = new Libro();
        l2.titulo = "Don Quijote";
        l2.autor = "Miguel de Cervantes";
        l2.paginas = 863;

        Libro l3 = new Libro();
        l3.titulo = "1984";
        l3.autor = "George Orwell";
        l3.paginas = 328;

        Libro l4 = new Libro();
        l4.titulo = "El Principito";
        l4.autor = "Antoine de Saint-Exupery";
        l4.paginas = 96;

        l1.mostrarInfo();
        l2.mostrarInfo();
        l3.mostrarInfo();
        l4.mostrarInfo();
        /*
         * Conclusion: la clase Libro es una PLANTILLA que define que todo libro
         * tiene titulo, autor y paginas, pero no contiene ningun dato concreto.
         * Los objetos l1, l2, l3 y l4 son CASOS CONCRETOS de esa plantilla: cada
         * uno existe con sus propios valores y es una instancia independiente.
         */
    }
}
