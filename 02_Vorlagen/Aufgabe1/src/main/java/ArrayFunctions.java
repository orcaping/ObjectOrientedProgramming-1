import java.util.ArrayList;

public class ArrayFunctions {
	public static void main(String[] args){
		int[] demoArrayAscending = {1, 2, 3, 4, 5};
		int[] demoArrayDescending = {5, 4, 3, 2, 1};
		int[] emptyArray = {};


		print(emptyArray);

		print(fillArray(20));

		print(revert(fillArray(20)));

		// return true
		System.out.println("return true: " + ascendinglySorted(demoArrayAscending));
		System.out.println("return false: " + ascendinglySorted(demoArrayDescending));

		// return true
		System.out.println("return true: " + descendinglySorted(demoArrayDescending));
		System.out.println("return false: " + descendinglySorted(demoArrayAscending));
	}

	public static boolean ascendinglySorted(int[] values){
		if (values == null){
			System.out.println("null");
			return false;
		}
		for (int i = 0; i < values.length - 1; i++){
			if (values[i] > values[i+1]){
				return false;
			}
		}
		return true;
	}

	public static boolean descendinglySorted(int[] values){
		if (values == null){
			System.out.println("null");
			return false;
		}
		for (int i = 0; i < values.length - 1; i++){
			if (values[i] < values[i+1]){
				return false;
			}
		}
		return true;
	}



	public static void print(int[] values){
		if (values == null){
			System.out.println("null");
			return;
		}
			System.out.print("[");

			for (int i = 0; i < values.length; i++){ // To set proper commas need to address index instead of actual values with the : loop
				System.out.print(values[i]);

				if (i < values.length - 1){
					System.out.print(", ");
				}
			}
			System.out.print("]");
			System.out.println();
	}


	public static int[] revert(int[] values){
		if (values == null){
			System.out.println("null");
			return values;
		}
		int[] revertedArray = new int[values.length];
		for (int i : values){
			revertedArray[revertedArray.length - i] = i;
		}
		return revertedArray;
	}

	private static int[] fillArray(int arraySize){
		int[] filledArray = new int[arraySize];
		for (int i = 0; i < arraySize; i++){
			filledArray[i] = i + 1;
		}
		return filledArray;
	}
}
