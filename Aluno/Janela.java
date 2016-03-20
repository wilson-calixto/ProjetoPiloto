import java.awt.*;
import javax.swing.*;

public class Janela extends JFrame {

	private JButton button;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;

	public Janela() {

		super( "Projeto Piloto" ); 
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(3, 3, 3, 3);
		gbc.gridy = 0; 
	    	gbc.gridx = 0; 
	    	gbc.gridwidth = 2;
	    	gbc.anchor = GridBagConstraints.WEST;
		label1 = new JLabel();
		label1.setText( "Nome" );
		add( label1, gbc );
		gbc.gridy = 0; 
	    	gbc.gridx = 2; 
	    	gbc.gridwidth = 1;
		textField1 = new JTextField(30);
		add( textField1, gbc );
		gbc.gridy = 1;
	    	gbc.gridx = 0;
		label2 = new JLabel();
		label2.setText( "Matrícula" );
		add( label2, gbc );
		gbc.gridy = 1;
	    	gbc.gridx = 2;
		textField2 = new JTextField(30);
		add( textField2, gbc );
		gbc.gridy = 2;
	    	gbc.gridx = 0;
		label3 = new JLabel();
		label3.setText( "Atividade" );
		add( label3, gbc );
		gbc.gridy = 2;
	    	gbc.gridx = 2;
		textField3 = new JTextField(30);
		add( textField3, gbc );
		gbc.gridy = 3;
	    	gbc.gridx = 2;
		button = new JButton( "Cadastrar" );
		add( button, gbc );
	}
}

	
