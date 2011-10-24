package review;

public class Boxes {

	
	static hsa.Console c;
	
	
	public static void main(String[] args) {
		
		c = new hsa.Console();
		
		int width, height;


		
		print("Box Program\n");
		print("Please enter the width: ");
		
			width = getInt();

		
		print("Pkease enter the height: ");
		height = getInt();

		
		
		
		for (int i = 0; i < width; i++) {
			print("*");
		}
		
		print("\n");
		
		
		for (int i = 0; i < (height-2); i++) {
			print("*");
			for (int j = 0; j < (width - 2); j++) {
				print(" ");
			}
			print("*\n");
		}
		
		for (int i = 0; i < width; i++) {
			print("*");
		}


	}

	private static int getInt() {
		return c.readInt();
	}
	
	private static void print(String string) {
		c.print(string);
		
	}
	

}
