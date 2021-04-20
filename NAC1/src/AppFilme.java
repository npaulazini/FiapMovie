import java.awt.BorderLayout;

import java.awt.Dimension;

import java.awt.GridLayout;


import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;





public class AppFilme {
	
	public static void main (String[] args) {
		JFrame frame = new JFrame("FIAP Movies");
		
		JPanel painel = new JPanel(new BorderLayout(20,0));
		JPanel img = new JPanel();
		JPanel infor = new JPanel(new GridLayout(0,1));
		JPanel opt = new JPanel(new GridLayout(0,1));
		opt.setPreferredSize(new Dimension(120,400));
		JPanel botao = new JPanel();
		
		painel.add(img, BorderLayout.WEST);
		painel.add(infor, BorderLayout.CENTER);
		painel.add(opt, BorderLayout.EAST);
		painel.add(botao,BorderLayout.SOUTH);
		
		
		img.add(new labImg(new ImageIcon("src/logofiap.png")));
		
		
		//Titulo
		infor.add(new Escrita("Titulo: "));
		infor.add(new MeuTextField());
		
		//Sinopse
		infor.add(new Escrita("Sinopse: "));
		infor.add(new MeuTextField());

		//Genero
		infor.add(new Escrita("Gênero: "));
		
	
		String[] genero = {"Terror", "Infantíl", "Ação","Drama","Aventura"};
		infor.add(new JComboBox<String>(genero));
		
		opt.add(new Escrita("Onde assistir "));
		
		
		JRadioButton netflix = new JRadioButton("Netflix");
		JRadioButton primeVideo = new JRadioButton("Prime Video");
		JRadioButton disney = new JRadioButton("Disney +");
		ButtonGroup ondeAssistir = new ButtonGroup(); 
		ondeAssistir.add(netflix);
		ondeAssistir.add(primeVideo);
		ondeAssistir.add(disney);
		
		opt.add(netflix);
		opt.add(primeVideo);
		opt.add(disney);
		
		opt.add(new JCheckBox("Assistido"));
		
		opt.add(new StarRater(5));
		
		JButton salv = new JButton("Salvar");
		JButton cancela = new JButton("Cancelar");
		botao.add(salv);
		botao.add(cancela);
		
		
		
		
		
		
		JTabbedPane abas = new JTabbedPane();
		abas.add("Cadastro", painel);
		abas.add("Lista", new JPanel());
		
		frame.add(abas);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000,500);
		frame.setVisible(true);
		
		
		
		
		 
		
		
	}		 


}


