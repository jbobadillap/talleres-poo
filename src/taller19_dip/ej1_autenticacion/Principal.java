package taller19_dip.ej1_autenticacion;

public class Principal {

    public static void main(String[] args) {
        GestorAutenticacion local = new GestorAutenticacion(new AutenticacionLocal());
        System.out.println("Local valido: " + local.iniciarSesion("admin", "1234"));
        System.out.println("Local invalido: " + local.iniciarSesion("admin", "0000"));

        GestorAutenticacion oauth = new GestorAutenticacion(new AutenticacionOAuth());
        System.out.println("OAuth valido: " + oauth.iniciarSesion("camilo", "oauth-token-123"));
        System.out.println("OAuth invalido: " + oauth.iniciarSesion("camilo", "1234"));

        System.out.println("\nEl gestor no sabe que implementacion esta usando.");
    }
}
