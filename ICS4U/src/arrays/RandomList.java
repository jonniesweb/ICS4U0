package arrays;

class RandomList {

	// list will hold the 25 numbers
	static int[] list = new int[25];

	public static void main(String[] args) {

		// create a random number between -10 and 15, 25 times
		for (int i = 0; i < 25; i++) {

			list[i] = (int) (Math.ceil(Math.random() * 26) - 11);

		}
		int counter = 0;
		
		// iterate over the list to print out the numbers
		for (int j : list) {
			
			System.out.print(j + "    ");
			counter++;
			
			if (counter == 15) {
				System.out.println("");
			}
		}
		System.out.println("");
		System.out.println("Zeroes: " + getZeroes(list, 0));
		System.out.println("Sevens: " + getZeroes(list, 7));
		System.out.println("Average: " + getAverage(list));
		System.out.println("Even: " + getEvenOdd(list, true));
		System.out.println("Odd: " + getEvenOdd(list, false));
		
		
		

	}

	private static int getEvenOdd(int[] list2, boolean isEven) {

		int counter = 0;



		for (int i = 0; i < list2.length; i++) {
			if (list2[i] == -10 || list2[i] == -8 || list2[i] == -6 || list2[i] ==  -4 || list2[i] == -2 || list2[i] == 2 || list2[i] == 4 || list2[i] == 6 || list2[i] == 8 || list2[i] == 10 || list2[i] == 12 || list2[i] == 14) {
				counter++;
			}
		}
		if (isEven) {
			return counter;
		} else {
			return list2.length - counter;
		}

	}

	private static double getAverage(int[] list2) {

		double average = 0;

		for (int i = 0; i < list2.length; i++) {
			average += list2[i];
		}

		average = average / list2.length;

		return average;

	}

	private static int getZeroes(int[] list2, int number) {

		int counter = 0;

		for(int i : list2) {

			if (i == number) {
				counter++;
			}

		}

		return counter;
	}

}
