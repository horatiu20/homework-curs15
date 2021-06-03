package ro.fasttackit.exercise2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ro.fasttrackit.exercise2.InvalidPersonException;
import ro.fasttrackit.exercise2.Person;
import ro.fasttrackit.exercise2.PersonService;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PersonServiceTest {
	PersonService personService;

	@BeforeEach
	void setup() {
		personService = new PersonService(List.of(
				new Person(1, "Maria", 35),
				new Person(2, "Marius", 27),
				new Person(3, "Bogdan", 45)));
	}

	@Test
	@DisplayName("WHEN a Person is added THEN it is given an id")
	void giveId() {
		assertThat(personService.addPerson(new Person(4, "Ana", 18))).isEqualTo(new Person(4, "Ana", 18));
	}

	@Test
	@DisplayName("WHEN a Person is removed THEN it is deleted and printed")
	void removePerson() {
		assertThat(personService.removePerson(1)).isEqualTo(new Person(1, "Maria", 35));
	}

	@Test
	@DisplayName("Get all Persons works")
	void getAllPersons() {
		assertThat(personService.getAllPersons()).isEqualTo(List.of(
				new Person(1, "Maria", 35),
				new Person(2, "Marius", 27),
				new Person(3, "Bogdan", 45)));
	}

	@Test
	@DisplayName("Get all Persons older than a given age works")
	void getPersonsOlderThan() throws InvalidPersonException {
		assertThat(personService.getPersonsOlderThan(20)).isEqualTo(List.of(
				new Person(1, "Maria", 35),
				new Person(2, "Marius", 27),
				new Person(3, "Bogdan", 45)));
	}

	@Test
	@DisplayName("Get all Persons names works")
	void getAllPersonNames() throws InvalidPersonException {
		assertThat(personService.getAllPersonNames()).isEqualTo(List.of("Maria", "Marius", "Bogdan"));
	}

	@Test
	@DisplayName("Get a Person by his/her name works")
	void getPerson() throws InvalidPersonException {
		assertThat(personService.getPerson("Maria")).isEqualTo(new Person(1, "Maria", 35));
	}

	@Test
	@DisplayName("Get a Person by his/her id works")
	void getPersonById() {
		assertThat(personService.getPersonById(1)).isEqualTo(new Person(1, "Maria", 35));
	}
}