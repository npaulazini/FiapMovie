import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class Escrita extends JLabel {
	
	
	private static final long serialVersionUID = 1L;
	
	private int size = 14;
	private Color cor = new Color(0, 0, 0);

	public Escrita(String texto) {
		super(texto);
		init();
	}

	
	public Escrita(String texto, Color cor) {
		super();
		this.cor = cor;
		init();
	}
	
	private void init() {
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setForeground(cor);
		this.setFont(new Font(null, Font.BOLD, size));
	}

}
