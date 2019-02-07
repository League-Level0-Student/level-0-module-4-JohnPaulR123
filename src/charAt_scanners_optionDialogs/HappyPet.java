package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	static int pet;
	static String petType;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		pet = JOptionPane.showOptionDialog(null, "What Pet Would You Like?", null, 0, JOptionPane.INFORMATION_MESSAGE,
				null, new String[] { "Dog", "Cat", "Bird", "Hamster" }, null);
		if (pet == 3) {
			petType = "Hamster";
		}
		if (pet == 2) {
			petType = "Bird";
		}
		if (pet == 1) {
			petType = "Cat";
		}
		if (pet == 0) {
			petType = "Dog";
		}
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; happinessLevel < 25; i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their
			// pet happy
			// (eg: cuddle, food, water, take a walk, groom, clean up poop).
			// Make sure to customize the title and question too.

			int task = JOptionPane.showOptionDialog(null,
					"What Would You Like To Do To Make Your " + petType + " Happy?", "Title", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Cuddle", "Walk", "Feed", "Groom" }, null);
			if (task == 0) {
				cuddle();
			} else if (task == 1) {
				walk();
			} else if (task == 2) {
				feed();
			} else if (task == 3) {
				groom();
			}
			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			// user that he loves his pet and use break; to exit for loop.

		}
		JOptionPane.showOptionDialog(null, "Congradulations! Your Pet Loves You!", "Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Exit" }, null);

	}
	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.

	static void cuddle() {
		happinessLevel += 2;
		if (pet == 3) {
			JOptionPane.showMessageDialog(null, "Squeak Squeak");
		}

		else if (pet == 0) {
			JOptionPane.showMessageDialog(null, "Bark Bark");
		} else if (pet == 1) {
			JOptionPane.showMessageDialog(null, "Purr Purr");

		} else if (pet == 2) {
			JOptionPane.showMessageDialog(null, "JAAA JAAA");

			happinessLevel -= 4;
		}
	}

	static void walk() {
		happinessLevel += 4;
		if (pet == 3) {
			JOptionPane.showMessageDialog(null, "Squeak Squeak");
		} else if (pet == 2) {
			JOptionPane.showMessageDialog(null, "Chirp Chirp");
		} else if (pet == 0) {
			JOptionPane.showMessageDialog(null, "Bark Bark");
		} else if (pet == 1) {
			JOptionPane.showMessageDialog(null, "Purr Purr");

			happinessLevel -= 7;
		}
	}

	static void groom() {
		happinessLevel += 1;
		if (pet == 3) {
			JOptionPane.showMessageDialog(null, "Squeak Squeak");
		}
		if (pet == 2) {
			JOptionPane.showMessageDialog(null, "Chirp Chirp");
		}

		if (pet == 0) {
			JOptionPane.showMessageDialog(null, "Bark Bark");
		}
		if (pet == 1) {
			JOptionPane.showMessageDialog(null, "HHHHHHHEEEEEEE");
		
		happinessLevel -= 5;
	}
	}
	static void feed() {
		if (pet == 3) {
			JOptionPane.showMessageDialog(null, "Squeak Squeak");
		}
		if (pet == 2) {
			JOptionPane.showMessageDialog(null, "Chirp Chirp");
		}
		if (pet == 1) {
			JOptionPane.showMessageDialog(null, "Purr Purr");
		}
		if (pet == 0) {
			JOptionPane.showMessageDialog(null, "Bark Bark");
		}

		happinessLevel += 3;
	}

}