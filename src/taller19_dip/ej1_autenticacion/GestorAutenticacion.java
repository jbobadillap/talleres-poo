package taller19_dip.ej1_autenticacion;

public class GestorAutenticacion {

    private final ServicioAutenticacion servicio;

    public GestorAutenticacion(ServicioAutenticacion servicio) {
        this.servicio = servicio;
    }

    public boolean iniciarSesion(String usuario, String clave) {
        return servicio.autenticar(usuario, clave);
    }
}
