import java.util.*;
package monitoria;

public class MonitoriaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in );
		
		Aluno aluno1=new Aluno();
		aluno1.nome="primeiro";
		System.out.println("digite o seu nome ");
		
		System.out.println("digite a sua matricula ");
		aluno1.matricula = sc.nextInt();
		System.out.println("digite a sua atividade ");
		System.out.println("Obrigado pela comtribuicao "+aluno1.matricula+ " volte sempre ");
	}

}

//comentando
