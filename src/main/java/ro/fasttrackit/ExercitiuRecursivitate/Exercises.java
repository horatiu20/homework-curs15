package ro.fasttrackit.ExercitiuRecursivitate;

public class Exercises {
	public int sum(int n) {
		if (n == 0 || n == 1) {
			return n;
		} else {
			return sum(n - 1) + n;
		}
	}

	public int sumEven(int n) {
		if (n % 2 != 0) {
			return n;
		} else {
			return sumEven(n + 1) * n;
		}
	}

	public int sumAllDigits(int n) {
		if (n < 10) {
			return n;
		} else {
			return sumAllDigits((n / 10)) + n % 10;
		}
	}

	public String palindromeReverse(String word) {
		if (word == null || "".equals(word)) {
			return "";
		} else {
			return word.charAt(word.length() - 1) + palindromeReverse(word.substring(0, word.length() - 1));
		}
	}
}