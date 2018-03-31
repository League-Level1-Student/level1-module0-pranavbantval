import javax.swing.JOptionPane;

public class DrawHouse {
	static void drawHouse() {
		rob.setAngle(0);
		rob.setSpeed(100);
		rob.penDown();
		rob.setPenColor(red, blue, green);
		rob.move(x);
		if(height.equalsIgnoreCase("large")) {
			drawFlatRoof();
		}
		else {
			 roofType = JOptionPane.showInputDialog("Do you want a flat or pointy roof?");
			 if(roofType.equalsIgnoreCase("flat")) {
				 drawFlatRoof();
			 }
			 else {
				 drawPointyRoof();
			 }
		}
		rob.move(x);
		rob.setAngle(90);
		rob.setPenColor(0, 255, 0);
		rob.move(20);

	}

	static void drawFlatRoof() {
		rob.turn(90);
		rob.move(15);
		rob.turn(90);
	}

	static void drawPointyRoof() {
		rob.setAngle(45);
		rob.move(15);
		rob.turn(90);
		rob.move(15);
		rob.setAngle(180);
	}
}
