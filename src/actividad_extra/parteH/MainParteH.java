package actividad_extra.parteH;

public class MainParteH {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 41 ===");
        Empleado emp1 = new Empleado();
        emp1.nombre = "Andrea";
        emp1.cargo = "Ingeniera";
        emp1.salario = 4500000;
        emp1.mostrarInfo();

        Empleado emp2 = new Empleado();
        emp2.nombre = "Jorge";
        emp2.cargo = "Disenador";
        emp2.salario = 3200000;
        emp2.mostrarInfo();
        /*
         * Modelar un Empleado con una clase y objetos es mejor que usar variables
         * sueltas porque cada empleado reune en un solo lugar todos sus datos
         * (nombre, cargo, salario) y sus comportamientos (mostrarInfo). Con la
         * programacion estructurada habria que declarar por separado nombre1,
         * cargo1, salario1, nombre2, cargo2, salario2..., sin ninguna relacion
         * entre ellos. La clase permite crear tantos empleados como se necesiten
         * reutilizando el mismo molde, manteniendo cada dato agrupado y coherente,
         * lo que facilita leer, modificar y ampliar el programa.
         */

        System.out.println("=== Ejercicio 42 ===");
        Curso c1 = new Curso();
        c1.nombre = "Programacion Orientada a Objetos";
        c1.codigo = "POO-101";
        c1.creditos = 4;

        Curso c2 = new Curso();
        c2.nombre = "Calculo Diferencial";
        c2.codigo = "CAL-201";
        c2.creditos = 3;

        c1.mostrarInfo();
        c2.mostrarInfo();
        /*
         * Ambos objetos pertenecen a la misma clase Curso porque comparten la misma
         * estructura: ambos tienen nombre, codigo y creditos y el metodo
         * mostrarInfo(). Que sus datos sean distintos no cambia la clase, porque la
         * clase define el TIPO (que es un curso) y no el contenido concreto. Es
         * como decir que dos perros distintos siguen siendo perros: la "clase" es
         * perro, los "objetos" son cada perro en particular.
         */

        System.out.println("=== Ejercicio 43 ===");
        Computador pc = new Computador();
        pc.marca = "Lenovo";
        pc.procesador = "Intel Core i7";
        pc.ram = 16;
        pc.mostrarInfo();
        /*
         * La clase Computador es el PLANO CONCEPTUAL: describe que todo computador
         * tiene marca, procesador y memoria RAM, pero no es una maquina fisica. La
         * maquina concreta (el objeto pc) es el resultado de materializar ese
         * plano: un equipo especifico con una marca, un procesador y una cantidad
         * de RAM determinadas. Del mismo plano se pueden construir muchas maquinas
         * distintas, cada una con su propio estado.
         */

        System.out.println("=== Ejercicio 44 ===");
        Paciente pac = new Paciente();
        pac.nombre = "Carlos";
        pac.documento = "1020304050";
        pac.diagnostico = "Gripe";
        pac.mostrarInfo();
        /*
         * "Crear un paciente" e "instanciar la clase Paciente" se relacionan pero
         * no son exactamente lo mismo. Crear un paciente es una idea del mundo real:
         * alguien llega al hospital y queda registrado con su nombre y diagnostico.
         * Instanciar es la accion tecnica en el lenguaje: usar new Paciente() para
         * reservar memoria y construir un objeto a partir de la plantilla. La
         * instanciacion es el MECANISMO con el que, dentro del programa, logramos
         * representar esa creacion de un paciente concreto.
         */
    }
}
