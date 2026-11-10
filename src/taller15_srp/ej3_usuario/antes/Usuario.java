package taller15_srp.ej3_usuario.antes;

public class Usuario {

    private final String nombre;
    private final String correo;
    private final String contrasena;

    public Usuario(String nombre, String correo, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public void mostrarDatos() {
        System.out.println("Usuario: " + nombre);
        System.out.println("Correo: " + correo);
    }

    public boolean autenticar(String usuario, String clave) {
        return nombre.equals(usuario) && contrasena.equals(clave);
    }

    public boolean validar() {
        return !nombre.isBlank() && correo.contains("@");
    }
}
