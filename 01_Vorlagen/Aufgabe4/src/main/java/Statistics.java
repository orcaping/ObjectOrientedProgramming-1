import java.util.Random;

public class Statistics {
	public static void main(String[] args) {
		double[] series = randomSeries(10000);
		// implement statistical analysis

		System.out.println(minimum(series));
		System.out.println(maximum(series));
		System.out.println(arithmetic(series));
		System.out.println(varianz(series));
		System.out.println(standardDeviation(series));
	}

	private static double minimum(double[] array){
		double current = array[0];
		for (double x : array){
			if (x < current){
				current = x;
			}
		}
		return current;
	}

	private static double maximum(double[] array){
		double current = array[0];
		for (double x : array){
			if (x > current){
				current = x;
			}
		}
		return current;
	}

	private static double arithmetic(double[] array){
		double sum = 0;
		for (double x : array){
			sum += x;
		}

        return sum / array.length;
	}

	private static double varianz(double[] array){
		double m = arithmetic(array);
		double sumOfSquare = 0;
		for (double x : array){
			sumOfSquare += (x - m) * (x - m);
		}

        return sumOfSquare / array.length;
	}

	private static double standardDeviation(double[] array){
		return Math.sqrt(varianz(array));
	}
	
	static double[] randomSeries(int amount) {
		double[] series = new double[amount];
		Random random = new Random(4711);
		for (int index = 0; index < amount; index++) {
			series[index] = random.nextDouble();
		}
		return series;
	}
}
