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
}