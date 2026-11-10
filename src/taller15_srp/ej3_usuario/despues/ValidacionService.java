package taller15_srp.ej3_usuario.despues;

public class ValidacionService {

    public boolean validar(Usuario usuario) {
        return !usuario.getNombre().isBlank()
                && usuario.getCorreo().contains("@");
    }
}
