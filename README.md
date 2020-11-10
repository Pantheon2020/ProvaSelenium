# ProvaSelenium
 -> Por favor, baixar o projeto no zip disponibilizado.
  # Cenários de Testes:
CT01 - Verificar se é possível realizar login na plataforma.
	-> Há dois campos para passar dados para efetuar o login.
CT02 - Verificar os campos obrigatórios para a realização do login.
	-> Campos Email e Senha são obrigatórios.
CT03 - Verificar se é possivel realizar o cadastro de um usuário.
	-> Ao clicar no botão "Novo usuário?" é redirecionado para uma nova tela, onde é possível realizar o cadastro de um usuário.
CT04 - Verificar na tela de cadastros quais campos são de preenchimento obrigatório.
	-> Todos os campos são de preenchimento obrigatório.
CT05 - Verificar se é possivel criar uma conta informando um email inválido.
	-> Na criação de uma conta para um usuário cadastrar um email inválido.
CT06 - Verificar se é possivel cadastrar uma conta informando um email válido
	-> Cadastrar uma conta informando um email válido
CT07 - Verificar se é possivel logar com a conta que foi cadastrada anteriormente.
	-> Informar os acessos que foram cadastrados anteriormente e efetuar o login
CT08 - Verificar o que ocorre se tentar logar com acessos inválidos.
	-> Informar acessos que não foram cadastrados no sistema.
CT09 - Verificar se ao entrar no sistema é possível sair do mesmo.
	-> Clicar no botão de sair
CT10 - Verificar se na tela Adicionar Conta é possível criar uma conta sem informar o nome.
	-> Nome é um campo obrigatório.
CT11 - Verificar se é possivel criar Contas e listar as mesmas.
	-> Ao clicar no Menu Contas e clicar para adicionar uma Conta e ao clicar em salvar são listadas as contas disponiveis.
CT12 - 	Verificar se na tela Listar Conta é possivel alterar o nome e remover as contas adicionadas.
	-> Para remover a conta desejada é só clicar no "x" e para alterar o nome é só clicar no ícone de edição.
CT13 - Verificar se é possível criar uma nova conta com o mesmo nome de uma conta já existente.
	-> Não é possível criar uma conta com o mesmo de uma já existente.
CT14 - Verificar se é possivel alterar o nome de uma conta para o de uma já existente.
	-> Não é possivel alterar para o mesmo nome de uma conta já existente.
  
   # Especificações do Projeto:
O projeto está em Java 8, com o JUnit 5 e a versão do Chrome utilizada foi: 86.0.4240.183.
Por favor, seguir este passo a passo:
 1 - Rodar o metodo @Test cadastrar() no package UserStorie2
 2 - Rodar o metodo @Test fazerLogin() no package UserStorie1
 3 - Rodar o metodo @Test criarConta() no package UserStorie3
 4 - Rodar o metodo @Test listarContas no package UserStorie3
 5 - Rodar o metodo @Test excluiConta no package UserStorie3
 6 - Rodar o metodo @Test criarConta no package UserStorie3
 7 - Rodar o metodo @Test criarMovimentacoes no package UserStorie3
 8 - Rodar o metodo @Test realizaLogout no package UserStorie5

  
