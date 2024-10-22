import java.sql.SQLOutput;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] arguments) {







	/* Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if (number < 0) {
			System.out.println("Undefined");
		} else if (number > 12) {
			System.out.println("Too large");
		} else {
			System.out.println(forFactorial(number));
			System.out.println(whileFactorial(number));
		}
		scanner.close();
	*/ }

	private static int forFactorial(int number) {
		int product = 1;
		for (int counter = 1; counter <= number; counter++) {
			product *= counter;
		}
		return product;
	}

	private static int whileFactorial(int number){
		int prod = 1;
		while (number > 0){
			prod *= number;
			number--;
		}
		return prod;
	}
}
