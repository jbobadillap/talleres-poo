package taller05_default.ej2_vehiculoMoto.vehiculos;

class Vehiculo {

    String tipo;

    Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    void mostrarTipo() {
        System.out.println("Tipo de vehiculo: " + tipo);
    }
}
