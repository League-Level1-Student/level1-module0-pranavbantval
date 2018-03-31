import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton();
	int n;

	public static void main(String[] args) {
		new FortuneCookie().showButton();
	}

	void showButton() {
		frame.setVisible(true);
		System.out.println("Button");
		frame.add(button);
		button.addActionListener(this);
		button.setText("Click here for fortune!!");
		
	}

	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if (buttonPressed == button) {
			Random r = new Random();
			 n = r.nextInt(5);
			 frame.pack();
			JOptionPane.showMessageDialog(null, "WooHoo");
			if (n == 0) {
				JOptionPane.showMessageDialog(null,
						"Your fortune is: \n you will never get married.\n Has your fortune come true yet?\n If so follow us on tweeter for more fun fortunes!");
			}

			else if (n == 1) {
				JOptionPane.showMessageDialog(null,
						"Your fortune is: \n you will win the lottery.\n Has your fortune come true yet?\n If so follow us on tweeter for more fun fortunes!");
			} else if (n == 2) {
				JOptionPane.showMessageDialog(null,
						"Your fortune is: \n you will be successful in life.\n Has your fortune come true yet?\n If so follow us on tweeter for more fun fortunes!");
			} else if (n == 3) {
				JOptionPane.showMessageDialog(null,
						"Your fortune is: \n you will become homeless.\n Has your fortune come true yet?\n If so follow us on tweeter for more fun fortunes!");
			} else if (n == 4) {
				JOptionPane.showMessageDialog(null,
						"Your fortune is: \n you will live your dream life.\n Has your fortune come true yet?\n If so follow us on tweeter for more fun fortunes!");
			}
		}
	}

}
