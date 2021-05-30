package ro.fasttrackit.exercise1;

/*Rezolvați problema într-un proiect maven (puteți sa-l folosiți pe cel de la curs) folosind Test Driven Development(TDD),
adică vei crea testul înainte sa scrii codul algoritmului.
Scrieți într-o clasa 2 metode, una care primește o temperatura in grade Fahrenheit
si returnează temperatura respectiva convertita in grade Celsius, si cealaltă celsius in fahrenheit.

Formula de conversie este:
	T(°C) = (T(°F) - 32) × 5/9
	T(°F) = T(°C) x 9/5 + 32

Semnătura metodei este:
	public static double fahrenheitToCelsius(double temperature)
	public static double celsiusToFahrenheit(double temperature)

Exemplu:
	fahrenheitToCelsius(100) -> 37.777777778
	fahrenheitToCelsius(0) -> -17.777777778
	fahrenheitToCelsius(50) -> 10*/

public class TemperatureConverter {
	public static double fahrenheitToCelsius(double temperature) {
		double celsius = (temperature - 32) * 5 / 9;
		return celsius;
	}

	public static double celsiusToFahrenheit(double temperature) {
		double fahrenheit = temperature * 9 / 5 + 32;
		return fahrenheit;
	}
}
