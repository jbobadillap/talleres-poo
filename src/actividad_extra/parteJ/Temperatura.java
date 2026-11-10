package actividad_extra.parteJ;

public class Temperatura {
    public double valorCelsius;

    public double convertirAFahrenheit() {
        return valorCelsius * 9 / 5 + 32;
    }

    public void mostrarConversion() {
        System.out.println(valorCelsius + " C = " + convertirAFahrenheit() + " F");
    }
}
