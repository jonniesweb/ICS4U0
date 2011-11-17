package arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import hsa.Console;
import hsa.FatalError;

public class InputNumbers {

	private Console c = null;
	
	public InputNumbers(Console c) {

		this.c = c;
	}

	public int[] numberInput() {

		c.println("Please enter numbers per line");
		int num;
		ArrayList<Integer> aList = new ArrayList<Integer>();

		while (true) {
			try {
				// found out that you cant catch any exception thrown by hsa when c.readInt() is called
				// solution is to use c.readLine and convert to int using Integer.parseInt()
				// num = c.readInt();
				
				num = Integer.parseInt(c.readLine());
				
			} catch (NumberFormatException e) {
				break;
			}
			aList.add(c.readInt());
		}
		
		int[] list = new int[aList.size()];
		
		Iterator<Integer> iterator = aList.iterator();
		for (int i = 0; i < list.length; i++) {
			list[i] = iterator.next().intValue();
		}
		
		
		return null;

	}

}
