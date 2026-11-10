package taller15_srp.ej3_usuario.despues;

public class Usuario {

    private final String nombre;
    private final String correo;
    private final String contrasena;

    public Usuario(String nombre, String correo, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    String getContrasena() {
        return contrasena;
    }
}
