package in.co.variableoperator;

public class ExampleOfAssignment {

	public static void main(String[] args) {

		int result, va_1, va_2;

		result = (va_1 = 1) + (va_2 = 2);

		System.out.println(va_1 = 1);

		System.out.println(va_1 = 2);

		System.out.println(result);

	}

}
