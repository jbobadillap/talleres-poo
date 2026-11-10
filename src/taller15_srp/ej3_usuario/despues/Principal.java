package taller15_srp.ej3_usuario.despues;

public class Principal {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("camilo", "camilo@correo.com", "1234");
        AutenticacionService autenticacion = new AutenticacionService();
        ValidacionService validacion = new ValidacionService();

        System.out.println("Autenticado: " + autenticacion.autenticar(usuario, "camilo", "1234"));
        System.out.println("Valido: " + validacion.validar(usuario));

        System.out.println("\nUsuario solo guarda los datos personales.");
    }
}
