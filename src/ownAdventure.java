import javax.swing.JOptionPane;

public class ownAdventure {
	static int gift;

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Today is Valentines Day.");
		JOptionPane.showMessageDialog(null, "You want to ask the girl you like to be your Valentine.");
		gift =	JOptionPane.showOptionDialog(null, "What would you like to buy for her?", "Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Chocolates", "Flowers", "A Card", "All Three" }, null);
		if (gift == 1) {
			chocolates();
		} else if (gift == 2) {
			flowers();
		} else if (gift == 3) {
			card();
		} else if (gift == 4) {
			three();
		}

	}

	static void chocolates() {
		JOptionPane.showMessageDialog(null, "You went towards your crush.");
		JOptionPane.showMessageDialog(null, "It turns out that she's allergic to chocolate.");
		JOptionPane.showMessageDialog(null, "YOU DIED");
	}

	static void flowers() {
JOptionPane.showMessageDialog(null, "You went up to your crush and asked her to be your valentine as you handed her the flowers.");
JOptionPane.showMessageDialog(null, "She loved the flowers and said yes.");
	}

	static void card() {
JOptionPane.showMessageDialog(null, "You want up to your crush and handed her the card.");
JOptionPane.showMessageDialog(null, "It turns out she's illiterate.");
JOptionPane.showMessageDialog(null, "YOU DIED");
	}

	static void three() {

	}

}