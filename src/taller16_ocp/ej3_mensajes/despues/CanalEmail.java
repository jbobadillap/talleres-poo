package taller16_ocp.ej3_mensajes.despues;

public class CanalEmail implements CanalMensaje {

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Email a " + destinatario + ": " + mensaje);
    }
}
