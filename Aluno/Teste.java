import javax.swing.JFrame;

public class Teste {
	public static void main (String[] args) {

		Janela janela = new Janela();
		janela.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		janela.setSize (500, 300);
		janela.setVisible (true);

		//ConexaoDB conexao1 = new ConexaoDB ("alunos", "root", "banco123");

	}
}
		
/*



package monitoria;

import javax.swing.JOptionPane;



public class MonitoriaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno[] turma=new Aluno[2];
		
		
		
		
		for(int i=0;i<turma.length;i++)
		{
					Aluno aluno = new Aluno();
					String nome = JOptionPane.showInputDialog("digite o nome ");
					aluno.insereNome(nome);
					String matricula = JOptionPane.showInputDialog("digite o matricula ");
					int m = Integer.parseInt(matricula);
					
					aluno.insereMatricula(m);
					turma[i]=aluno;
			
		}
		
		String listaDealunos="-----------Lista de alunos------------\n";
		
		for(int i =0; i<turma.length;i++ ){
			listaDealunos+="Nome do aluno:   "+
			turma[i].getNome()+"\n"+"matricula do aluno:   "+
			turma[i].getMatricula()+"\n";
			
			System.out.println("Obrigado pela comtribuicao "+turma[i].matricula+ " volte sempre ");
			
		}
		JOptionPane.showMessageDialog(null,listaDealunos);
		
		
		

	}

}






*/
/*

package monitoria;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class MonitoriaPrincipal {



public static void menu(int numero) {
	
	
	
}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Aluno> turma=new ArrayList<Aluno>();
		String opcao;
		
		
		
		do
		{
					Aluno aluno = new Aluno();
					String nome = JOptionPane.showInputDialog("digite o nome ");
					aluno.insereNome(nome);
					String matricula = JOptionPane.showInputDialog("digite o matricula ");
					int m = Integer.parseInt(matricula);
					
					aluno.insereMatricula(m);
					turma.add(aluno);
					opcao=JOptionPane.showInputDialog("\nDeseja continuar ??\n");
		}while(!opcao.equals("nao"));
		
		String listaDealunos="-----------Lista de alunos------------\n";
		
		for(int i =0; i<turma.size();i++ ){
			listaDealunos+="Nome do aluno:   "+
			turma.get(i).getNome()+"\n"+"matricula do aluno:   "+
			turma.get(i).getMatricula()+"\n";
			
			System.out.println("Obrigado pela comtribuicao "+turma.get(i).getNome()+ " volte sempre ");
			
		}
		JOptionPane.showMessageDialog(null,listaDealunos);
		
		
		

	}

}



*/