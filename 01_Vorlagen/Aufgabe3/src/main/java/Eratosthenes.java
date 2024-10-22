public class Eratosthenes {
	public static void main(String[] args) {

		int max = 100;

		printArray(sieve(fillArray(max)));

	}

	private static int[] fillArray(int max){

		int[] sortedArray = new int[max];
		for (int index = 0; index < max; index++){
			sortedArray[index] = index;
		}
		return sortedArray;
	}

	private static int[] printArray(int[] array){
		for (int k : array){
			System.out.print(k + " ");
		}
		return array;
	}

	private static int[] sieve(int[] array){
		for (int i = 2; i < array.length; i++ ){
			for (int j = i * 2; j < array.length; j += i){
				array[j] = 0;
			}
		}
		return array;
	}
}
