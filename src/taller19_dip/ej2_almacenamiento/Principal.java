package taller19_dip.ej2_almacenamiento;

public class Principal {

    public static void main(String[] args) {
        GestorArchivos local = new GestorArchivos(new AlmacenamientoLocal());
        local.guardarArchivo("notas.txt", "Contenido local");
        System.out.println("Leido: " + local.leerArchivo("notas.txt"));

        GestorArchivos nube = new GestorArchivos(new AlmacenamientoNube());
        nube.guardarArchivo("notas.txt", "Contenido en la nube");
        System.out.println("Leido: " + nube.leerArchivo("notas.txt"));

        System.out.println("\nEl gestor funciona igual con almacenamiento local o en la nube.");
    }
}
