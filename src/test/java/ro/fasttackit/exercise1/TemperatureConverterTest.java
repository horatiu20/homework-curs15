package ro.fasttackit.exercise1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ro.fasttrackit.exercise1.TemperatureConverter;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TemperatureConverterTest {
	TemperatureConverter converter;

	@BeforeEach
	void setup() {
		converter = new TemperatureConverter();
	}

	@Test
	@DisplayName("WHEN the temperature is in fahrenheit THEN convert it to celsius")
	void convertFahrenheit() {
		assertThat(converter.fahrenheitToCelsius(100)).isEqualTo(37.77777777777778);

	}

	@Test
	@DisplayName("WHEN the temperature is in celsius THEN convert it to fahrenheit")
	void convertCelsius() {
		assertThat(converter.celsiusToFahrenheit(100)).isEqualTo(212);
	}
}

