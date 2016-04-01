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
				for(int i = 0; i < contas.size(); i++){
					if(contas.get(i).getStatus().equals("a pagar"))
						contasStr += String.format("%s %f %s %s%n", contas.get(i).getTipo(), contas.get(i).getValor(), contas.get(i).getStatus(), contas.get(i).getCodigo());
				}
				JOptionPane.showMessageDialog(null, contasStr);
			}
			
			if(opcao.equals("5")){
				String tipo;
				tipo = JOptionPane.showInputDialog(null, "Digite o tipo da conta");
				for(int i = 0; i < contas.size(); i++){
					
				if(contas.get(i).getTipo().equals(tipo) && contas.get(i).getStatus().equals("a pagar")){
						contasStr += String.format("%s %f %s %s%n", contas.get(i).getTipo(), contas.get(i).getValor(), contas.get(i).getStatus(), contas.get(i).getCodigo());
					}
				}
				JOptionPane.showMessageDialog(null, contasStr);
			}
			
		} while(!opcao.equals("s"));
	}

}