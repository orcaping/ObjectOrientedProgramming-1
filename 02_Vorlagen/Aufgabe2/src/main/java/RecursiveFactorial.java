public class RecursiveFactorial {
	public static void main(String[] args) {

		System.out.println(doubleFactorial(19)); // Bei 20 invertiert Integer da out of bounds

	}

	public static int doubleFactorial(int value){
		if (value == 0 || value == 1){
			return 1;
		}
		return value * doubleFactorial(value - 2);
	}
}
