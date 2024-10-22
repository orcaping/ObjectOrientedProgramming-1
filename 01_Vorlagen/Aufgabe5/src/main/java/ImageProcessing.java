
public class ImageProcessing {
	static int[][] invert(int[][] pixels) {
		// implement image inversion (negate all pixels)
		for (int i = 0; i < pixels.length; ++i){
			for (int j = 0; j < pixels[1].length; ++j){
				pixels[i][j] *= -1;
			}
		}
		return pixels;
	}
	
	static int[][] rotate(int[][] pixels) {
		// implement image rotation (90 degrees to the right)
		int[][] rotatedPixels = new int[pixels[1].length][pixels.length];

		for (int i = 0; i < rotatedPixels.length; ++i){
			for (int j = 0; j < rotatedPixels[1].length; ++j){
				rotatedPixels[i][j] = pixels[pixels.length - 1 - j][i];  // Swapped i and j
			}
		}
		return rotatedPixels;
	}
	
	static int[][] mirror(int[][] pixels) {
		// implement image mirroring (horizontal, left <-> right)
		int[][] tempArray = new int[pixels.length][pixels[0].length];
		for (int i = 0; i < pixels.length; ++i){
			for (int j = 0; j < pixels[1].length; ++j){
				tempArray[i][j] = pixels[i][pixels[0].length - 1 - j];
			}
		}
		return tempArray;
	}
	
	static int[][] gray(int[][] pixels) {
		// optional task (advanced)
		return pixels;
	}
}
