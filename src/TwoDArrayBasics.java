import java.util.Random;

public class TwoDArrayBasics {

	public static void main(String[] args) {
		// Create a 3 x 5 array of ints
		int[][] arr = new int[3][5];
		int[] one = {0, 2, 42, 44, 12, 2};
		int[] two = {1, 2, 3, 4, 5, 6};
		// Fill the array with random numbers using fillRandom
		fillrandom(arr, 0, 100);
		// test each method you create below.
		print(arr);
		System.out.println(sumr(arr, 0));
		printone(allsums(arr));
		System.out.print(checkrepeat(one));
		System.out.println(" " + checkrepeat(two));
		System.out.println(find(one, 44));
		System.out.println(min(arr));
		System.out.println(max(arr));

		

	}
	/*
	 * given the lower and upper bounds of the random numbers
	 * fill an array of random numbers 
	 */
		public static void fillrandom(int[][] arr, int low, int high) {
			Random rand = new Random();
			for (int r = 0; r < arr.length; r++) {
				for (int c = 0; c < arr[0].length; c++) {
					arr[r][c] = rand.nextInt(high) + low;
				}
			}
		}
	/*
	 * create a method that prints a 2D array
	 */
		public static void print(int[][] arr) {
			for (int r = 0; r < arr.length; r++) {
				for (int c = 0; c < arr[0].length; c++) {
					System.out.print(arr[r][c]);
					System.out.print("\t");
				}
				System.out.println();
			}
		}
	
	/*
	 * return the sum of a row (r) in a 2D array (nums)
	 */
		public static int sumr(int[][] arr, int row) {
			int sum = 0;
			for (int c = 0; c < arr[0].length; c++) {
				sum += arr[row][c];
			}
			
			return sum;
		}

	
	/*
	 * return an array of row sums of a 2D array (nums)
	 */
		public static int[] allsums(int[][] arr) {
			int[] end = new int[arr.length];
			for (int c = 0; c < arr.length; c++) {
				end[c] = sumr(arr, c);
			}
			return end;
		}
		public static void printone(int[] arr) {
			for (int item: arr) {
				System.out.print(item);
				System.out.print("\t");
			}
			System.out.println();
		}

	
	
	/*
	 * check an 1D array for repeats, return true if all 
	 * elements of the array are unique
	 */
		public static boolean checkrepeat(int[] arr) {
			for (int i = 0; i < arr.length; i++) {
				int position = arr[i];
				for (int r = 0; r < arr.length; r++) {
					if (r == i) {
						
					} else if (arr[r] == position) {
						return false;
					} else {
						
					}
				}
			}
			return true;
		}

	
	
	/*
	 * given an array
	 * return the index of the target value, 
	 * return -1 if it is not found
	 */
		public static int find(int[] arr, int target) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == target)
					return i;
			}
			return -1;
		}

	
	
	/*
	 * return the min value in a 2D array
	 */
		public static int min(int[][] arr) {
			int min = arr[0][0];
			for (int r = 0; r < arr.length; r++) {
				for (int c = 0; c < arr[0].length; c++) {
					if (arr[r][c] < min) {
						min = arr[r][c];
					}
				}
			}
			return min;
		}

	
	
	
	/*
	 * return the max value in a 2D array
	 */
		public static int max(int[][] arr) {
			int max = arr[0][0];
			for (int r = 0; r < arr.length; r++) {
				for (int c = 0; c < arr[0].length; c++) {
					if (arr[r][c] > max) {
						max = arr[r][c];
					}
				}
			}
			return max;
		}
}
