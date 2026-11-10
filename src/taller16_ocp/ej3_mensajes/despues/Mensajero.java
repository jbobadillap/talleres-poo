package taller16_ocp.ej3_mensajes.despues;

public class Mensajero {

    private final CanalMensaje canal;

    public Mensajero(CanalMensaje canal) {
        this.canal = canal;
    }

    public void enviar(String destinatario, String mensaje) {
        canal.enviar(destinatario, mensaje);
    }
}
