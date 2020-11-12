package UserStorie3;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import Excecoes.Excecoes;
import UserStorie1.Login;

public class GerenciamentoContas extends Login {
	public static String nomeConta() {
		String nome = "Bradesco";
		return nome;
	}

	public static String nomeSegundaConta() {
		String nome = "BB";
		return nome;
	}

	public static String data() {
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
		Date data = new Date();
		return dataFormatada.format(data);
	}

	public static String descricao() {
		String descricao = "Bolo de Pote";
		return descricao;
	}

	public static String interessado() {
		String interessado = "Vendedora de Bolo";
		return interessado;
	}

	public static String valor() {
		String valor = "4";
		return valor;
	}

	public void dragDropContas() throws Exception {
		aguardar();
		try {
			driver.findElement(By.linkText("Contas")).click();
			System.out.println("Acessando menu Contas.");
			driver.findElement(By.linkText("Adicionar")).click();
		} catch (Exception e) {
			throw new Exception(Excecoes.semAcessoContasAdicionar());
		}
	}

	@Test
	public void criarConta() throws Exception {
		fazerLogin();
		dragDropContas();
		try {
			driver.findElement(By.xpath("//*[@id=\"nome\"]")).sendKeys(nomeSegundaConta());
			driver.findElement(By.xpath("/html/body/div[2]/form/div[2]/button")).click();
			validaCadastroConta();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(Excecoes.cadastroInvalido());
		}
	}

	public void validaCadastroConta() throws Exception {
		String verificaSucesso = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		if (verificaSucesso != null) {
			System.out.println("Conta criada.");
		} else {
			System.out.println("Conta já existente.");
		}
	}

	public void dragDropMovimentacao() throws Exception {
		try {
			driver.findElement(By.linkText("Criar Movimentação")).click();
			System.out.println("Acessado o Menu Movimentação");
			aguardar();
		} catch (Exception e) {
			throw new Exception(Excecoes.semAcessoMenuCriarMovimentacao());
		}
	}

	@Test
	public void listarContas() throws Exception {
		fazerLogin();
		aguardar();
		driver.findElement(By.linkText("Contas")).click();
		aguardar();
		driver.findElement(By.linkText("Listar")).click();
	}

	@Test
	public void excluiConta() throws Exception {
		listarContas();
		try {
			driver.findElement(By.xpath("//*[@id=\"tabelaContas\"]/tbody/tr/td[2]/a[2]/span")).click();
			aguardar();
			validaExclusaoConta();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(Excecoes.exclusaoConta());
		}
	}

	public void validaExclusaoConta() {
		String verifica = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		if (verifica != null) {
			System.out.println("Removido.");
		} else {
			System.out.println("Não foi removido.");
		}
	}

	public void comboBoxTipoMovimentacao() {
		Select comboBox = new Select(driver.findElement(By.xpath("//select[@id='tipo']")));
		comboBox.selectByVisibleText("Despesa");
	}

	public void comboBoxConta() {
		Select comboBox = new Select(driver.findElement(By.xpath("//select[@id='conta']")));
		comboBox.selectByVisibleText(nomeSegundaConta());
	}

	public void validaObrigatoriedadeMovimentacao() {

	}

	@Test
	public void criarMovimentacoes() throws Exception {
		fazerLogin();
		aguardar();
		dragDropMovimentacao();
		try {
			aguardar();
			comboBoxTipoMovimentacao();
			driver.findElement(By.xpath("//input[@id='data_transacao']")).sendKeys(data());
			driver.findElement(By.xpath("//input[@id='data_pagamento']")).sendKeys(data());
			driver.findElement(By.xpath("//input[@id='descricao']")).sendKeys(descricao());
			driver.findElement(By.xpath("//input[@id='interessado']")).sendKeys(interessado());
			driver.findElement(By.xpath("//input[@id='valor']")).sendKeys(valor());
			comboBoxConta();
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			aguardar();
			validaCriacaoMovimentacoes();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(Excecoes.criarMovimentacao());
		}
	}

	public void validaCriacaoMovimentacoes() {
		String verifica = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		if (verifica != null) {
			System.out.println("Movimentação criada com sucesso.");
		} else {
			System.out.println("Não foi criada.");
		}
	}
}
