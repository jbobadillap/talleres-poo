package actividad_extra.parteJ;

public class UsuarioSistema {
    public String nombreUsuario;
    public String clave;
    public boolean activo;

    public void activar() {
        activo = true;
    }

    public void desactivar() {
        activo = false;
    }

    public void mostrarEstado() {
        System.out.println("Usuario: " + nombreUsuario + " | Activo: " + activo);
    }
}
