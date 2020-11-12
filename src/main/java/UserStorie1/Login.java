package UserStorie1;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import Excecoes.Excecoes;

public class Login {
	public ChromeDriver driver;

	public static String email() {
		String email = "pantheon@test.com";
		return email;
	}

	public static String senha() {
		String senha = "123";
		return senha;
	}

	public static String nome() {
		String nome = "Pantheon";
		return nome;
	}

	public void aguardar() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void inicializar() throws Exception {
		try {
			driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		} catch (Exception e) {
			throw new Exception(Excecoes.inicializar());
		}
	}

	public void entrarNoSite() {
		driver.manage().window().maximize();
		driver.get("https://seubarriga.wcaquino.me");
	}

	@Test
	public void fazerLogin() throws Exception {
		try {
			inicializar();
			entrarNoSite();
			driver.findElement(By.name("email")).sendKeys(email());
			driver.findElement(By.name("senha")).sendKeys(senha());
			driver.findElement(By.xpath("/html/body/div[2]/form/button")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		String alerta = driver.findElement(By.xpath("/html/body/div[1]")).getText();
		if (alerta != null) {
			System.out.println("Logado no sistema.");
		} else {
			throw new Exception(Excecoes.loginInvalido());
		}
	}

	public void finalizarSessao() {
		driver.quit();
	}
}