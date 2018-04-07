import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DrawHouse {
	static String colorRed = JOptionPane.showInputDialog("What value do you want the red to be?(max 255)");
	static String colorBlue = JOptionPane.showInputDialog("What value do you want the blue to be?(max 255)");
	static String colorGreen = JOptionPane.showInputDialog("What value do you want the green to be?(max 255)");
	static int red = Integer.parseInt(colorRed);
	static int blue = Integer.parseInt(colorBlue);
	static int green = Integer.parseInt(colorGreen);
	static String roofType;
	void drawHouse(Robot rob, int x, String height) {
		rob.setAngle(0);
		rob.setSpeed(100);
		rob.penDown();
		rob.setPenColor(red, blue, green);
		rob.move(x);
		if(height.equalsIgnoreCase("large")) {
			drawFlatRoof(rob);
		}
		else {
			 roofType = JOptionPane.showInputDialog("Do you want a flat or pointy roof?");
			 if(roofType.equalsIgnoreCase("flat")) {
				 drawFlatRoof(rob);
			 }
			 else {
				 drawPointyRoof(rob);
			 }
		}
		rob.move(x);
		rob.setAngle(90);
		rob.setPenColor(0, 255, 0);
		rob.move(20);

	}

	static void drawFlatRoof(Robot rob) {
		rob.turn(90);
		rob.move(15);
		rob.turn(90);
	}

	static void drawPointyRoof(Robot rob) {
		rob.setAngle(45);
		rob.move(15);
		rob.turn(90);
		rob.move(15);
		rob.setAngle(180);
	}
}
