package gerenciaLocatario;

import javax.swing.JOptionPane;
import java.util.LinkedList;
import java.util.List;

public class Locatario {
	String nome;
	String email;
	String celular;
	Endereco endereco;
	static List<Locatario> cadastroLocatario = new LinkedList<Locatario>();
	
	//-------------------------------------------------------------------------------------------
	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getCelular() {
		return celular;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	//---------------------------------------------------------------------------------------------
	
	public boolean cadastrarLocatario(Locatario locat) {
		boolean adicionado = cadastroLocatario.add(locat);
		return adicionado;
	}
	
	public boolean removerLocatario(Locatario locat) {
		boolean excluido = cadastroLocatario.remove(locat);
		return excluido;
	}

	public String imprimirLocatario() {
		String resposta = "";
		for (Locatario l : cadastroLocatario) {
			resposta += l.getNome() + '\n';
		}
		return resposta;
	}

	public void alterarLocatario() {
		Locatario l = pesquisarLocatario();
		if (l instanceof PessoaFisica) {
			PessoaFisica pf = (PessoaFisica) l;
			String strEscolha = JOptionPane.showInputDialog("Digite:\n" 
					+ "1 - Para alterar nome: \n"
					+ "2 - Para alterar email: \n"
					+ "3 - Para alterar celular \n"
					+ "4 - Para alterar cidade: \n"
					+ "5 - Para alterar estado: \n"
					+ "6 - Para alterar rua: \n"
					+ "7 - Para alterar numero: \n"
					+ "8 - Para alterar complemento: \n"
					+ "9 - Para alterar estado civil: \n"
					+ "10 - Para alterar cpf \n");
				
			int escolha = Integer.parseInt(strEscolha);
			if (escolha == 1) {
				String nomeMod = JOptionPane.showInputDialog("Digite o novo valor de nome: ");
				l.setNome(nomeMod);
				JOptionPane.showMessageDialog(null, "nome alterado com sucesso!");
			}
		}
	}

	public static Locatario pesquisarLocatario() {
		String strEscolha = JOptionPane.showInputDialog("Digite:\n" 
				+ "1 - Para pesquisar pessoa física ou\n"
				+ "2 - Para pesquisar pessoa jurídica");
		int escolha = Integer.parseInt(strEscolha);

		if (escolha == 1) {

			String nome = JOptionPane.showInputDialog("Digite o nome do locatario: ");
			String cpf = JOptionPane.showInputDialog("Digte o CPF do locatario: ");

			for (Locatario l : cadastroLocatario) {
				if (l instanceof PessoaFisica) {
					PessoaFisica pf = (PessoaFisica) l; 
					if (l.getNome().equals(nome) && pf.getCpf().equals(cpf)) {
						JOptionPane.showMessageDialog(null, "locatario encontrado!");
						return l;
					}
				}
			}	
		} else if (escolha == 2) {
			String cnpj = JOptionPane.showInputDialog("Digite o CNPJ do locatario: ");
			String email = JOptionPane.showInputDialog("Digte o E-Mail do locatario: ");

			for (Locatario l : cadastroLocatario) {
				if (l instanceof PessoaJuridica) {
					PessoaJuridica pjs = (PessoaJuridica) l;
					if (l.getEmail().equals(email) && pjs.getCnpj().equals(cnpj)) {
						JOptionPane.showMessageDialog(null, "locatario encontrado!");
						return l;
					}
				}
			}
		} 
		JOptionPane.showMessageDialog(null, "locatario não encontrado!");
		return null;
	}
	
}

