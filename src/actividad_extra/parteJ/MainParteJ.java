package actividad_extra.parteJ;

public class MainParteJ {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 51: Rectangulo ===");
        Rectangulo r = new Rectangulo();
        r.base = 5;
        r.altura = 3;
        r.mostrarResultados();

        System.out.println("=== Ejercicio 52: FacturaSimple ===");
        FacturaSimple f = new FacturaSimple();
        f.numero = "F-001";
        f.cliente = "Pedro";
        f.valor = 200000;
        f.mostrarFactura();
        f.aplicarDescuento();
        f.mostrarFactura();

        System.out.println("=== Ejercicio 53: Reserva ===");
        Reserva res = new Reserva();
        res.nombreCliente = "Maria";
        res.fecha = "2026-09-20";
        res.mostrarEstado();
        res.confirmar();
        res.mostrarEstado();
        res.cancelar();
        res.mostrarEstado();

        System.out.println("=== Ejercicio 54: Semaforo ===");
        Semaforo s = new Semaforo();
        s.colorActual = "rojo";
        s.mostrarEstado();
        s.cambiar();
        s.mostrarEstado();
        s.cambiar();
        s.mostrarEstado();
        s.cambiar();
        s.mostrarEstado();

        System.out.println("=== Ejercicio 55: Reloj ===");
        Reloj reloj = new Reloj();
        reloj.hora = 10;
        reloj.minuto = 5;
        reloj.segundo = 30;
        reloj.mostrarHora();

        System.out.println("=== Ejercicio 56: Temperatura ===");
        Temperatura t = new Temperatura();
        t.valorCelsius = 25;
        t.mostrarConversion();

        System.out.println("=== Ejercicio 57: NotaAcademica ===");
        NotaAcademica n = new NotaAcademica();
        n.asignatura = "POO";
        n.nota1 = 4.2;
        n.nota2 = 3.8;
        n.nota3 = 4.5;
        n.mostrarDefinitiva();

        System.out.println("=== Ejercicio 58: InventarioItem ===");
        InventarioItem item = new InventarioItem();
        item.nombre = "Teclado";
        item.cantidad = 15;
        item.precioUnitario = 45000;
        item.mostrarItem();

        System.out.println("=== Ejercicio 59: UsuarioSistema ===");
        UsuarioSistema u = new UsuarioSistema();
        u.nombreUsuario = "camilo";
        u.clave = "1234";
        u.mostrarEstado();
        u.activar();
        u.mostrarEstado();
        u.desactivar();
        u.mostrarEstado();

        System.out.println("=== Ejercicio 60: Avion ===");
        Avion avion = new Avion();
        avion.aerolinea = "Avianca";
        avion.destino = "Bogota";
        avion.pasajeros = 50;
        avion.mostrarEstado();
        avion.abordar(20);
        avion.mostrarEstado();
    }
}
