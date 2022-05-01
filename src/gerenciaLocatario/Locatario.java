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

	public static void cadastrarLocatario(Locatario locat) {
		boolean adicionou = cadastroLocatario.add(locat);
		if (adicionou)
			JOptionPane.showMessageDialog(null, "Locatario cadastrado com sucesso!");
	}

	public void removerLocatarioCadastro() {
		boolean excluiu = false;
		Locatario Excluir = pesquisarLocatario();
		if (Excluir != null)
			excluiu = cadastroLocatario.remove(Excluir);
		if (excluiu)
			JOptionPane.showMessageDialog(null, "Locatario removido com sucesso!");
	}

	public String imprimirLocatario() {
		String resposta = "";
		for (Locatario l : cadastroLocatario) {
			resposta += l.getNome() + '\n';
		}
		return resposta;
	}

	public static  void mostrarDadosLocatario() {
		Locatario l = pesquisarLocatario();
		if (l != null) {
			JOptionPane.showMessageDialog(null, "Os dados do locatario pesquisado são: \n" 
					+"Nome: " + l.getNome() + "\n"
					+ "Email: " + l.getEmail() + "\n"
					+ "Celular: " + l.getCelular() + "\n"
					//+ "Cidade: " +  l.endereco.getCidade()
					);
		}
	}

	public static void cadastrarPessoaFisica() {
		String nome = JOptionPane.showInputDialog("Nome: ");
		if (nome.equals("")) {
			throw new CampoEmBrancoException ("Campo em Branco");
		}
		String email = JOptionPane.showInputDialog("E-mail: ");
		String celular = JOptionPane.showInputDialog("Celular: ");
		String cpf = JOptionPane.showInputDialog("CPF: ");
		if (cpf.equals("")) {
			throw new CampoEmBrancoException ("Campo em Branco");
		}
		String estadoCivil = JOptionPane.showInputDialog("Estado Civil: ");
		String cidade = JOptionPane.showInputDialog("Cidade: ");
		String estado = JOptionPane.showInputDialog("Estado: ");
		String rua = JOptionPane.showInputDialog("Rua: ");
		String strNumero = JOptionPane.showInputDialog("Numero: ");
		int numero = Integer.parseInt(strNumero); 
		String complemento = JOptionPane.showInputDialog("Complemento: ");
		String bairro = JOptionPane.showInputDialog("Bairro: ");
		String cep = JOptionPane.showInputDialog("CEP: ");
		PessoaFisica pfs = new PessoaFisica(nome, email, celular, estadoCivil, cpf);
		pfs.setEndereco(new Endereco(cidade, estado, rua, numero, complemento, bairro, cep));
		cadastrarLocatario(pfs);
	}

	public void cadastrarPessoaJuridica() {
		String cnpj = JOptionPane.showInputDialog("CNPJ: ");
		if (cnpj.equals("")) {
			throw new CampoEmBrancoException ("Campo em Branco");
		}
		String nome = JOptionPane.showInputDialog("Nome da Empresa: ");
		String email = JOptionPane.showInputDialog("E-mail: ");
		if (email.equals("")) {
			throw new CampoEmBrancoException ("Campo em Branco");
		}
		String celular = JOptionPane.showInputDialog("Celular: ");
		PessoaJuridica pjs = new PessoaJuridica(nome, email, celular, cnpj);
		cadastrarLocatario(pjs);
	}

	public void alterarLocatario() {
		Locatario l = pesquisarLocatario();
		if (l != null && l instanceof PessoaFisica) {
			PessoaFisica pf = (PessoaFisica) l;
			String strEscolha = JOptionPane.showInputDialog("Digite: \n" 
					+ "1 - Para alterar nome: \n"
					+ "2 - Para alterar email: \n"
					+ "3 - Para alterar celular \n"
					+ "4 - Para alterar cidade: \n"
					+ "5 - Para alterar estado: \n"
					+ "6 - Para alterar rua: \n"
					+ "7 - Para alterar numero: \n"
					+ "8 - Para alterar complemento: \n"
					+ "9 - Para alterar estado civil: \n"
					+ "10 - Para alterar cpf:");

			int escolha = Integer.parseInt(strEscolha);
			if (escolha == 1) {
				String nomeMod = JOptionPane.showInputDialog("Digite o novo valor de nome: ");
				l.setNome(nomeMod);
				JOptionPane.showMessageDialog(null, "nome alterado com sucesso!");
			}
			if (escolha == 2) {
				String emailMod = JOptionPane.showInputDialog("Digite o novo valor de email: ");
				l.setEmail(emailMod);
				JOptionPane.showMessageDialog(null, "email alterado com sucesso!");
			}
			if (escolha == 3) {
				String celularMod = JOptionPane.showInputDialog("Digite o novo valor de celular: ");
				l.setCelular(celularMod);
				JOptionPane.showMessageDialog(null, "celular alterado com sucesso!");
			}
			if (escolha == 4) {
				String cidadeMod = JOptionPane.showInputDialog("Digite o novo valor de cidade: ");
				l.endereco.setCidade(cidadeMod);
				JOptionPane.showMessageDialog(null, "cidade alterada com sucesso!");
			}
			if (escolha == 5) {
				String estadoMod = JOptionPane.showInputDialog("Digite o novo valor de estado: ");
				l.endereco.setEstado(estadoMod);
				JOptionPane.showMessageDialog(null, "estado alterado com sucesso!");
			}
			if (escolha == 6) {
				String ruaMod = JOptionPane.showInputDialog("Digite o novo valor de rua: ");
				l.endereco.setRua(ruaMod);
				JOptionPane.showMessageDialog(null, "rua alterada com sucesso!");
			}
			if (escolha == 7) {
				String strNumeroMod = JOptionPane.showInputDialog("Digite o novo valor de numero: ");
				int numeroMod = Integer.parseInt(strNumeroMod);
				l.endereco.setNumero(numeroMod);
				JOptionPane.showMessageDialog(null, "numero alterado com sucesso!");
			}
			if (escolha == 8) {
				String complementoMod = JOptionPane.showInputDialog("Digite o novo valor de complemento: ");
				l.endereco.setComplemento(complementoMod);
				JOptionPane.showMessageDialog(null, "complemento alterado com sucesso!");
			}
			if (escolha == 9) {
				String estadoCivilMod = JOptionPane.showInputDialog("Digite o novo valor de estado civil: ");
				pf.setEstadoCivil(estadoCivilMod);
				JOptionPane.showMessageDialog(null, "estado civil alterado com sucesso!");
			}
			if (escolha == 10) {
				String cpfMod = JOptionPane.showInputDialog("Digite o novo valor de cpf: ");
				pf.setCpf(cpfMod);
				JOptionPane.showMessageDialog(null, "cpf alterado com sucesso!");
			}
		}
		if (l != null && l instanceof PessoaJuridica) {
			PessoaJuridica pj = (PessoaJuridica) l;
			String strEscolha = JOptionPane.showInputDialog("Digite:\n" 
					+ "1 - Para alterar nome: \n"
					+ "2 - Para alterar email: \n"
					+ "3 - Para alterar celular: \n"
					+ "4 - Para alterar cnpj:");
			int escolha = Integer.parseInt(strEscolha);
			if (escolha == 1) {
				String nomeMod = JOptionPane.showInputDialog("Digite o novo valor de nome: ");
				l.setNome(nomeMod);
				JOptionPane.showMessageDialog(null, "nome alterado com sucesso!");
			}
			if (escolha == 2) {
				String emailMod = JOptionPane.showInputDialog("Digite o novo valor de email: ");
				l.setEmail(emailMod);
				JOptionPane.showMessageDialog(null, "email alterado com sucesso!");
			}
			if (escolha == 3) {
				String celularMod = JOptionPane.showInputDialog("Digite o novo valor de celular: ");
				l.setCelular(celularMod);
				JOptionPane.showMessageDialog(null, "celular alterado com sucesso!");
			}
			if (escolha == 4) {
				String cnpjMod = JOptionPane.showInputDialog("Digite o novo valor de cnpj: ");
				pj.setCnpj(cnpjMod);
				JOptionPane.showMessageDialog(null, "cnpj alterado com sucesso!");
			}
		}
	}

	public static Locatario pesquisarLocatario() {
		String strEscolha = JOptionPane.showInputDialog("Digite:\n" 
				+ "1 - Para pesquisar pessoa física ou\n"
				+ "2 - Para pesquisar pessoa jurídica");
		int escolha = Integer.parseInt(strEscolha);
		Locatario locatarioPesquisado = null; 

		if (escolha == 1) {
			String nome = JOptionPane.showInputDialog("Digite o nome do locatario: ");
			String cpf = JOptionPane.showInputDialog("Digte o CPF do locatario: ");

			for (Locatario l : cadastroLocatario) {
				if (l instanceof PessoaFisica) {
					PessoaFisica pf = (PessoaFisica) l; 
					if (l.getNome().equals(nome) && pf.getCpf().equals(cpf)) {
						JOptionPane.showMessageDialog(null, "locatario encontrado!");
						locatarioPesquisado = l;
					} 
				} 
			}
		} else if (escolha == 2) {
			String cnpj = JOptionPane.showInputDialog("Digite o CNPJ do locatario: ");
			String email = JOptionPane.showInputDialog("Digite o E-Mail do locatario: ");

			for (Locatario l : cadastroLocatario) {
				if (l instanceof PessoaJuridica) {
					PessoaJuridica pjs = (PessoaJuridica) l;
					if (l.getEmail().equals(email) && pjs.getCnpj().equals(cnpj)) {
						JOptionPane.showMessageDialog(null, "locatario encontrado!");
						locatarioPesquisado = l;
					}
				}
			}
		} 
		try {
			if (locatarioPesquisado == null) {
				throw new ObjetoNaoEncontradoException("Objeto nao encontrado!");
			}
		} catch (ObjetoNaoEncontradoException ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
		}
		return locatarioPesquisado;
	}
}

