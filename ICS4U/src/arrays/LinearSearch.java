package arrays;

// define crappy imports
import hsa.Console;

public class LinearSearch {
	
	// define crappy hsa as a field
	private static Console c = new Console();
	private static int[] list;
	private int key;
	

	// method to perform linear search
	public int search() {
		
		for (int i = 0; i < list.length; i++) {
			if (list[i] > key) {
				return -1;
				
			} else if (list[i] == key) {
				return i;
			}
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
		
		c.print("Please enter how long of an array this program will generate: ");
		int arrayLength = c.readInt();
		for (int i = 0; i < arrayLength; i++) {
			
			list[i] = (int) Math.random() * arrayLength;
			
		}
		
		new LinearSearch();

	}

}
