package taller19_dip.ej1_autenticacion;

public class AutenticacionOAuth implements ServicioAutenticacion {

    @Override
    public boolean autenticar(String usuario, String clave) {
        System.out.println("Autenticando con OAuth...");
        return clave != null && clave.startsWith("oauth-");
    }
}
