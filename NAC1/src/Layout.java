import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.BorderFactory;
import javax.swing.JFrame;

public class Layout extends JFrame {
	
	public Layout(String title) {
		
		super(title);
		this.setSize(800, 500);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container mainContainer = this.getContentPane();
		mainContainer.setLayout(new BorderLayout(8,6));
		mainContainer.setBackground(Color.YELLOW);
		this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.GREEN));
	}
	
	public static void main(String[] args) {
		
		Layout mylayout = new Layout("My Layout");
		mylayout.setVisible(true);
	
	}

}
