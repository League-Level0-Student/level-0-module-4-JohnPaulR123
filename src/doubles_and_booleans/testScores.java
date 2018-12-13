package doubles_and_booleans;

import javax.swing.JOptionPane;

public class testScores {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("What were your grades?");
		double grades = Double.parseDouble(answer);
		if (grades > 90) {
			JOptionPane.showMessageDialog(null, "Wow! You must have studied really hard for that test!");
		} else if (grades > 65 & grades < 90) {
			JOptionPane.showMessageDialog(null, "Oh nice one!");
		} else {
			JOptionPane.showMessageDialog(null, "That's real bad!");
		}
	}
}
