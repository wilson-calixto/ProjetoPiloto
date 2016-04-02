/*package monitoria;

public class Aluno {
	
	String nome;
	int matricula;
	String atividade;
	
	void insereNome(String NomeDoAluno){
		nome=NomeDoAluno;	
	}
	
	void insereMatricula(int NumeroDaMatricula){
		matricula=NumeroDaMatricula;
	}
	
	void insereAtividade(String AtividadeDoAluno){
		atividade=AtividadeDoAluno;
		
	}
}

*/

package monitoria;

public class Aluno {
	
	private String nome;
	private int matricula;
	private String atividade;
	
	void insereNome(String NomeDoAluno){
		nome=NomeDoAluno;	
	}
	
	void insereMatricula(int NumeroDaMatricula){
		matricula=NumeroDaMatricula;
	}
	
	void insereAtividade(String AtividadeDoAluno){
		atividade=AtividadeDoAluno;
	
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public String getAtividade() {
		return atividade;
	}
}
