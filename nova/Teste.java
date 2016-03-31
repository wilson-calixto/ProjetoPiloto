import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new Conta();
		ArrayList<Conta> array = new ArrayList<Conta>();
		conta.setTipo("luz");
		conta.setValor(100.0);
		conta.setStatus("pago");
		conta.setCodigo("123");
		array.add(conta);
		String opcao;
		String contas = "";
		do {
			opcao = JOptionPane.showInputDialog(null, "Digite a opcao:\n1 - Cadastrar\n2 - Fazerconsulta\n3 - Quitar conta\n4 - Listar contas\n5 - Listar contas de determinado tipo\n - Para sair");
			if(opcao.equals("4")){
				for(int i = 0; i < array.size(); i++){
					contas += String.format("%s %f %s %s%n", array.get(i).getTipo(), array.get(i).getValor(), array.get(i).getStatus(), array.get(i).getCodigo());
				}
				JOptionPane.showMessageDialog(null, contas);
			}
			
			if(opcao.equals("5")){
				String tipo;
				tipo = JOptionPane.showInputDialog(null, "Digite o tipo da conta");
				for(int i = 0; i < contas.size(); i++){
					
					if(array.get(i).getTipo().equals(tipo)){
						contasStr += String.format("%s %f %s %s%n", array.get(i).getTipo(), array.get(i).getValor(), array.get(i).getStatus(), array.get(i).getCodigo());
					}
				}
				JOptionPane.showMessageDialog(null, contasStr);
			}
			
		} while(opcao.equals("s"));
	}

}