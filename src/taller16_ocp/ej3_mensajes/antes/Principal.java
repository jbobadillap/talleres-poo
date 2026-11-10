package taller16_ocp.ej3_mensajes.antes;

public class Principal {

    public static void main(String[] args) {
        Mensajero mensajero = new Mensajero();

        mensajero.enviarEmail("camilo@correo.com", "Hola desde el taller.");

        System.out.println("\nProblema: para enviar SMS o push");
        System.out.println("habria que modificar la clase Mensajero.");
    }
}
