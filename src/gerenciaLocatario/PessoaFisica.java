package gerenciaLocatario;

public class PessoaFisica extends Locatario {
	String estadoCivil;
	String cpf;
	
	public PessoaFisica(String nome, String email, String celular, String estadoCivil, String cpf) {
		this.nome = nome;
		this.email = email;
		this.celular = celular;
		this.estadoCivil = estadoCivil;
		this.cpf = cpf;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public String getCpf() {
		return cpf;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
