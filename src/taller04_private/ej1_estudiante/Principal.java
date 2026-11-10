package taller04_private.ej1_estudiante;

public class Principal {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Ana Torres", 20, 4.3);
        System.out.println("Estudiante creado: " + estudiante);

        estudiante.setNombre("Ana Maria Torres");
        estudiante.setEdad(21);
        estudiante.setNotaPromedio(4.6);
        System.out.println("Datos actualizados: " + estudiante);

        System.out.println("\nIntentos con datos invalidos:");
        estudiante.setNombre("   ");
        estudiante.setEdad(-5);
        estudiante.setEdad(150);
        estudiante.setNotaPromedio(7.0);
        estudiante.setNotaPromedio(-1.0);

        System.out.println("Estado final: " + estudiante);
        System.out.println("Nombre via getter: " + estudiante.getNombre());
        System.out.println("Edad via getter: " + estudiante.getEdad());
        System.out.println("Nota via getter: " + estudiante.getNotaPromedio());
    }
}
