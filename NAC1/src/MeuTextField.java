

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class MeuTextField extends JTextField {

	private static final long serialVersionUID = 1L;
	
	public MeuTextField() {
		super();
		init();
	}

	private void init() {
		this.setPreferredSize(new Dimension(150,20));
		this.setBorder(new LineBorder(Color.BLACK));
		this.setBackground(Color.WHITE);
		
		
		
	}

}
