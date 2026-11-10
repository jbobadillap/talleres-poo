package taller15_srp.ej3_usuario.despues;

public class AutenticacionService {

    public boolean autenticar(Usuario usuario, String nombre, String contrasena) {
        return usuario.getNombre().equals(nombre)
                && usuario.getContrasena().equals(contrasena);
    }
}
