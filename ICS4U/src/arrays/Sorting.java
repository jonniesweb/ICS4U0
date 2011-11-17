package arrays;

// bad, but required imports
import java.util.ArrayList;

import hsa.Console;

public class Sorting {


	// Have a constructor just because 
	public Sorting() {

		Console c = new Console();
		
		// find out how big the array should be from the user
		c.print("Please enter how large you want the array to be: ");
		int arrayLengthChoice = c.readInt();
		
		// create an array to the specified length
		int[] list = new int[arrayLengthChoice];
		
		// fill that array with random numbers
		for (int i = 0; i < arrayLengthChoice; i++) {
			list[i] = (int) Math.ceil((Math.random() * arrayLengthChoice));
		}


		// define choice
		int sortChoice;

		// loop the menu forever
		while (true) {
			c.print("Choose a way of sorting(1. Bubble, 2. Insertion, 3. Selection, 4. Quit): ");

			// get input
			sortChoice = c.readInt();

			// if bubblesort goto method
			if (sortChoice == 1) {

				printArray(c, bubbleSort(list));

			} else if (sortChoice == 2) {
				// if insertion sort goto method
				printArray(c, insertionSort(list));

			} else if (sortChoice == 3) {
				// if selection sort goto method
				printArray(c, selectionSort(list));

			} else if (sortChoice == 4) {
				// if 4 exit the program
				System.exit(0);
			} else {
				// catch all statement
				c.println("Please enter a valid number");
			}
		}


	}
	
	public Sorting(boolean itsYourChoice) {

	}


	// selection sort method
	public int[] selectionSort(int[] list) {
		
		int min, temp = 0;

		// iterate over the whole array
		for (int i = 0 ; i < list.length - 1 ; i++)
		{
			
			// compare a number with the number next to it
			min = i;
			for (int j = i + 1 ; j < list.length ; j++)
			{
				// if the second number is smaller, move it to the first
				if (list [j] < list [min])
					min = j;
			}
			// move the numbers
			temp = list [i];
			list [i] = list [min];
			list [min] = temp;
		}
		return list;
	}

	// insertion sort method
	public int[] insertionSort(int[] list) {
		int index, j;

		// iterate over the whole array
		for (int i = 1 ; i < list.length ; i++)
		{
			// set the starting point
			index = list [i];
			j = i;
			
			// compare numbers in the local
			while ((j > 0) && (list [j - 1] > index))
			{
				// compare
				list [j] = list [j - 1];
				j = j - 1;
			}
			list [j] = index;
		}
		return list;
	}

	// bubble sort method *cringe*
	public int[] bubbleSort(int[] list) {
		int temp = 0;

		// iterate over the whole array
		for (int i = (list.length - 1) ; i >= 0 ; i--)
		{
			// stop right before it compares the last number to undefined
			for (int j = 1 ; j <= i ; j++)
			{
				// if first number is bigger than the second number
				if (list [j - 1] > list [j])
				{
					// switch the numbers around
					temp = list [j - 1];
					list [j - 1] = list [j];
					list [j] = temp;
				}
			}
		}
		return list;
	}
	
	public static ArrayList<Integer> quickSort(ArrayList<Integer> numbers) {
        if (numbers.size() <= 1)
            return numbers;
        int pivot = numbers.size() / 2;
        ArrayList<Integer> lesser = new ArrayList<Integer>();
        ArrayList<Integer> greater = new ArrayList<Integer>();
        int sameAsPivot = 0;
        for (int number : numbers) {
            if (number > numbers.get(pivot))
                greater.add(number);
            else if (number < numbers.get(pivot))
                lesser.add(number);
            else
                sameAsPivot++;
        }
        lesser = quickSort(lesser);
        for (int i = 0; i < sameAsPivot; i++)
            lesser.add(numbers.get(pivot));
        greater = quickSort(greater);
        ArrayList<Integer> sorted = new ArrayList<Integer>();
        for (int number : lesser)
            sorted.add(number);
        for (int number: greater)
            sorted.add(number);
        return sorted;
    }
	
	
	private void printArray(Console c, int[] list) {
		
		for (int i = 0; i < list.length; i++) {
			c.print(list[i], 7);
		}
		c.println();
	}


	// main method
	public static void main(String[] args) {
		// Call this classes constructor
		new Sorting();

	}

}
