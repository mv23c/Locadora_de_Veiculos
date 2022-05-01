package gerenciaFrota;

import java.util.LinkedList;
import java.util.List;

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

	private static void cadastrarVeiculo(Veiculos veic) {
		boolean adicionou = cadastroVeiculos.add(veic);
		if (adicionou)
			JOptionPane.showMessageDialog(null, "Veiculo cadastrado com sucesso!");
	}

	public static void removerVeiculoCadastro() {
		boolean excluiu = false;
		Veiculos Excluir = pesquisarVeiculosRenavam();
		if (Excluir != null)
			excluiu = cadastroVeiculos.remove(Excluir);
		if (excluiu)
			JOptionPane.showMessageDialog(null, "Veiculo removido com sucesso!");
	}

	public static void cadastrarMotocicleta() {
		String marca = JOptionPane.showInputDialog("Marca: ");
		String modelo = JOptionPane.showInputDialog("Modelo: ");
		String anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
		String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
		String renavam = JOptionPane.showInputDialog("Renavam: ");
		String strCapacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque de combustivel: ");
		float capacidadeTanque = Float.parseFloat(strCapacidadeTanque);
		String strFreiosAbs = JOptionPane.showInputDialog("Possui freios Abs? ");
		boolean freiosAbs = Boolean.parseBoolean(strFreiosAbs);
		String strControleTracao = JOptionPane.showInputDialog("Possui controle de tracao? ");
		boolean controleTracao = Boolean.parseBoolean(strControleTracao);
		String strPilotoAutomatico = JOptionPane.showInputDialog("Possui piloto automatico? ");
		boolean pilotoAutomatico = Boolean.parseBoolean(strPilotoAutomatico);
		String modoPilotagem = JOptionPane.showInputDialog("Modo de pilotagem: ");
		Motocicletas moto = new Motocicletas(marca, modelo, anoFabricacao, anoModelo,
				renavam, capacidadeTanque, freiosAbs, controleTracao, pilotoAutomatico, modoPilotagem);
		cadastrarVeiculo(moto);	 
	}

	public static void cadastrarVeiculosPassageiros() {
		String marca = JOptionPane.showInputDialog("Marca: ");
		String modelo = JOptionPane.showInputDialog("Modelo: ");
		String anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
		String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
		String renavam = JOptionPane.showInputDialog("Renavam: ");
		String strCapacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque de combustivel: ");
		float capacidadeTanque = Float.parseFloat(strCapacidadeTanque);
		//String numeroOcupantes = JOptionPane.showInputDialog("Numero de ocupantes: ");
		String strArCondicionado = JOptionPane.showInputDialog("Possui ar-condicionado? ");
		boolean arCondicionado = Boolean.parseBoolean(strArCondicionado);
		String strDirecaoHidraulica = JOptionPane.showInputDialog("Possui direcao hidraulica? ");
		boolean direcaoHidraulica = Boolean.parseBoolean(strDirecaoHidraulica);
		String strTv = JOptionPane.showInputDialog("Pssui tv? ");
		boolean tv = Boolean.parseBoolean(strTv);
		VeiculosPassageiros veicPas = new VeiculosPassageiros(marca, modelo, anoFabricacao, anoModelo, renavam,
				capacidadeTanque, arCondicionado, direcaoHidraulica, tv);
		cadastrarVeiculo(veicPas);
	}

	public static void cadastrarVeiculosCarga() {
		String marca = JOptionPane.showInputDialog("Marca: ");
		String modelo = JOptionPane.showInputDialog("Modelo: ");
		String anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
		String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
		String renavam = JOptionPane.showInputDialog("Renavam: ");
		String strCapacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque de combustivel: ");
		float capacidadeTanque = Float.parseFloat(strCapacidadeTanque);
		String strTaraVeiculo = JOptionPane.showInputDialog("Tara do veiculo: ");
		float taraVeiculo = Float.parseFloat(strTaraVeiculo);
		String strTamCompartimento = JOptionPane.showInputDialog("Tamanho do compartimento de carga: ");
		float tamCompartimento = Float.parseFloat(strTamCompartimento);
		String tipoCompartimento = JOptionPane.showInputDialog("Tipo do compartimento: ");
		VeiculosCarga veicCar = new VeiculosCarga(marca, modelo, anoFabricacao,
				anoModelo, renavam, capacidadeTanque,
				taraVeiculo, tamCompartimento, tipoCompartimento);
		cadastrarVeiculo(veicCar); 
	}

	public static void cadastrarCompactoLuxo() {
		String marca = JOptionPane.showInputDialog("Marca: ");
		String modelo = JOptionPane.showInputDialog("Modelo: ");
		String anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
		String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
		String renavam = JOptionPane.showInputDialog("Renavam: ");
		String strCapacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque de combustivel: ");
		float capacidadeTanque = Float.parseFloat(strCapacidadeTanque);
		String strArCondicionado = JOptionPane.showInputDialog("Possui ar-condicionado? ");
		boolean arCondicionado = Boolean.parseBoolean(strArCondicionado); 
		String strDirecaoHidraulica = JOptionPane.showInputDialog("Possui direcao hidraulica? ");
		boolean direcaoHidraulica = Boolean.parseBoolean(strDirecaoHidraulica);
		String strCambioAutomatico = JOptionPane.showInputDialog("Possui cambio automatico? ");
		boolean cambioAutomatico = Boolean.parseBoolean(strCambioAutomatico);
		CompactoLuxo compLuxo = new CompactoLuxo(marca, modelo, anoFabricacao,
				anoModelo, renavam, capacidadeTanque, arCondicionado, direcaoHidraulica, cambioAutomatico);
		cadastrarVeiculo(compLuxo); 
	}

	public static void cadastrarCompacto() {
		String marca = JOptionPane.showInputDialog("Marca: ");
		String modelo = JOptionPane.showInputDialog("Modelo: ");
		String anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
		String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
		String renavam = JOptionPane.showInputDialog("Renavam: ");
		String strCapacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque de combustivel: ");
		float capacidadeTanque = Float.parseFloat(strCapacidadeTanque);
		String strArCondicionado = JOptionPane.showInputDialog("Possui ar-condicionado? ");
		boolean arCondicionado = Boolean.parseBoolean(strArCondicionado);
		String strDirecaoHidraulica = JOptionPane.showInputDialog("Possui direcao hidraulica? ");
		boolean direcaoHidraulica = Boolean.parseBoolean(strDirecaoHidraulica);
		String strCambioAutomatico = JOptionPane.showInputDialog("Possui cambio Automatico? ");
		boolean cambioAutomatico = Boolean.parseBoolean(strCambioAutomatico);
		Compacto comp = new Compacto(marca, modelo, anoFabricacao, anoModelo,
				renavam, capacidadeTanque, arCondicionado, direcaoHidraulica, cambioAutomatico);
		cadastrarVeiculo(comp);
	}

	public static void cadastrarSuvs() {
		String marca = JOptionPane.showInputDialog("Marca: ");
		String modelo = JOptionPane.showInputDialog("Modelo: ");
		String anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
		String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
		String renavam = JOptionPane.showInputDialog("Renavam: ");
		String strCapacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque de combustivel: ");
		float capacidadeTanque = Float.parseFloat(strCapacidadeTanque);
		String strArCondicionado = JOptionPane.showInputDialog("Possui ar-condicionado? ");
		boolean arCondicionado = Boolean.parseBoolean(strArCondicionado);
		String strDirecaoHidraulica = JOptionPane.showInputDialog("Possui direcao hidraulica? ");
		boolean direcaoHidraulica = Boolean.parseBoolean(strDirecaoHidraulica);
		String strCambioAutomatico = JOptionPane.showInputDialog("Possui cambio Automatico? ");
		boolean cambioAutomatico = Boolean.parseBoolean(strCambioAutomatico);
		Suvs suv = new Suvs(marca, modelo, anoFabricacao, anoModelo, renavam,
				capacidadeTanque, arCondicionado, direcaoHidraulica, cambioAutomatico);
		cadastrarVeiculo(suv);
	}

	public static void cadastrarSedan() {
		String marca = JOptionPane.showInputDialog("Marca: ");
		String modelo = JOptionPane.showInputDialog("Modelo: ");
		String anoFabricacao = JOptionPane.showInputDialog("Ano de fabricacao: ");
		String anoModelo = JOptionPane.showInputDialog("Ano do modelo: ");
		String renavam = JOptionPane.showInputDialog("Renavam: ");
		String strCapacidadeTanque = JOptionPane.showInputDialog("Capacidade do tanque de combustivel: ");
		float capacidadeTanque = Float.parseFloat(strCapacidadeTanque);		 
		String strArCondicionado = JOptionPane.showInputDialog("Possui ar-condicionado? ");
		boolean arCondicionado = Boolean.parseBoolean(strArCondicionado);
		String strDirecaoHidraulica = JOptionPane.showInputDialog("Possui direcao hidraulica? ");
		boolean direcaoHidraulica = Boolean.parseBoolean(strDirecaoHidraulica);
		String strCambioAutomatico = JOptionPane.showInputDialog("Possui cambio Automatico? ");
		boolean cambioAutomatico = Boolean.parseBoolean(strCambioAutomatico);
		Sedan sed = new Sedan(marca, modelo, anoFabricacao, anoModelo, renavam,
				capacidadeTanque, arCondicionado, direcaoHidraulica, cambioAutomatico);
		cadastrarVeiculo(sed);

	}

	public static void imprimirVeiculos() {

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