package Principal;

import javax.swing.JOptionPane;

import gerenciaFrota.*;
import gerenciaLocatario.*;
import gerenciaReservas.*;

public class App {
	static String nomeLocadora = "LOCADORA NOTA 10";
	static String cnpjLocadora = "133.101.101-10";
	static Locatario l;

	public static void main(String[] args) {
		l = new Locatario();
		char opcao = 'D', opcao1 = 'E', opcao2 = 'D', opcao3 = 'D', opcao4 = 'C', opcao5 = 'C';

		do {// Menu Principal
			opcao = menuPrincipal();
			switch (opcao) {
			case 'A': {// Menu Gerencia Locatario
				do {
					opcao1 = menuGerenciaLocatario();
					switch (opcao1) {
					case 'A': { // Cadastrar locatario
						do {
							opcao5 = menuCadPfPj();
							switch (opcao5) {
							case 'A': { // Cadastrar pessoa fisica (PF)
								try {
									l.cadastrarPessoaFisica();
								} catch (NullPointerException | CampoEmBrancoException ex) {
									String msg = ex.getMessage();
									System.out.println("Exception " + msg);
								}
								System.out.println("Mostrar membros do cadastro: ");
								System.out.println(l.imprimirLocatario());
								break;
							}
							case 'B': { // Cadastrar pessoa jurídica (PJ)
								l.cadastrarPessoaJuridica();
								System.out.println("Mostrar membros do cadastro: ");
								System.out.println(l.imprimirLocatario());
								break;
							}
							case 'C': { // Retornar ao Menu Anterior
								break;
							}
							default:
								JOptionPane.showMessageDialog(null, "Opcao invalida!");
								opcao5 = 'I';
							}
						} while (opcao5 != 'C');	
						break;
					}
					case 'B': { // alterar locatario
						l.alterarLocatario();
						System.out.println("Mostrar membros do cadastro: ");
						System.out.println(l.imprimirLocatario());
						break;
					}
					case 'C': { // Pesquisar locatario
						Locatario.pesquisarLocatario();
						break;
					}
					case 'D': { // Remover locatario
						l.removerLocatarioCadastro();
						System.out.println("Mostrar membros do cadastro: ");
						System.out.println(l.imprimirLocatario());
						break;
					}
					case 'E': { // Retornar ao menu anterior
						break;
					}
					default:
						JOptionPane.showMessageDialog(null, "Opcao invalida!");
						opcao1 = 'I';
					}
				} while (opcao1 != 'E');
				break;
			}

			case 'B': {// Gerencia frota
				do {
					opcao2 = menuGerenciaFrota();
					switch (opcao2) {
					case 'A': { // Cadastrar veiculos
						do {
							opcao3 = menuCadastroVeiculos();
							switch (opcao3) {
							case 'A': { // Cadastrar veiculo de passeio
								// Veiculos.cadastrarVeiculoPasseio();
								JOptionPane.showMessageDialog(null, "Cadastrar veiculo de passeio");
								break;
							}

							case 'B': { // Cadastrar veiculo utilitario
								// Veiculos.cadastrarVeiculosUtilitarios();
								JOptionPane.showMessageDialog(null, "Cadastrar veiculo utilitario");
								break;
							}

							case 'C': { // Cadastrar motocicleta
								// Veiculos.cadastrarMotocicleta();
								JOptionPane.showMessageDialog(null, "Cadastrar motocicleta");
								break;
							}

							case 'D': { // Retornar o Menu Anterior
								break;
							}

							default:
								JOptionPane.showMessageDialog(null, "Opcao invalida!");
								opcao2 = 'I';
							}

						} while (opcao3 != 'D');
						break;
					}

					case 'B': { // Pesquisar veiculo
						do {
							opcao4 = menuPesquisaVeiculo();
							switch (opcao4) {
							case 'A': { // Pesquisar pelo Renavam
								// Veiculos.pesquisarVeiculosRenavam();
								JOptionPane.showMessageDialog(null, "Pesquisar pelo Renavam");
								break;
							}
							case 'B': { // Pesquisar veiculo por marca, modelo ou renavam
								// Veiculos.pesquisarVeiculosMarcaModeloRen();
								JOptionPane.showMessageDialog(null,
										"Pesquisar veiculo por marca, modelo ou renavam");
								break;
							}
							case 'C': { // Retornar ao menu anterior
								break;
							}
							default:
								JOptionPane.showMessageDialog(null, "Opcao invalida!");
								opcao2 = 'I';
							}
						} while (opcao4 != 'C');
						break;
					}

					case 'C': { // Atualizar dados de um veiculo
						JOptionPane.showMessageDialog(null, "Atualizar dados de um veiculo");
						break;
					}

					case 'D': { // Remover veiculo da frota
						JOptionPane.showMessageDialog(null, "Remover veiculo da frota");
						break;
					}

					case 'E': { // Retornar ao menu anterior
						break;
					}
					default:
						JOptionPane.showMessageDialog(null, "Opcao invalida!");
						opcao2 = 'I';
					}
				} while (opcao2 != 'E');
				break;
			}

			case 'C': { // Gerenciar Reservas+
				JOptionPane.showMessageDialog(null, "Gerenciar Reservas");
				break;
			}

			case 'D': { // Sair do Programa
				break;
			}

			default:
				JOptionPane.showMessageDialog(null, "Opcao invalida!");
				opcao = 'W';
			}
		} while (opcao != 'D');
	}

	private static char menuPrincipal() {
		char opcao = 'D';
		String menu = nomeLocadora + "\n CNPJ: " + cnpjLocadora + "\n\n"
				+ "Menu Principal \n"
				+ "A) Gerenciar Locatarios \n"
				+ "B) Gerenciar Frota \n"
				+ "C) Gerenciar Reservas \n"
				+ "D) Sair do Programa";

		String strOpcao = JOptionPane.showInputDialog(menu);
		opcao = strOpcao.toUpperCase().charAt(0);
		return opcao;
	}

	private static char menuGerenciaLocatario() {
		char opcao1 = 'E';
		String menu = "Menu Gerencia de Locatarios \n"
				+ "A) Cadastrar Locatario \n"
				+ "B) Alterar dados de Locatario \n"
				+ "C) Pesquisar Locatario \n"
				+ "D) Excluir Locatario \n"
				+ "E) Retornar ao Menu Anterior";

		String strOpcao1 = JOptionPane.showInputDialog(menu);
		opcao1 = strOpcao1.toUpperCase().charAt(0);
		return opcao1;
	}

	private static char menuGerenciaFrota() {
		char opcao2 = 'E';
		String menu = "Menu Gerencia de Frotas \n"
				+ "A) Cadastrar veiculos \n"
				+ "B) Pesquisar veiculo\n"
				+ "C) Atualizar dados de um veiculo \n"
				+ "D) Remover veiculos da frota \n"
				+ "E) Retornar ao Menu Anterior";
		String strOpcao2 = JOptionPane.showInputDialog(menu);
		opcao2 = strOpcao2.toUpperCase().charAt(0);
		return opcao2;
	}

	private static char menuCadastroVeiculos() {
		char opcao3 = 'D';
		String menu = "Menu de Cadastro de Veiculos \n"
				+ "A) Cadastrar veiculo de passeio \n"
				+ "B) Cadastrar veiculo utilitario \n"
				+ "C) Cadastrar motocicleta \n"
				+ "D) Retornar ao Menu Anterior";

		String strOpcao3 = JOptionPane.showInputDialog(menu);
		opcao3 = strOpcao3.toUpperCase().charAt(0);
		return opcao3;
	}

	private static char menuPesquisaVeiculo() {
		char opcao4 = 'C';
		String menu = "Menu de Pesquisa de Veiculos \n"
				+ "A) Pesquisar veiculo pelo Renavam \n"
				+ "B) Pesquisar veiculo por marca, modelo ou renavam \n"
				+ "C) Retornar ao Menu Anterior";

		String strOpcao4 = JOptionPane.showInputDialog(menu);
		opcao4 = strOpcao4.toUpperCase().charAt(0);
		return opcao4;
	}

	private static char menuCadPfPj() {
		char opcao5 = 'C';
		String menu = "Escolha: \n"
				+ "A) Cadastrar Pessoa Física \n"
				+ "B) Cadastrar Pessoa Jurídica \n"
				+ "C) Retornar ao Menu Anterior";

		String strOpcao5 = JOptionPane.showInputDialog(menu);
		opcao5 = strOpcao5.toUpperCase().charAt(0);
		return opcao5;
	}
	
}
