package Excecoes;

public class Excecoes {
	public static String loginInvalido() {
		return "N�o foi poss�vel realizar o login";
	}

	public static String inicializar() {
		return "N�o foi poss�vel inicializar o ChromeDriver.";
	}

	public static String menuCadastro() {
		return "N�o foi poss�vel acessar o menu de Cadastro.";
	}

	public static String cadastroInvalido() {
		return "N�o foi poss�vel realizar o cadastro.";
	}

	public static String semAcessoContasAdicionar() {
		return "N�o foi poss�vel acessar o menu Contas > Adicionar";
	}

	public static String semAcessoMenuCriarMovimentacao() {
		return "N�o foi poss�vel acessar o menu Criar Movimenta��o.";
	}

	public static String exclusaoConta() {
		return "N�o foi poss�vel excluir a conta.";
	}

	public static String criarMovimentacao() {
		return "N�o foi poss�vel criar uma movimenta��o";
	}

	public static String logoutInvalido() {
		return "N�o foi poss�vel realizar logout.";
	}
}
