// By Jonnie Simpson
// Program where you can play two games

package menus;

// define class
public class TwoGames {

	// create a "bad" instance of the hsa console
	public static hsa.Console c = new hsa.Console();

	// define main method
	public static void main(String[] args) {

		// statements to ask the user to select a game or quit
		while (true) {
			c.println("Enter 1 to play game 1");
			c.println("Enter 2 to play game 2");
			c.println("Enter 3 to exit");
			int choice = c.readInt();
			if (choice == 3) {
				System.exit(0);
			}
			switch (choice) {
			case 1:
				// jump to the first game
				game1();
				break;

			case 2:
				// jump to the second game
				game2();
				break;

				// catch statement
			default:
				c.println("You entered an invalid number, please try again");
				break;
			}

			// clear the menu
			c.clear();
		}


	}


	// define game1 class
	private static void game1() {

		// create a random number for the user to guess
		int randnum = (int) Math.ceil(Math.random() * 20);

		int choice;

		// start a counter so that the user knows how long it took them to guess
		int counter = 0;


		// get the user to guess a number between 1 and 20
		// tell them if its right on, higher, or lower than the number
		while (true) {

			c.println("Guess a number between 1 and 20");

			choice = c.readInt();

			counter++;

			if (choice > randnum) {
				c.println("Try a smaller number");
			}  else if (choice < randnum) {
				c.println("Try a larger number");
			} else if (choice == randnum) {
				c.println("You chose the correct number");
				break; // exit out of the loop
			}
		}

		// tell the user how they did
		c.println("You guessed the number in " + counter + " tries");
		c.println("Type quit to go to the main menu");
		c.readString();


	}


	// define game2 class
	private static void game2() {

		// generate two random numbers for the user to multiply together
		int num1 = (int) Math.ceil(Math.random() * 12);
		int num2 = (int) Math.ceil(Math.random() * 12);

		// get the user to find the product of the two numbers
		c.println("Multiplycation Game");

		c.println("What is the product of " + num1 + " and " + num2 + "?");
		int ans = c.readInt();

		// tell the user if they're correct or wrong
		if (ans == num1*num2) {
			c.println("Correct!");

		} else if (ans != (num1*num2)) {
			c.println("You should have chosen " + num1*num2);
		} else {
			// Handle the impossible
			c.println("Impossible output achieved");
		}

		// exit statements that bring you back to the main menu
		c.println("Type quit to go to the main menu");
		c.readString();



	}

}
