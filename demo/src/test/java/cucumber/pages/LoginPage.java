package cucumber.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    public LoginPage () {
        // Initialize the driver
        initializeDriver();
        // Open the login page
        openUrl("https://the-internet.herokuapp.com/login");
    }

    public void preencherCampoUsuario(String usuario) {
        driver.findElement(By.id("username")).sendKeys(usuario);
    }

    public void preencherCampoSenha(String senha) {
        driver.findElement(By.id("password")).sendKeys(senha);
    }
    public void deixarCampoSenhaEmBranco() {
        driver.findElement(By.id("password")).clear();
    }

    public void clicarBotaoLogin() {
        driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();
    }

    public boolean verificarMensagem(String mensagemEsperada) {
        return driver.findElement(By.id("flash")).getText().contains(mensagemEsperada);
    }

    


    
}
