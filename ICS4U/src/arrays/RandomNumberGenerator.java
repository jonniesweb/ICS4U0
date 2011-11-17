package arrays;

import hsa.Console;

public class RandomNumberGenerator {

	private int[] list;
	private Console c;

	public RandomNumberGenerator(Console console) {

		c = console;
	}

	public int[] getList() {

		// find out how big the array should be from the user
		c.print("Please enter how large you want the array to be: ");
		int arrayLengthChoice = c.readInt();

		// create an array to the specified length
		list = new int[arrayLengthChoice];

		// fill that array with random numbers
		for (int i = 0; i < arrayLengthChoice; i++) {
			list[i] = (int) Math.ceil((Math.random() * arrayLengthChoice));

		}

		return list;
	}
	
	public void printList(int[] list) {
		
		for (int i = 0; i < list.length; i++) {
			c.print(list[i], 7);
		}
		
	}

}
