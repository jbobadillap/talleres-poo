package taller08_herenciaSimple.ej1_vehiculoCoche;

public class Principal {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Renault", 160);
        Coche coche = new Coche("Mazda", 200, 4);

        System.out.println("Vehiculo:");
        vehiculo.mostrarInformacion();

        System.out.println("\nCoche:");
        coche.mostrarInformacion();

        System.out.println("\nCoche con referencia Vehiculo:");
        Vehiculo referencia = coche;
        referencia.mostrarInformacion();
    }
}
