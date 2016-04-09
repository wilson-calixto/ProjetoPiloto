import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
//import javax.swing.JOptionPane;

public class ConexaoDB {
	
	final String driver = "com.mysql.jdbc.Driver";
	final String url = "jdbc:mysql://localhost:3306/alunos";
	String INSERT_QUERY = "INSERT INTO alunos(nome, matricula, atividade) VALUES(?, ?, ?)";
	String SELECT_QUERY = "SELECT * FROM alunos WHERE matricula = ";
	String UPDATE_QUERY1 = "UPDATE alunos SET nome = ? WHERE matricula =  ?";
	String UPDATE_QUERY2 = "UPDATE alunos SET atividade = ? WHERE matricula =  ?";
	String DELETE_QUERY = "DELETE FROM alunos WHERE matricula = ?";
	
	public void insert(String nome, int matricula, String atividade) {
		
		try (Connection conexao = DriverManager.getConnection (url, "root", "banco123");
			 PreparedStatement preparedStmt = conexao.prepareStatement(INSERT_QUERY)) {
			
		    preparedStmt.setString (1, nome);
		    preparedStmt.setInt(2, matricula);
		    preparedStmt.setString (3, atividade);
		    preparedStmt.execute();

        } catch (Exception ex) {
            	ex.printStackTrace();
        }
	}
	
	public String select(int matricula) {
		
		Aluno aluno = new Aluno();
		try (Connection conexao = DriverManager.getConnection (url, "root", "banco123");
			 Statement statement = conexao.createStatement();
			 ResultSet resultSet = statement.executeQuery(SELECT_QUERY+matricula)) {
			
			while (resultSet.next())
			{				
				aluno.insereNome(resultSet.getString("nome"));
				aluno.insereMatricula(resultSet.getInt("matricula"));
				aluno.insereAtividade(resultSet.getString("atividade"));
			}
			

        } catch (Exception ex) {
            	ex.printStackTrace();
        } 
		return String.format("Nome: %s    Matrícula: %d    Atividade: %s", aluno.getNome(), aluno.getMatricula(), aluno.getAtividade());
	}
	
	public void updateNome(int matricula, String nome) {
			
		try (Connection conexao = DriverManager.getConnection (url, "root", "banco123");
			 PreparedStatement preparedStmt = conexao.prepareStatement(UPDATE_QUERY1)) {
				
			preparedStmt.setString(1, nome);
			preparedStmt.setInt(2, matricula);
			preparedStmt.execute();

		} catch (Exception ex) {
			ex.printStackTrace();
	    }
	}
	
	public void updateAtividade(int matricula, String atividade) {
		
		try (Connection conexao = DriverManager.getConnection (url, "root", "banco123");
		     PreparedStatement preparedStmt = conexao.prepareStatement(UPDATE_QUERY2)) {
					
			preparedStmt.setString(1, atividade);
			preparedStmt.setInt(2, matricula);
			preparedStmt.execute();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void delete(int matricula) {
		
		try {
			Connection conexao = DriverManager.getConnection (url, "root", "banco123");
			PreparedStatement preparedStmt = conexao.prepareStatement(DELETE_QUERY);			
			preparedStmt.setInt(1, matricula);
			preparedStmt.execute();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}