public class DoubleFactorial {
	public static void main(String[] args) {

		int number = 6;
		System.out.println(doubleFactorial(number));

	}

	private static int doubleFactorial(int number){
		int sum = 1;

		while(number >= 1){
			sum *= number;
			number -= 2;
		}
		return sum;
	}
}
