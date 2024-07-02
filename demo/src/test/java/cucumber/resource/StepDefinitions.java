package cucumber.resource;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import cucumber.pages.LoginPage;

import cucumber.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    private LoginPage loginPage;

        @Given("Usuário está na página de login")
    public void usuário_está_na_página_de_login() {
        loginPage = new LoginPage();
       
    }
    @When("Usuário preenche o campo de usuário com {string}")
    public void usuário_preenche_o_campo_de_usuário_com(String username) {
        loginPage.preencherCampoUsuario(username);
       
    }
    @When("Usuário preenche o campo de senha com {string}")
    public void usuário_preenche_o_campo_de_senha_com(String password) {
        loginPage.preencherCampoSenha(password);
      
    }
    @When("Usuário deixa o campo de senha em branco")
    public void usuario_deixa_o_campo_de_senha_em_branco() {
        loginPage.deixarCampoSenhaEmBranco();
    }
    @When("Usuário clica no botão de login")
    public void usuário_clica_no_botão_de_login() {
        loginPage.clicarBotaoLogin();
        
    }
    @Then("Usuário deve ver a mensagem {string}")
    public void usuário_deve_ver_a_mensagem(String mensagemEsperada) {
        assertTrue(loginPage.verificarMensagem(mensagemEsperada));
       
    }
    
}
