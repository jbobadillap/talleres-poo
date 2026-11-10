package taller12_interfaces.ej1_ave;

public class Ave implements Volador, Cantante {

    private String nombre;

    public Ave(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void volar() {
        System.out.println(nombre + " esta volando.");
    }

    @Override
    public void cantar() {
        System.out.println(nombre + " esta cantando.");
    }
}
