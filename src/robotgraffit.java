import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class robotgraffit {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
Robot r = new Robot("mini");
//This recipe draws the first letter of your name using the Robot
r.setSpeed(1000);
r.move(-100);
r.penDown();
r.setSpeed(100000);
r.move(300 );
r.turn(90);
for (int i = 0; i < 180; i++) {
	r.setSpeed(1000);
	r.move(1);
	r.turn(1);
}
    }
}
















