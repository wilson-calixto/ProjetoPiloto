import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Janela extends JFrame {

	private JButton button;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField5;
	private JTextField textField6;
	private JTextField textField7;
	private JTextField textField8;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JPanel panel2;
	private JPanel panel3;

	public Janela() {

		super( "Projeto Piloto" );
		JTabbedPane tabbedPane = new JTabbedPane();
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);
		gbc.gridy = 0; 
	    gbc.gridx = 0; 
	    gbc.gridwidth = 2;
	    gbc.anchor = GridBagConstraints.WEST;
		label1 = new JLabel();
		label1.setText( "Nome" );
		panel1.add( label1, gbc );
		Handler handler = new Handler();
		gbc.gridy = 0; 
	    gbc.gridx = 2; 
	    gbc.gridwidth = 1;
		textField1 = new JTextField(30);
		textField1.addActionListener(handler);
		panel1.add( textField1, gbc );
		gbc.gridy = 1;
	    gbc.gridx = 0;
		label2 = new JLabel();
		label2.setText( "Matrícula" );
		panel1.add( label2, gbc );
		gbc.gridy = 1;
	    gbc.gridx = 2;
		textField2 = new JTextField(30);
		textField2.addActionListener(handler);
		panel1.add( textField2, gbc );
		gbc.gridy = 2;
	    gbc.gridx = 0;
		label3 = new JLabel();
		label3.setText( "Atividade" );
		panel1.add( label3, gbc );
		gbc.gridy = 2;
	    gbc.gridx = 2;
		textField3 = new JTextField(30);
		textField3.addActionListener(handler);
		panel1.add( textField3, gbc );
		gbc.gridy = 3;
	    gbc.gridx = 2;
		button = new JButton( "Cadastrar" );
		button.addActionListener(handler);
		panel1.add( button, gbc );
		tabbedPane.addTab("Cadastro", null, panel1);
		
		panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		textField4 = new JTextField(30);
		panel2.add(textField4);
		button2 = new JButton("Pesquisar");
		button2.addActionListener(handler);
		panel2.add(button2);
		label4 = new JLabel();
		panel2.add(label4);
		tabbedPane.addTab("Pesquisa", panel2);
		
		panel3 = new JPanel();
	    textField5 = new JTextField(30);
	    panel3.add(textField5);
	    button3 = new JButton("Deletar");
	    button3.addActionListener(handler);
	    panel3.add(button3);
	    tabbedPane.addTab("Alterações", panel3);
	    add(tabbedPane);
		
	}
	
	public class Handler implements ActionListener {
		
		ConexaoDB conexao = new ConexaoDB ();
		Aluno aluno = new Aluno();
		
		@Override
		public void actionPerformed(ActionEvent event) {
		
			if(event.getSource() == button) {
				aluno.insereNome(textField1.getText());
				aluno.insereMatricula(Integer.parseInt(textField2.getText()));
				aluno.insereAtividade(textField3.getText());
				conexao.insert(aluno.getNome(), aluno.getMatricula(), aluno.getAtividade());	
			}
			
			else if(event.getSource() == button2) {
				String result = conexao.select(Integer.parseInt(textField4.getText()));
				label4.setText(result);			
			}
			
			else if(event.getSource() == button3) {
				conexao.delete(Integer.parseInt(textField5.getText()));
			}
		}
	}
}