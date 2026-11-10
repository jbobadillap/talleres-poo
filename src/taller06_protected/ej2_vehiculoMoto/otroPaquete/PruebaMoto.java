package taller06_protected.ej2_vehiculoMoto.otroPaquete;

public class PruebaMoto {

    public static void main(String[] args) {
        Moto moto = new Moto("Motocicleta", "Yamaha", 300);
        System.out.println("Subclase en otro paquete usando miembros protected:");
        moto.mostrarInfo();
    }
}
