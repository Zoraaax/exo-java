package fr.zoraax.tp2;

/**
 * Classe représentant un thermomètre avec des méthodes pour gérer les températures
 * en Celsius, Fahrenheit et Kelvin.
 */
public class Thermometre {
    private static final double ZERO_ABSOLU_CELSIUS = -273.15;
    private static final double ZERO_ABSOLU_KELVIN = 0;
    private double temperatureCelsius;
    private double temperatureFahrenheit;
    private double temperatureKelvin;

    public Thermometre() {
        this.temperatureCelsius = 0;
    }
    public Thermometre(double temperature) {
        this.temperatureCelsius = temperature;
    }

    /**
     * Définit la température du thermomètre.
     *
     * @param temperature la température à définir.
     * @param unite l'unité de la température ('C', 'F', 'K').
     * @throws IllegalArgumentException si la température est inférieure au zéro absolu
     *         ou si l'unité n'est pas valide.
     */
    public void setTemperature(double temperature, char unite) throws IllegalArgumentException {
        if (unite == 'K' && temperature < ZERO_ABSOLU_KELVIN) {
            throw new IllegalArgumentException("La température ne peut pas être inférieure à 0°K (zéro absolu)");
        } else if (temperature < ZERO_ABSOLU_CELSIUS) {
            throw new IllegalArgumentException("La température ne peut pas être inférieure à -273.15°C (zéro absolu)");
        }

        switch(unite) {
            case 'C':
                this.temperatureCelsius = temperature;
                System.out.println("La temperature en Celsius est : " + getTemperatureCelsius());
                break;
            case 'F':
                this.temperatureFahrenheit = (temperature * 1.8) + 32;
                System.out.println("La temperature en Fahrenheit est : " + getTemperatureFahrenheit());
                break;
            case 'K':
                this.temperatureKelvin = temperature + 273.15;
                System.out.println("La temperature en Kelvin est : " + getTemperatureKelvin());
                break;
            default:
                throw new IllegalArgumentException("L'unité de mesure n'est pas valide");
        }
    }

    public double getTemperatureCelsius() {
        return this.temperatureCelsius;
    }

    public double getTemperatureFahrenheit() {
        return this.temperatureFahrenheit;
    }

    public double getTemperatureKelvin() {
        return this.temperatureKelvin;
    }
}
