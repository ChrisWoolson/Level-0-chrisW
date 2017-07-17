import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot Chris= new Robot();
	Chris.penDown();
	Chris.turn(-110);
	
	for(int i=0; i< 8; i++){
	Chris.turn(230/8);
		Chris.move(60);
		
}
}
}
