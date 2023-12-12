## TP2 Encapsulation ##

### Diagramme de fonctionnel ###

class Thermometre {
__ Attribut __
- {static} ZERO_ABSOLU_KELVIN
- {static} ZERO_ABSOLU_CELSIUS
- double temperatureCelcius
- double Fahrenheit
- double temperatureKelvin
  .. Setter ..
+ void setTemperature(double temperature, char unite)
  .. Getter ..
+ double getTemperatureCelcius()
+ double getTemperatureFahrenheit()
+ double getTemperatureKelvin()
}