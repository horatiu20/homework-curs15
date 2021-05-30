package ro.fasttrackit.exercise2;

import java.util.Objects;

public class Person {
	private final int id;
	private final String name;
	private final int age;

	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() throws NoIdException {
		if (id == 0) {
			throw new NoIdException("Id does not exist");
		} else {
			return id;
		}
	}

	public String getName() throws InvalidPersonException {
		if (name == null) {
			throw new InvalidPersonException(name + " is invalid.");
		} else {
			return name;
		}
	}

	public int getAge() throws InvalidPersonException {
		if (age <= 0 || age > 120) {
			throw new InvalidPersonException(age + " is invalid age.");
		} else {
			return age;
		}
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Person person = (Person) o;
		return age == person.age && Objects.equals(id, person.id) && Objects.equals(name, person.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, age);
	}

	@Override
	public String toString() {
		return "Person{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
