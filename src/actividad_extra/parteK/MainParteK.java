package actividad_extra.parteK;

public class MainParteK {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 61: Docente ===");
        Docente d = new Docente();
        d.nombre = "Carlos Perez";
        d.cedula = "11223344";
        d.materia = "Matematicas";
        d.mostrarInfo();
        d.asignarMateria("Fisica");
        d.mostrarInfo();

        System.out.println("=== Ejercicio 62: Biblioteca ===");
        Biblioteca b = new Biblioteca();
        b.nombre = "Central";
        b.direccion = "Calle 10";
        b.numeroLibros = 5000;
        b.mostrarInfo();
        b.prestarLibro();
        b.mostrarInfo();

        System.out.println("=== Ejercicio 63: Hospital ===");
        Hospital h = new Hospital();
        h.nombre = "General";
        h.ciudad = "Monteria";
        h.numeroCamas = 200;
        h.mostrarInfo();
        h.recibirPaciente();
        h.mostrarInfo();

        System.out.println("=== Ejercicio 64: Tienda ===");
        Tienda t = new Tienda();
        t.nombre = "Moda Express";
        t.categoria = "Ropa";
        t.numeroEmpleados = 5;
        t.mostrarInfo();
        t.contratarEmpleado();
        t.mostrarInfo();

        System.out.println("=== Ejercicio 65: EquipoDeFutbol ===");
        EquipoDeFutbol e = new EquipoDeFutbol();
        e.nombre = "Junior";
        e.ciudad = "Barranquilla";
        e.puntos = 25;
        e.mostrarInfo();
        e.sumarPuntos(3);
        e.mostrarInfo();
    }
}
