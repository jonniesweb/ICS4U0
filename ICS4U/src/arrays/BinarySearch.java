package arrays;

import hsa.Console;

public class BinarySearch {

	public BinarySearch() {



	}

	public static int search(int[] list, int item) {

		int bottom = 0;
		int top = list.length - 1;
		int middle;
		boolean found = false;
		int location = -1;

		while (bottom <= top && !found) {

			middle = (bottom + top) / 2;

			if (list[middle] == item) {
				found = true;
				location = middle;
			} else if (list[middle] < item) {
				bottom = middle + 1;

			} else {
				top = middle - 1;
			}
		}
		
		return location;
	}

	public static void main(String[] args) {
		
		Console c = new Console();
		int[] list = null;
		
		Sorting sort = new Sorting(true);
		RandomNumberGenerator randNum = new RandomNumberGenerator(c);
		
		c.print("Please enter 1 to generate random numbers of your choice\n" +
				"or 2 to enter your own numbers: ");
		int menuChoice = c.readInt();
		
		
		if (menuChoice == 1) {
			
			list = randNum.getList();
			
		} else if (menuChoice == 2) {
			InputNumbers inputNumbers = new InputNumbers(c);
			list = inputNumbers.numberInput();
		} else {
			c.println("You entered an invalid number");
		}
		
		// use quicksort from Sorting.quickSort()
		list = sort.selectionSort(list);
		
		randNum.printList(list);
		
		c.println();
		
		c.print("Please enter a number to search for: ");
		int key = c.readInt();
		
		c.println("The key was found at index " + search(list, key));

	}

}
