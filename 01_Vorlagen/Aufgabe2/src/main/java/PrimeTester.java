public class PrimeTester {
	public static void main(String[] args) {

		int number = 11;
		System.out.println(primeTester(number));
	}
	private static boolean primeTester(int number){

		for (int divisor = (number-1); divisor > 1; divisor--){
			if (number % divisor == 0){
				return false;
			}
		}
		return true;
	}

}
