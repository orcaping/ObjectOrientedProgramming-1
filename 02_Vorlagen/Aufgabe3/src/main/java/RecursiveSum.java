import java.util.Random;

public class RecursiveSum {
	public static void main(String[] args) {
		int[] series = randomSeries(1000);
		// Compute the sum of the series recursively
		System.out.println(recursiveSum(series, 0));
	}
	public static int recursiveSum(int[] values, int index){
		if (index == values.length - 1){
			return values[index];
		}
		return values[index] + recursiveSum(values, index+1);
	}
	
	static int[] randomSeries(int amount) {
		Random random = new Random(4711);
		int[] series = new int[amount];
		for (int index = 0; index < amount; index++) {
			series[index] = random.nextInt(10);
		}
		return series;
	}
}
