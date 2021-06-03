package ro.fasttackit.exercise2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ro.fasttrackit.exercise2.InvalidPersonException;
import ro.fasttrackit.exercise2.Person;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PersonTest {
	Person person;

	@BeforeEach
	void setup() {
		person = new Person(1, "Ana", 32);
	}

	@Test
	@DisplayName("WHEN the person age is invalid THEN throw exception")
	void invalidAge() throws InvalidPersonException {
		assertThat(person.getAge()).isEqualTo(32);
	}

	@Test
	@DisplayName("WHEN the person name is invalid THEN throw exception")
	void invalidName() throws InvalidPersonException {
		assertThat(person.getName()).isEqualTo("Ana");
	}
}
