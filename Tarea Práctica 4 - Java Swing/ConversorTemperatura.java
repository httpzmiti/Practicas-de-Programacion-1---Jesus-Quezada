public class ConversorTemperatura {

    public double fahrenheitACelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public double celsiusAFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
