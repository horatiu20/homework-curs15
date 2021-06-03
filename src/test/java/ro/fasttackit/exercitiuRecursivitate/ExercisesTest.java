package ro.fasttackit.exercitiuRecursivitate;

/* create an object and tests for recursive methods:
1) sum of first n integer numbers
2) sum of first n EVEN integers
3) Palindrome: a word that reads the same backwards as forwards, e.g. madam or ana
 - in two modes :
         3.1) recursive string reverse
         3.2) recursive check of first and last letter
4) sum of digits for a number*/

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ro.fasttrackit.exercitiuRecursivitate.Exercises;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ExercisesTest {
	Exercises exercises;

	@BeforeEach
	void setup() {
		exercises = new Exercises();
	}

	@Test
	@DisplayName("Sum of first 'n' numbers works")
	void sumNumbers() {
		assertThat(exercises.sum(10)).isEqualTo(55);
	}

	@Test
	@DisplayName("Sum of first even 'n' numbers works")
	void sumEvenNumbers() {
		assertThat(exercises.sumEven(4)).isEqualTo(20);
	}

	@Test
	@DisplayName("Sum of all digits in a number works")
	void sumAllDigits() {
		assertThat(exercises.sumAllDigits(73198)).isEqualTo(28);
	}

	@Test
	@DisplayName("Palindrome - recursive string reverse works")
	void palindromeReverse() {
		assertThat(exercises.palindromeReverse("apa")).isEqualTo("apa");
	}
}
