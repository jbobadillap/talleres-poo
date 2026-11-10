package actividad_extra.parteC;

public class Mascota {
    public String nombre;
    public String especie;
    public int edad;

    public void mostrarMascota() {
        System.out.println("Mascota: " + nombre + " | Especie: " + especie + " | Edad: " + edad + " anios");
    }

    public void cumplirAnios() {
        edad++;
    }
}
