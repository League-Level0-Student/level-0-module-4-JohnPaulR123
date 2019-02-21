import javax.swing.JOptionPane;

public class ownAdventure {
	static int gift;
	static int place;

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Today is Valentines Day.");
		JOptionPane.showMessageDialog(null, "You want to ask the girl you like to be your Valentine.");
		gift = JOptionPane.showOptionDialog(null, "What would you like to buy for her?", "Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Chocolates", "Flowers", "A Card", "All Three" },
				null);
		if (gift == 0) {
			chocolates();
		} else if (gift == 1) {
			flowers();
			JOptionPane.showMessageDialog(null,
					"After school, your valentine asked if you wanted to do something.");
			JOptionPane.showMessageDialog(null, "You said yes.");
			place = JOptionPane.showOptionDialog(null, "She ask you where do you want to take her.", "Title", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Movie", "IN-N-OUT", "The Mall", "Del Mar" },
					null);
			if (place == 0) {
				movie();
			} else if (place == 1) {
				inOut();
			} else if (place == 2) {
				mall();
			} else if (place == 3) {
				mar();
			}
		} else if (gift == 2) {
			card();
		} else if (gift == 3) {
			three();
			JOptionPane.showMessageDialog(null,
					"After school, your valentine asked if you wanted to do something.");
			JOptionPane.showMessageDialog(null, "You said yes.");
			place = JOptionPane.showOptionDialog(null, "She ask you where do you want to take her.", "Title", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Movie", "IN-N-OUT", "The Mall", "Del Mar" },
					null);
			if (place == 0) {
				movie();
			} else if (place == 1) {
				inOut();
			} else if (place == 2) {
				mall();
			} else if (place == 3) {
				mar();
			}
		}
	
	}

	static void chocolates() {
		JOptionPane.showMessageDialog(null, "You went towards your crush.");
		JOptionPane.showMessageDialog(null, "It turns out that she's allergic to chocolate.");
		JOptionPane.showMessageDialog(null, "YOU DIED");
	}

	static void flowers() {
		JOptionPane.showMessageDialog(null,
				"You went up to your crush and asked her to be your valentine as you handed her the flowers.");
		JOptionPane.showMessageDialog(null, "She loved the flowers and said yes.");
	}

	static void card() {
		JOptionPane.showMessageDialog(null, "You want up to your crush and handed her the card.");
		JOptionPane.showMessageDialog(null, "It turns out she's illiterate.");
		JOptionPane.showMessageDialog(null, "YOU DIED");
	}

	static void three() {
		JOptionPane.showMessageDialog(null,
				"You went up to your crush and handed her the chocolates, flowers, and the card.");
		JOptionPane.showMessageDialog(null, "She loved the gifts and accepted to be your valentine.");
	}

	static void movie() {
JOptionPane.showMessageDialog(null, "You went to the movie theater.");
JOptionPane.showMessageDialog(null, "You saw Happy Death Day 2.");
JOptionPane.showMessageDialog(null, "In the scary parts she hid in your shoulder and after the movie she smiled as walked with your arm around her.");
JOptionPane.showMessageDialog(null, "You walked her to her house and she asked if you wanted to go out again.");
JOptionPane.showMessageDialog(null, "You said yes. It couldn't leave your head all night.");
	}

	static void inOut() {

	}

	static void mall() {

	}

	static void mar() {

	}

}