import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot bumblebee=new Robot();
bumblebee.penDown();
bumblebee.sparkle();
bumblebee.setSpeed(50);
	for (int i = 0; i < 4; i++) {
bumblebee.move(100);
bumblebee.turn(90);
}
	bumblebee.penUp();
	bumblebee.turn(180);
	bumblebee.move(100);
	}
}
