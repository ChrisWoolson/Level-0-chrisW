import javax.swing.JOptionPane;

public class SimpleNumberSorter {
public static void main(String[] args) {
	String a1 = JOptionPane.showInputDialog("please insert a random number");
	int answer1 = Integer.parseInt(a1);
	String a2 = JOptionPane.showInputDialog("please insert a random number");
	int answer2 = Integer.parseInt(a2);
	String a3 = JOptionPane.showInputDialog("please insert a random number");
	int answer3 = Integer.parseInt(a3);
	
	if(answer1>answer2){		
	int t = answer1;
	answer1 = answer2;
	answer2 = t;
	}
	
	if(answer1>answer3){		
		int t = answer1;
		answer1 = answer3;
		answer3 = t;
		}
	if(answer2>answer3){
		int t = answer2;
		answer2 = answer3;
		answer3 = t;
		}
	JOptionPane.showMessageDialog(null, answer1+" "+answer2+" "+answer3 );
	JOptionPane.showMessageDialog(null, answer3+" "+answer2+" "+answer1 );

}}