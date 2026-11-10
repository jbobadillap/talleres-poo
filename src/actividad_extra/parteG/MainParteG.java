package actividad_extra.parteG;

public class MainParteG {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 35: Lampara ===");
        Lampara lamp = new Lampara();
        lamp.marca = "Philips";
        lamp.mostrarEstado();
        lamp.encender();
        lamp.mostrarEstado();
        lamp.apagar();
        lamp.mostrarEstado();

        System.out.println("=== Ejercicio 36: Puerta ===");
        Puerta puerta = new Puerta();
        puerta.material = "Madera";
        puerta.mostrarEstado();
        puerta.abrir();
        puerta.mostrarEstado();
        puerta.cerrar();
        puerta.mostrarEstado();

        System.out.println("=== Ejercicio 37: Celular ===");
        Celular cel = new Celular();
        cel.marca = "Samsung";
        cel.bateria = 50;
        cel.mostrarEstado();
        cel.encender();
        cel.cargarBateria();
        cel.cargarBateria();
        cel.mostrarEstado();
        cel.apagar();
        cel.mostrarEstado();

        System.out.println("=== Ejercicio 38: Ventilador ===");
        Ventilador ven = new Ventilador();
        ven.marca = "Sanyo";
        ven.mostrarEstado();
        ven.encender();
        ven.subirVelocidad();
        ven.subirVelocidad();
        ven.mostrarEstado();
        ven.apagar();
        ven.mostrarEstado();

        System.out.println("=== Ejercicio 39: Cancion ===");
        Cancion can = new Cancion();
        can.titulo = "Bohemian Rhapsody";
        can.artista = "Queen";
        can.duracion = 5.55;
        can.mostrarInfo();

        System.out.println("=== Ejercicio 40: Pelicula ===");
        Pelicula peli = new Pelicula();
        peli.nombre = "Interestelar";
        peli.genero = "Ciencia ficcion";
        peli.minutos = 169;
        peli.mostrarFicha();
    }
}
