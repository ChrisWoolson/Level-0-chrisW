import javax.swing.JOptionPane;

public class ChangeCalculator {

		public static void main(String[] args) {

			// Ask the user how many nickels they have
String answer1 =JOptionPane.showInputDialog("How many nickels do you have");
			// Convert their answer to an int using Integer.parseInt()
int nickels = Integer.parseInt(answer1);
			// Ask the user how many dimes they have, and convert their answer
String answer2 =JOptionPane.showInputDialog("How many dimes do you have?");
int dimes = Integer.parseInt(answer2);
// Ask the user how many quarters they have, and convert their answer
String answer3 =JOptionPane.showInputDialog("How many quarters do you have?");
int quarters = Integer.parseInt(answer3);
// Calculate how much money the user has and save it in a double variable 
double answer= nickels*.05+ dimes*.10+ quarters*.25;


JOptionPane.showMessageDialog(null, "You have"+answer);
			// Tell the user how much money they have

		}
	}


