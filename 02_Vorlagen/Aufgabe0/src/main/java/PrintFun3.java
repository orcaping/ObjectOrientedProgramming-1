public class PrintFun3 {
	public static void main(String[] args) {
		symbolSquare('$', 5);
	}

	static void symbolSquare(char symbol, int amount) {
		for (int i = 1; i <= amount; i++) {
			symbolLine(symbol, amount - i + 1);
		}
	}

	static void symbolLine(char symbol, int amount) {
		for (int i = 1; i <= amount; i++) {
			System.out.print(symbol);
		}
		System.out.println();
		amount--;
	}
}
