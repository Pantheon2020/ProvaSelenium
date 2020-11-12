package UserStorie2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import Excecoes.Excecoes;
import UserStorie1.*;

public class Cadastro extends Login {
	@Before
	public void acessarCadastro() throws Exception {
		inicializar();
		entrarNoSite();
		try {
			driver.findElement(By.linkText("Novo usuário?")).click();
			aguardar();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(Excecoes.menuCadastro());
		}
	}

	@Test
	public void cadastrar() throws Exception {
		Thread.sleep(1000);
		try {
			driver.findElement(By.xpath("//input[@id='nome']")).sendKeys(nome());
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email());
			driver.findElement(By.xpath("//input[@id='senha']")).sendKeys(senha());
			driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
			validarCadastro();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(Excecoes.cadastroInvalido());
		}
	}

	public void validarCadastro() {
		aguardar();
		String verifica = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		assertEquals("Usuário inserido com sucesso", verifica);
	}
}
