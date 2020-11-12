package Excecoes;

public class Excecoes {
	public static String loginInvalido() {
		return "Não foi possível realizar o login";
	}

	public static String inicializar() {
		return "Não foi possível inicializar o ChromeDriver.";
	}

	public static String menuCadastro() {
		return "Não foi possível acessar o menu de Cadastro.";
	}

	public static String cadastroInvalido() {
		return "Não foi possível realizar o cadastro.";
	}

	public static String semAcessoContasAdicionar() {
		return "Não foi possível acessar o menu Contas > Adicionar";
	}

	public static String semAcessoMenuCriarMovimentacao() {
		return "Não foi possível acessar o menu Criar Movimentação.";
	}

	public static String exclusaoConta() {
		return "Não foi possível excluir a conta.";
	}

	public static String criarMovimentacao() {
		return "Não foi possível criar uma movimentação";
	}

	public static String logoutInvalido() {
		return "Não foi possível realizar logout.";
	}
}
