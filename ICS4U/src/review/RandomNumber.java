package review;


public class RandomNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int randNum, one = 0, two = 0, three = 0, four = 0, five = 0;
		
		print("Begin list of 20 numbers");
		print("");
		
		
		for (int i = 0; i < 20; i++) {
			
			randNum = (int) Math.ceil(Math.random()* 5);
			
			switch (randNum) {
			case 1:
				print("One");
				one++;
				break;
				
			case 2:
				print("Two");
				two++;
				break;
				
			case 3:
				print("Three");
				three++;
				break;
				
			case 4:
				print("Four");
				four++;
				break;
			
			case 5:
				print("Five");
				five++;
				break;
				
			default:
				print("impossible random number achieved");
				break;
			}
			
			
		}
		print("");
		print("Totals: One=" + one + " Two=" + two + " Three=" + three + " Four=" + four + " Five=" + five);

	}

	private static void print(String string) {

			System.out.println(string);

		
	}

}
