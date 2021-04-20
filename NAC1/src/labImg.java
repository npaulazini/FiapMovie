
import java.awt.Dimension;


import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class labImg extends JLabel {
	
	
	private static final long serialVersionUID = 1L;
	

	public labImg(ImageIcon imageIcon) {
		super(imageIcon);
		init();
	}


	
	private void init() {
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setPreferredSize(new Dimension(250, 250));
		
	}

}
