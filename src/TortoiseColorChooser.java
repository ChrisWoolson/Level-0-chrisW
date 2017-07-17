import javax.swing.JOptionPane;

import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {

		// 3. ask the user what color they would like the tortoise to draw
		String answer = JOptionPane.showInputDialog("what color would you like the tortoise to draw?");
		// 4. use an if/else statement to set the pen color that the user
		// requested
		if (answer.equals("green")) {
			Tortoise.setPenColor(Color.green);

		} else if (answer.equals("blue")) {
			Tortoise.setPenColor(Color.blue);
		} else

		if (answer.equals("red")) {
			Tortoise.setPenColor(Color.red);

		} else if (answer.equals("orange")) {
			Tortoise.setPenColor(Color.orange);

		} else if (answer.equals("yellow")) {
			Tortoise.setPenColor(Color.green);

		} else {
			Tortoise.setPenColor(PenColors.getRandomColor());
		}
		// 5. if the user doesn’t enter anything, choose a random color

		// 6. put a loop around your code so that you keep asking the user for
		// more colors & drawing them

		// 2. set the pen width to 10

		// 1. make the tortoise draw a shape (this will take more than one line
		// of code)
		for (int i = 0; i < 5; i++){
			Tortoise.move(40);
		Tortoise.turn(360 / 5);
		}
	}
}
