import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot rob = new Robot();
	static int x;
	static String height = JOptionPane.showInputDialog("Do you want a small, medium, or large building?");
	static String colorRed = JOptionPane.showInputDialog("What value do you want the red to be?(max 255)");
	static String colorBlue = JOptionPane.showInputDialog("What value do you want the blue to be?(max 255)");
	static String colorGreen = JOptionPane.showInputDialog("What value do you want the green to be?(max 255)");
	static int red = Integer.parseInt(colorRed);
	static int blue = Integer.parseInt(colorBlue);
	static int green = Integer.parseInt(colorGreen);
	static String roofType;

	public static void main(String[] args) {
		rob.setX(100);
		rob.setY(500);
		if (height.equalsIgnoreCase("small")) {
			x = 60;
		} else if (height.equalsIgnoreCase("medium")) {
			x = 120;
		} else if (height.equalsIgnoreCase("large")) {
			x = 250;
		}
		for (int i = 0; i < 5; i++) {
DrawHouse house = new DrawHouse();
house.drawHouse();
		}

	}

}
