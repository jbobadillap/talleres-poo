package taller19_dip.ej1_autenticacion;

public class AutenticacionLocal implements ServicioAutenticacion {

    @Override
    public boolean autenticar(String usuario, String clave) {
        System.out.println("Autenticando en la base local...");
        return "admin".equals(usuario) && "1234".equals(clave);
    }
}
