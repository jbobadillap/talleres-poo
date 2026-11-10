package taller15_srp.ej3_usuario.antes;

public class Principal {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("camilo", "camilo@correo.com", "1234");

        usuario.mostrarDatos();
        System.out.println("Autenticado: " + usuario.autenticar("camilo", "1234"));
        System.out.println("Valido: " + usuario.validar());

        System.out.println("\nProblema: Usuario guarda datos, autentica y valida.");
    }
}
