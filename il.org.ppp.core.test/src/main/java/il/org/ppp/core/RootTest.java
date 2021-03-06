package il.org.ppp.core;

import lombok.Operation;

public class RootTest {
	@Operation
	interface root {
		double base();

		default double exp() {
			new Object();
			return 2;
		}

		default double value() {
			return Math.pow(base(), 1.0 / exp());
		}
	}

	public static void main(String[] args) {
		System.out.println("square root of 5 = " + root(5));
		System.out.println("cube root of 5 = " + root(5, 3));
	}
}
