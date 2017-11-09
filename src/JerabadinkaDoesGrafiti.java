import org.jointheleague.graphical.robot.Robot;

public class JerabadinkaDoesGrafiti {
public static void main(String[] args) {
	Robot Jerabadinka=new Robot();
	Jerabadinka.penDown();
	Jerabadinka.setSpeed(500);
	Jerabadinka.turn(140);
	Jerabadinka.move(100);
	Jerabadinka.turn(-100);
	Jerabadinka.move(100);
	Jerabadinka.turn(140);
	Jerabadinka.penUp();
	Jerabadinka.turn(120);
	Jerabadinka.move(200);
}
}
