package ro.fasttrackit.exercise2;

/*Rezolvarea va fi într-un proiect maven(puteți sa-l refolosit pe cel de la curs).
Folosiți TDD ca sa construiți PersonService.
Creați teste si pentru Person astfel încât sa nu poată fi creata
o persoana fictiva (vârsta invalida, nume null... gândiți-vă si la alte cazuri)
Având obiectul Person(id, name, age) creați PersonService care oferă următorul behavior:
a) Person addPerson(Person person): persoana primita NU are ID, is e va genera după adăugare.
   Persoana returnata are id-ul setat.
b) Person removePerson(int id): șterge persoana cu id-ul respectiv si o returnează.
   Arunca excepție (unchecked) daca nu exista.
c) List<Person> getAllPersons()
d) List<Person> getPersonsOlderThan(int age): validați age-ul (pozitiv, <120)
e) List<String> getAllPersonNames() - returnează doar numele
f) Person getPerson(String name)
g) Person getPersonById(int id)*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PersonService {
	private final List<Person> persons = new ArrayList<>();


	public PersonService(Collection<Person> persons) {
		if (persons != null) {
			this.persons.addAll(persons);
		}
	}

	public Person addPerson(Person person) {
		persons.add(person);
		return          // ???
	}

	public Person removePerson(int id) throws NoIdException {
		for (Person person : persons) {
			if (person.getId() == id) {
				persons.remove(person);
			}
		}
		return null;
	}

	public List<Person> getAllPersons() {
		List<Person> result = new ArrayList<>();
		for (Person person : persons) {
			result.addAll(persons);
		}
		return result;
	}

	public List<Person> getPersonsOlderThan(int age) throws InvalidPersonException {
		List<Person> result = new ArrayList<>();
		for (Person person : persons) {
			if (person.getAge() > age) {
				result.addAll(persons);
			}
		}
		return result;
	}

	public List<String> getAllPersonNames() throws InvalidPersonException {
		List<String> result = new ArrayList<>();
		for (Person person : persons) {
			result.add(person.getName());
		}
		return result;
	}

	public Person getPerson(String name) throws InvalidPersonException {
		for (Person person : persons) {
			if (person.getName().equals(name)) {
				return person;
			}
		}
		return null;
	}

	public Person getPersonById(int id) {
		for (Person person : persons) {
			if (person.getId() == id) {
				return person;
			}
		}
		return null;
	}
}
