package gerenciaFrota;

import java.util.LinkedList;
import java.util.List;

import gerenciaLocatario.CampoEmBrancoException;
import gerenciaLocatario.ObjetoNaoEncontradoException;

import javax.swing.JOptionPane;

public class Veiculos {
	String marca,
	modelo,
	anoFabricacao,
	anoModelo,
	renavam;
	float capacidadeTanque;
	Diaria diaria;
	static List<Veiculos> cadastroVeiculos = new LinkedList<Veiculos>();

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getAnoFabricacao() {
		return anoFabricacao;
	}

	public String getAnoModelo() {
		return anoModelo;
	}

	public String getRenavam() {
		return renavam;
	}

	public float getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public void setCapacidadeTanque(float capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	public void setDiaria(Diaria diaria) {
		this.diaria = diaria;
	}

	public static void cadastrarMotocicleta() {
		String marca = JOptionPane.showInputDialog("Marca: ");
		if (marca.equals("")) {
			throw new CampoEmBrancoException ("Campo em Branco");
		}
		String modelo = JOptionPane.showInputDialog("Modelo: ");
		if (modelo.equals("")) {
			throw new CampoEmBrancoException ("Campo em Branco");
		}
		String anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
		String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
		String renavam = JOptionPane.showInputDialog("Renavam: ");
		if (renavam.equals("")) {
			throw new CampoEmBrancoException ("Campo em Branco");
		}
		String strCapacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque de combustivel: ");
		float capacidadeTanque = Float.parseFloat(strCapacidadeTanque);
		String strFreiosAbs = JOptionPane.showInputDialog("Possui freios Abs? ");
		boolean freiosAbs = Boolean.parseBoolean(strFreiosAbs);
		String strControleTracao = JOptionPane.showInputDialog("Possui controle de tracao? ");
		boolean controleTracao = Boolean.parseBoolean(strControleTracao);
		String strPilotoAutomatico = JOptionPane.showInputDialog("Possui piloto automatico? ");
		boolean pilotoAutomatico = Boolean.parseBoolean(strPilotoAutomatico);
		String modoPilotagem = JOptionPane.showInputDialog("Modo de pilotagem: ");
		String strDiariaNormal = JOptionPane.showInputDialog("Valor da diaria normal: ");
		float diariaNormal = Float.parseFloat(strDiariaNormal);
		String strDiariaReduzida = JOptionPane.showInputDialog("Valor da diaria reduzida: ");
		float diariaReduzida = Float.parseFloat(strDiariaReduzida);
		String strDiariaEmpresarial = JOptionPane.showInputDialog("Valor da diaria empresarial: ");
		float diariaEmpresarial = Float.parseFloat(strDiariaEmpresarial);
		String strValorMensal = JOptionPane.showInputDialog("Valor mensal: ");
		float valorMensal = Float.parseFloat(strValorMensal);
		Motocicletas moto = new Motocicletas(marca, modelo, anoFabricacao, anoModelo,
				renavam, capacidadeTanque, freiosAbs, controleTracao, pilotoAutomatico, modoPilotagem); 
		moto.setDiaria(new Diaria(diariaNormal, diariaReduzida, diariaEmpresarial, valorMensal));
		cadastrarVeiculo(moto);
	}

	public static void cadastrarVeiculosPassageiros() {
		String marca = JOptionPane.showInputDialog("Marca: ");
		if (marca.equals("")) {
			throw new CampoEmBrancoException ("Campo em Branco");
		}
		String modelo = JOptionPane.showInputDialog("Modelo: ");
		if (modelo.equals("")) {
			throw new CampoEmBrancoException ("Campo em Branco");
		}
		String anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
		String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
		String renavam = JOptionPane.showInputDialog("Renavam: ");
		if (renavam.equals("")) {
			throw new CampoEmBrancoException ("Campo em Branco");
		}
		String strCapacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque de combustivel: ");
		float capacidadeTanque = Float.parseFloat(strCapacidadeTanque);
		String strArCondicionado = JOptionPane.showInputDialog("Possui ar-condicionado? ");
		boolean arCondicionado = Boolean.parseBoolean(strArCondicionado);
		String strDirecaoHidraulica = JOptionPane.showInputDialog("Possui direcao hidraulica? ");
		boolean direcaoHidraulica = Boolean.parseBoolean(strDirecaoHidraulica);
		String strTv = JOptionPane.showInputDialog("Pssui tv? ");
		boolean tv = Boolean.parseBoolean(strTv);
		String strDiariaNormal = JOptionPane.showInputDialog("Valor da diaria normal: ");
		float diariaNormal = Float.parseFloat(strDiariaNormal);
		String strDiariaReduzida = JOptionPane.showInputDialog("Valor da diaria reduzida: ");
		float diariaReduzida = Float.parseFloat(strDiariaReduzida);
		String strDiariaEmpresarial = JOptionPane.showInputDialog("Valor da diaria empresarial: ");
		float diariaEmpresarial = Float.parseFloat(strDiariaEmpresarial);
		String strValorMensal = JOptionPane.showInputDialog("Valor mensal: ");
		float valorMensal = Float.parseFloat(strValorMensal);
		VeiculosPassageiros veicPas = new VeiculosPassageiros(marca, modelo, anoFabricacao, anoModelo, renavam,
				capacidadeTanque, arCondicionado, direcaoHidraulica, tv);
		veicPas.setDiaria(new Diaria(diariaNormal, diariaReduzida, diariaEmpresarial, valorMensal));
		cadastrarVeiculo(veicPas);
	}

	public static void cadastrarVeiculosCarga() {
		String marca = JOptionPane.showInputDialog("Marca: ");
		if (marca.equals("")) {
			throw new CampoEmBrancoException ("Campo em Branco");
		}
		String modelo = JOptionPane.showInputDialog("Modelo: ");
		if (modelo.equals("")) {
			throw new CampoEmBrancoException ("Campo em Branco");
		}
		String anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
		String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
		String renavam = JOptionPane.showInputDialog("Renavam: ");
		if (renavam.equals("")) {
			throw new CampoEmBrancoException ("Campo em Branco");
		}
		String strCapacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque de combustivel: ");
		float capacidadeTanque = Float.parseFloat(strCapacidadeTanque);
		String strTaraVeiculo = JOptionPane.showInputDialog("Tara do veiculo: ");
		float taraVeiculo = Float.parseFloat(strTaraVeiculo);
		String strTamCompartimento = JOptionPane.showInputDialog("Tamanho do compartimento de carga: ");
		float tamCompartimento = Float.parseFloat(strTamCompartimento);
		String tipoCompartimento = JOptionPane.showInputDialog("Tipo do compartimento: ");
		String strDiariaNormal = JOptionPane.showInputDialog("Valor da diaria normal: ");
		float diariaNormal = Float.parseFloat(strDiariaNormal);
		String strDiariaReduzida = JOptionPane.showInputDialog("Valor da diaria reduzida: ");
		float diariaReduzida = Float.parseFloat(strDiariaReduzida);
		String strDiariaEmpresarial = JOptionPane.showInputDialog("Valor da diaria empresarial: ");
		float diariaEmpresarial = Float.parseFloat(strDiariaEmpresarial);
		String strValorMensal = JOptionPane.showInputDialog("Valor mensal: ");
		float valorMensal = Float.parseFloat(strValorMensal);
		VeiculosCarga veicCar = new VeiculosCarga(marca, modelo, anoFabricacao,
				anoModelo, renavam, capacidadeTanque,
				taraVeiculo, tamCompartimento, tipoCompartimento);
		veicCar.setDiaria(new Diaria(diariaNormal, diariaReduzida, diariaEmpresarial, valorMensal));
		cadastrarVeiculo(veicCar);
	}

	public static void cadastrarCompactoLuxo() {
		String marca = JOptionPane.showInputDialog("Marca: ");
		if (marca.equals("")) {
			throw new CampoEmBrancoException ("Campo em Branco");
		}
		String modelo = JOptionPane.showInputDialog("Modelo: ");
		if (modelo.equals("")) {
			throw new CampoEmBrancoException ("Campo em Branco");
		}
		String anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
		String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
		String renavam = JOptionPane.showInputDialog("Renavam: ");
		if (renavam.equals("")) {
			throw new CampoEmBrancoException ("Campo em Branco");
		}
		String strCapacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque de combustivel: ");
		float capacidadeTanque = Float.parseFloat(strCapacidadeTanque);
		String strArCondicionado = JOptionPane.showInputDialog("Possui ar-condicionado? ");
		boolean arCondicionado = Boolean.parseBoolean(strArCondicionado); 
		String strDirecaoHidraulica = JOptionPane.showInputDialog("Possui direcao hidraulica? ");
		boolean direcaoHidraulica = Boolean.parseBoolean(strDirecaoHidraulica);
		String strCambioAutomatico = JOptionPane.showInputDialog("Possui cambio automatico? ");
		boolean cambioAutomatico = Boolean.parseBoolean(strCambioAutomatico);
		String strDiariaNormal = JOptionPane.showInputDialog("Valor da diaria normal: ");
		float diariaNormal = Float.parseFloat(strDiariaNormal);

		String strDiariaReduzida = JOptionPane.showInputDialog("Valor da diaria reduzida: ");
		float diariaReduzida = Float.parseFloat(strDiariaReduzida);

		String strDiariaEmpresarial = JOptionPane.showInputDialog("Valor da diaria empresarial: ");
		float diariaEmpresarial = Float.parseFloat(strDiariaEmpresarial);

		String strValorMensal = JOptionPane.showInputDialog("Valor mensal: ");
		float valorMensal = Float.parseFloat(strValorMensal);

		CompactoLuxo compLuxo = new CompactoLuxo(marca, modelo, anoFabricacao,
				anoModelo, renavam, capacidadeTanque, arCondicionado, direcaoHidraulica, cambioAutomatico);

		compLuxo.setDiaria(new Diaria(diariaNormal, diariaReduzida, diariaEmpresarial, valorMensal));
		cadastrarVeiculo(compLuxo);
	}

	public static void cadastrarCompacto() {
		String marca = JOptionPane.showInputDialog("Marca: ");
		if (marca.equals("")) {
			throw new CampoEmBrancoException ("Campo em Branco");
		}
		String modelo = JOptionPane.showInputDialog("Modelo: ");
		if (modelo.equals("")) {
			throw new CampoEmBrancoException ("Campo em Branco");
		}
		String anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
		String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
		String renavam = JOptionPane.showInputDialog("Renavam: ");
		if (renavam.equals("")) {
			throw new CampoEmBrancoException ("Campo em Branco");
		}
		String strCapacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque de combustivel: ");
		float capacidadeTanque = Float.parseFloat(strCapacidadeTanque);
		String strArCondicionado = JOptionPane.showInputDialog("Possui ar-condicionado? ");
		boolean arCondicionado = Boolean.parseBoolean(strArCondicionado);
		String strDirecaoHidraulica = JOptionPane.showInputDialog("Possui direcao hidraulica? ");
		boolean direcaoHidraulica = Boolean.parseBoolean(strDirecaoHidraulica);
		String strCambioAutomatico = JOptionPane.showInputDialog("Possui cambio Automatico? ");
		boolean cambioAutomatico = Boolean.parseBoolean(strCambioAutomatico);
		String strDiariaNormal = JOptionPane.showInputDialog("Valor da diaria normal: ");
		float diariaNormal = Float.parseFloat(strDiariaNormal);
		String strDiariaReduzida = JOptionPane.showInputDialog("Valor da diaria reduzida: ");
		float diariaReduzida = Float.parseFloat(strDiariaReduzida);
		String strDiariaEmpresarial = JOptionPane.showInputDialog("Valor da diaria empresarial: ");
		float diariaEmpresarial = Float.parseFloat(strDiariaEmpresarial);
		String strValorMensal = JOptionPane.showInputDialog("Valor mensal: ");
		float valorMensal = Float.parseFloat(strValorMensal);	
		Compacto comp = new Compacto(marca, modelo, anoFabricacao, anoModelo,
				renavam, capacidadeTanque, arCondicionado, direcaoHidraulica, cambioAutomatico);

		comp.setDiaria(new Diaria(diariaNormal, diariaReduzida, diariaEmpresarial, valorMensal));
		cadastrarVeiculo(comp);
	}

	public static void cadastrarSuvs() {
		String marca = JOptionPane.showInputDialog("Marca: ");
		if (marca.equals("")) {
			throw new CampoEmBrancoException ("Campo em Branco");
		}
		String modelo = JOptionPane.showInputDialog("Modelo: ");
		if (modelo.equals("")) {
			throw new CampoEmBrancoException ("Campo em Branco");
		}
		String anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
		String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
		String renavam = JOptionPane.showInputDialog("Renavam: ");
		if (renavam.equals("")) {
			throw new CampoEmBrancoException ("Campo em Branco");
		}
		String strCapacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque de combustivel: ");
		float capacidadeTanque = Float.parseFloat(strCapacidadeTanque);
		String strArCondicionado = JOptionPane.showInputDialog("Possui ar-condicionado? ");
		boolean arCondicionado = Boolean.parseBoolean(strArCondicionado);
		
		String strDirecaoHidraulica = JOptionPane.showInputDialog("Possui direcao hidraulica? ");
		boolean direcaoHidraulica = Boolean.parseBoolean(strDirecaoHidraulica);
		String strCambioAutomatico = JOptionPane.showInputDialog("Possui cambio Automatico? ");
		boolean cambioAutomatico = Boolean.parseBoolean(strCambioAutomatico);
		String strDiariaNormal = JOptionPane.showInputDialog("Valor da diaria normal: ");
		float diariaNormal = Float.parseFloat(strDiariaNormal);

		String strDiariaReduzida = JOptionPane.showInputDialog("Valor da diaria reduzida: ");
		float diariaReduzida = Float.parseFloat(strDiariaReduzida);

		String strDiariaEmpresarial = JOptionPane.showInputDialog("Valor da diaria empresarial: ");
		float diariaEmpresarial = Float.parseFloat(strDiariaEmpresarial);

		String strValorMensal = JOptionPane.showInputDialog("Valor mensal: ");
		float valorMensal = Float.parseFloat(strValorMensal);

		Suvs suv = new Suvs(marca, modelo, anoFabricacao, anoModelo, renavam,
				capacidadeTanque, arCondicionado, direcaoHidraulica, cambioAutomatico);

		suv.setDiaria(new Diaria(diariaNormal, diariaReduzida, diariaEmpresarial, valorMensal));
		cadastrarVeiculo(suv);
	}

	public static void cadastrarSedan() {
		String marca = JOptionPane.showInputDialog("Marca: ");
		if (marca.equals("")) {
			throw new CampoEmBrancoException ("Campo em Branco");
		}
		String modelo = JOptionPane.showInputDialog("Modelo: ");
		if (modelo.equals("")) {
			throw new CampoEmBrancoException ("Campo em Branco");
		}
		String anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
		String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
		String renavam = JOptionPane.showInputDialog("Renavam: ");
		if (renavam.equals("")) {
			throw new CampoEmBrancoException ("Campo em Branco");
		}
		String strCapacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque de combustivel: ");
		float capacidadeTanque = Float.parseFloat(strCapacidadeTanque);		 
		String strArCondicionado = JOptionPane.showInputDialog("Possui ar-condicionado? ");
		boolean arCondicionado = Boolean.parseBoolean(strArCondicionado);
		String strDirecaoHidraulica = JOptionPane.showInputDialog("Possui direcao hidraulica? ");
		boolean direcaoHidraulica = Boolean.parseBoolean(strDirecaoHidraulica);
		String strCambioAutomatico = JOptionPane.showInputDialog("Possui cambio Automatico? ");
		boolean cambioAutomatico = Boolean.parseBoolean(strCambioAutomatico);
		String strDiariaNormal = JOptionPane.showInputDialog("Valor da diaria normal: ");
		float diariaNormal = Float.parseFloat(strDiariaNormal);
		String strDiariaReduzida = JOptionPane.showInputDialog("Valor da diaria reduzida: ");
		float diariaReduzida = Float.parseFloat(strDiariaReduzida);
		String strDiariaEmpresarial = JOptionPane.showInputDialog("Valor da diaria empresarial: ");
		float diariaEmpresarial = Float.parseFloat(strDiariaEmpresarial);
		String strValorMensal = JOptionPane.showInputDialog("Valor mensal: ");
		float valorMensal = Float.parseFloat(strValorMensal);
		Sedan sed = new Sedan(marca, modelo, anoFabricacao, anoModelo, renavam,
				capacidadeTanque, arCondicionado, direcaoHidraulica, cambioAutomatico);
		sed.setDiaria(new Diaria(diariaNormal, diariaReduzida, diariaEmpresarial, valorMensal));
		cadastrarVeiculo(sed);
	}

	public String imprimirVeiculos() {
		String resposta = "";
		for (Veiculos v : cadastroVeiculos) {
			resposta += v.getRenavam() + '\n';
		}
		return resposta;
	}

	public void alterarVeiculos() {
		Veiculos v = pesquisarVeiculosRenavam();
		String strEscolha = JOptionPane.showInputDialog("Digite: \n"
				+ "1 - Para alterar marca: \n"
				+ "2 - Para alterar modelo: \n"
				+ "3 - Para alterar o ano de fabricacao: \n"
				+ "4 - Para alterar ano do modelo: \n"
				+ "5 - Para alterar o RENAVAM: \n"
				+ "6 - Para alterar a capacidade do tanque: \n"
				+ "7 - Para alterar o valor da diaria normal: \n"
				+ "8 - Para alterar o valor da diaria reduzida: \n"
				+ "9 - Para alterar o valor da diaria empresarial: \n"
				+ "10 - Para alterar o vlaor mensal: ");
		int escolha = Integer.parseInt(strEscolha);
		if (escolha == 1) {
			String marcaMod = JOptionPane.showInputDialog("Digite o novo valor de marca: ");
			v.setMarca(marcaMod);
			JOptionPane.showMessageDialog(null, "marca alterada com sucesso!");
		}
		if (escolha == 2) {
			String modeloMod = JOptionPane.showInputDialog("Digite o novo valor de modelo: ");
			v.setMarca(modeloMod);
			JOptionPane.showMessageDialog(null, "modelo alterado com sucesso!");
		}
		if (escolha == 3) {
			String anoFabricacaoMod = JOptionPane.showInputDialog("Digite o novo valor do ano de fabricacao: ");
			v.setMarca(anoFabricacaoMod);
			JOptionPane.showMessageDialog(null, "ano de fabricacao alterado com sucesso!");
		}
		if (escolha == 4) {
			String anoModeloMod = JOptionPane.showInputDialog("Digite o novo valor do ano do modelo: ");
			v.setMarca(anoModeloMod);
			JOptionPane.showMessageDialog(null, "ano de modelo alterado com sucesso!");
		}
		if (escolha == 5) {
			String renavamMod = JOptionPane.showInputDialog("Digite o novo valor de Renavam: ");
			v.setMarca(renavamMod);
			JOptionPane.showMessageDialog(null, "renavam alterado com sucesso!");
		}
		if (escolha == 6) {
			String strCapacidadeTanqueMod = JOptionPane.showInputDialog("Digite o novo valor da capacidade do tanque: ");
			float capacidadeTanqueMod = Float.parseFloat(strCapacidadeTanqueMod);
			v.setCapacidadeTanque(capacidadeTanqueMod);
			JOptionPane.showMessageDialog(null, "capacidade do tanque alterada com sucesso!");
		}
		if (escolha == 7) {
			String strDiariaNormalMod = JOptionPane.showInputDialog("Digite o novo valor da diaria normal: ");
			float diariaNormalMod = Float.parseFloat(strDiariaNormalMod);
			v.diaria.setDiariaNormal(diariaNormalMod);
			JOptionPane.showMessageDialog(null, "diaria normal alterada com sucesso!");
		}
		if (escolha == 8) {
			String strDiariaReduzidaMod = JOptionPane.showInputDialog("Digite o novo valor da diaria reduzida: ");
			float diariaReduzidaMod = Float.parseFloat(strDiariaReduzidaMod);
			v.diaria.setDiariaReduzida(diariaReduzidaMod);
			JOptionPane.showMessageDialog(null, "diaria reduzida alterada com sucesso!");
		}
		if (escolha == 9) {
			String strDiariaEmpresarialMod = JOptionPane.showInputDialog("Digite o novo valor da diaria empresarial: ");
			float diariaEmpresarialMod = Float.parseFloat(strDiariaEmpresarialMod);
			v.diaria.setDiariaEmpresarial(diariaEmpresarialMod);
			JOptionPane.showMessageDialog(null, "diaria empresarial alterada com sucesso!");
		}
		if (escolha == 10) {
			String strValorMensalMod = JOptionPane.showInputDialog("Digite o novo valor do valor mensal: ");
			float valorMensalMod = Float.parseFloat(strValorMensalMod);
			v.diaria.setValorMensal(valorMensalMod);
			JOptionPane.showMessageDialog(null, "valor mensal alterado com sucesso!");
		}
	}

	private static void cadastrarVeiculo(Veiculos veic) {
		boolean adicionou = cadastroVeiculos.add(veic);
		if (adicionou)
			JOptionPane.showMessageDialog(null, "Veiculo cadastrado com sucesso!");
	}

	public void removerVeiculoCadastro() {
		boolean excluiu = false;
		Veiculos Excluir = pesquisarVeiculosRenavam();
		if (Excluir != null)
			excluiu = cadastroVeiculos.remove(Excluir);
		if (excluiu)
			JOptionPane.showMessageDialog(null, "Veiculo removido com sucesso!");
	}

	public static Veiculos pesquisarVeiculosRenavam() {
		String renavam = JOptionPane.showInputDialog("Digite o Renavam do veiculo: ");
		Veiculos veiculoPesquisado = null;
		for (Veiculos v : cadastroVeiculos) { 
			if (v.getRenavam().equals(renavam)) {
				JOptionPane.showMessageDialog(null, "Veiculo encontrado!");
				veiculoPesquisado = v;
			} 
		}
		try {
			if (veiculoPesquisado == null) {
				throw new ObjetoNaoEncontradoException("Objeto nao encontrado!");
			}
		} catch (ObjetoNaoEncontradoException ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
		}
		return veiculoPesquisado;
	}
}