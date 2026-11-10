package actividad_extra.parteL;

public class MainParteL {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 66: clase academica (Asignatura) ===");
        System.out.println("=== Ejercicio 67: clase cotidiana (Despertador) ===");
        System.out.println("=== Ejercicio 68: clase de negocio (Venta) ===");

        System.out.println("=== Ejercicio 69: cinco objetos de cada clase ===");
        System.out.println("--- Asignaturas ---");
        Asignatura a1 = new Asignatura();
        a1.nombre = "Programacion Orientada a Objetos";
        a1.codigo = "POO-101";
        a1.creditos = 4;
        a1.mostrarInfo();

        Asignatura a2 = new Asignatura();
        a2.nombre = "Calculo Diferencial";
        a2.codigo = "CAL-201";
        a2.creditos = 3;
        a2.mostrarInfo();

        Asignatura a3 = new Asignatura();
        a3.nombre = "Fisica Mecanica";
        a3.codigo = "FIS-301";
        a3.creditos = 4;
        a3.mostrarInfo();

        Asignatura a4 = new Asignatura();
        a4.nombre = "Algebra Lineal";
        a4.codigo = "ALG-202";
        a4.creditos = 3;
        a4.mostrarInfo();

        Asignatura a5 = new Asignatura();
        a5.nombre = "Bases de Datos";
        a5.codigo = "BD-402";
        a5.creditos = 3;
        a5.mostrarInfo();

        System.out.println("--- Despertadores ---");
        Despertador d1 = new Despertador();
        d1.hora = 6;
        d1.minuto = 30;
        d1.mostrarAlarma();

        Despertador d2 = new Despertador();
        d2.hora = 7;
        d2.minuto = 0;
        d2.activar();
        d2.mostrarAlarma();

        Despertador d3 = new Despertador();
        d3.hora = 5;
        d3.minuto = 45;
        d3.mostrarAlarma();

        Despertador d4 = new Despertador();
        d4.hora = 8;
        d4.minuto = 15;
        d4.activar();
        d4.mostrarAlarma();

        Despertador d5 = new Despertador();
        d5.hora = 6;
        d5.minuto = 0;
        d5.mostrarAlarma();

        System.out.println("--- Ventas ---");
        Venta v1 = new Venta();
        v1.producto = "Camiseta";
        v1.cantidad = 2;
        v1.precioUnitario = 30000;
        v1.mostrarVenta();

        Venta v2 = new Venta();
        v2.producto = "Pantalon";
        v2.cantidad = 1;
        v2.precioUnitario = 60000;
        v2.mostrarVenta();

        Venta v3 = new Venta();
        v3.producto = "Zapatos";
        v3.cantidad = 1;
        v3.precioUnitario = 120000;
        v3.mostrarVenta();

        Venta v4 = new Venta();
        v4.producto = "Gorra";
        v4.cantidad = 3;
        v4.precioUnitario = 20000;
        v4.mostrarVenta();

        Venta v5 = new Venta();
        v5.producto = "Medias";
        v5.cantidad = 4;
        v5.precioUnitario = 8000;
        v5.mostrarVenta();

        System.out.println("=== Ejercicio 70: explicacion ===");
        /*
         * Clase Asignatura:
         *   - Clase: Asignatura (el molde).
         *   - Objetos: a1, a2, a3, a4 y a5 (cinco materias concretas).
         *   - Atributos: nombre, codigo y creditos.
         *   - Comportamientos: mostrarInfo() y matricular().
         *
         * Clase Despertador:
         *   - Clase: Despertador (el molde).
         *   - Objetos: d1, d2, d3, d4 y d5.
         *   - Atributos: hora, minuto y activo.
         *   - Comportamientos: mostrarAlarma(), activar() y desactivar().
         *
         * Clase Venta:
         *   - Clase: Venta (el molde).
         *   - Objetos: v1, v2, v3, v4 y v5.
         *   - Atributos: producto, cantidad y precioUnitario.
         *   - Comportamientos: calcularTotal() y mostrarVenta().
         */

        System.out.println("=== Ejercicio 71: Producto con constructor con parametros ===");
        Producto p1 = new Producto("Mouse", 25000, 20);
        Producto p2 = new Producto("Monitor", 450000, 5);
        p1.mostrarProducto();
        p2.mostrarProducto();

        System.out.println("=== Ejercicio 73: Libro con constructor copia ===");
        Libro original = new Libro("Hamlet", "William Shakespeare", 250);
        Libro copia = new Libro(original);
        original.mostrarInfo();
        copia.mostrarInfo();

        System.out.println("=== Ejercicio 74: comparacion de formas de construccion ===");
        /*
         * Tres formas de construir un objeto:
         *   1. Constructor vacio + asignar atributos uno a uno.
         *   2. Constructor con parametros.
         *   3. Constructor copia (a partir de otro objeto).
         *
         * Para principiantes, el constructor con parametros me parecio la forma
         * mas clara: en una sola linea se ve que datos recibe el objeto y no hay
         * riesgo de olvidar asignar algun atributo. El constructor vacio es util
         * para aprender, pero obliga a escribir varias lineas y se presta para
         * errores. El constructor copia es practico para duplicar, pero requiere
         * entender primero que se esta clonando el estado de otro objeto.
         */

        System.out.println("=== Ejercicio 75: conclusion final ===");
        /*
         * CONCLUSION FINAL
         *
         * Una CLASE es una plantilla o molde que describe un conjunto de objetos
         * que comparten una misma estructura y comportamiento. En ella se definen
         * los ATRIBUTOS (las caracteristicas o datos que tendra cada objeto, como
         * nombre, precio o saldo) y los METODOS (las acciones que puede realizar,
         * como vender(), acelerar() o mostrarInfo()). La clase por si sola no
         * contiene datos concretos: solo dice QUE TENDRA y QUE SABRA HACER todo
         * objeto de ese tipo.
         *
         * Un OBJETO es una instancia concreta de una clase. Es una entidad real
         * que ocupa memoria y que posee valores propios en sus atributos (por
         * ejemplo, el producto "Lapiz" con precio 1500 y stock 100). De una misma
         * clase se pueden crear muchisimos objetos, cada uno con su propio estado
         * independiente, aunque todos compartan la misma estructura.
         *
         * INSTANCIAR es el proceso de crear un objeto a partir de una clase. En
         * Java se hace con la palabra new junto al constructor, por ejemplo
         * "Producto p = new Producto();". Instanciar es reservar memoria y
         * construir una copia concreta del molde; es el puente entre el plano (la
         * clase) y la realidad del programa (el objeto).
         *
         * Java usa clases como base de la POO porque permiten organizar el codigo
         * en unidades que combinan datos y comportamiento, lo que se conoce como
         * ENCAPSULAMIENTO. Esto facilita reutilizar codigo (una clase se usa para
         * crear infinitos objetos), mantener el programa (cada clase agrupa lo que
         * le corresponde), modelar el mundo real de forma natural y reducir errores,
         * ya que los datos de un objeto permanecen agrupados y coherentes. Por eso
         * en Java todo se organiza alrededor de clases: son la herramienta central
         * para pensar y construir programas orientados a objetos.
         */
    }
}
