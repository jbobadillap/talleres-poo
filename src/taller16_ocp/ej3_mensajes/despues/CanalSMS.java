package taller16_ocp.ej3_mensajes.despues;

public class CanalSMS implements CanalMensaje {

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("SMS a " + destinatario + ": " + mensaje);
    }
}
