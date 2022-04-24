package gerenciaLocatario;

public class PessoaJuridica extends Locatario {
	String cnpj;

//	PessoaFisica[] funcionarios = new PessoaFisica[0];

	public PessoaJuridica(String nome,String email, String celular, String cnpj) {
		this.nome = nome;
		this.email = email;
		this.celular = celular;
		this.cnpj = cnpj;
	}

//	public static void cadastrarFuncionario(PessoaFisica pf) {
//		// Falta implementar.
//	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
