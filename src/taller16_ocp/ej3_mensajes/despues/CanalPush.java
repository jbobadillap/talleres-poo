package taller16_ocp.ej3_mensajes.despues;

public class CanalPush implements CanalMensaje {

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Push a " + destinatario + ": " + mensaje);
    }
}
