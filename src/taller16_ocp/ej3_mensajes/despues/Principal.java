package taller16_ocp.ej3_mensajes.despues;

public class Principal {

    public static void main(String[] args) {
        Mensajero email = new Mensajero(new CanalEmail());
        Mensajero sms = new Mensajero(new CanalSMS());
        Mensajero push = new Mensajero(new CanalPush());

        email.enviar("camilo@correo.com", "Hola por correo.");
        sms.enviar("3001234567", "Hola por SMS.");
        push.enviar("camilo", "Hola por notificacion push.");

        System.out.println("\nSolo cambia el canal, no la clase Mensajero.");
    }
}
