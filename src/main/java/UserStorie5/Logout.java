package UserStorie5;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;

import Excecoes.Excecoes;
import UserStorie1.Login;

public class Logout extends Login {
	@Test
	public void realizaLogout() throws Exception {
		fazerLogin();
		try {
			driver.findElement(By.linkText("Sair")).click();
			System.out.println("Saindo do sistema.");
		} catch (Exception e) {
			throw new Exception(Excecoes.logoutInvalido());
		}
	}

	@After
	public void finalizaSessao() {
		finalizarSessao();
	}
}
