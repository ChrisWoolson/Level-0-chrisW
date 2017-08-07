import javax.swing.JOptionPane;

public class SimpleNumberSorter {
public static void main(String[] args) {
	String a1 = JOptionPane.showInputDialog("please insert a random number");
	int answer1 = Integer.parseInt(a1);
	String a2 = JOptionPane.showInputDialog("please insert a random number");
	int answer2 = Integer.parseInt(a2);
	String a3 = JOptionPane.showInputDialog("please insert a random number");
	int answer3 = Integer.parseInt(a3);
	
	if(answer1 < answer2 && answer1<answer3 ){
		if(answer2 < answer3){
			JOptionPane.showMessageDialog(null, answer1 +" "+answer2+" " +answer3);
		}
		else	
	}
	else if(answer1 < answer2 && answer1<answer3){
		if(answer2 > answer3){
			JOptionPane.showMessageDialog(null, answer1 +" "+answer3+" " +answer2);
		}}
	
	
	if(answer2 < answer1 && answer2<answer3 ){
		if(answer1 < answer3){
			JOptionPane.showMessageDialog(null, answer2 +" "+answer1+" " +answer3);
		}}
	else if(answer1 < answer2 && answer1<answer3){
		if(answer1 > answer3){
			JOptionPane.showMessageDialog(null, answer2 +" "+answer3+" " +answer1);
		}}

	
	if(answer3 < answer2 && answer3<answer1 ){
		if(answer2 < answer1){
			JOptionPane.showMessageDialog(null, answer3 +" "+answer2+" " +answer1);
		}
		else{
			JOptionPane.showMessageDialog(null, answer3 +" "+answer1+" " +answer2);
		}
	}
	else if(answer1 < answer2 && answer1<answer3){
		if(answer2 > answer3){
			JOptionPane.showMessageDialog(null, answer3 +" "+answer1+" " +answer2);
		}}

	
}
}
