package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.sikuli.script.FindFailed;

import java.io.IOException;

public class FluxoInstrutor_Gherkin {

    InclusaoInstrutor inclusaoInstrutor = new InclusaoInstrutor();

    @Given("^que o usuário está logado no sistema SCA com o user \"(.*?)\" e senha \"(.*?)\"$")
    public void que_o_usuário_está_logado_no_sistema_SCA_com_o_user_e_senha(String user, String senha) throws IOException, InterruptedException {
        Login login = new Login().iniciaAplicacao().userSenha(user, senha);
    }

    @When("^ele acessa a tela de inclusão de instrutor$")
    public void ele_acessa_a_tela_de_inclusão_de_instrutor() throws FindFailed, InterruptedException {
        Menu menu = new Menu().acessoCadastroInstrutor();
    }

    @And("^inclui nome \"(.*?)\", licenca \"(.*?)\", telefone \"(.*?)\", celular \"(.*?)\", email \"(.*?)\" e nota \"(.*?)\"$")
    public void inclui_nome_licenca_telefone_celular_email_e_nota(String nome, String licenca, String telefone, String celular, String email, String nota) throws InterruptedException {
        inclusaoInstrutor.cadastro(nome,licenca, telefone,celular,email,nota);
    }

    @Then("^as informações são salvas e o sistema é fechado$")
    public void as_informações_são_salvas_e_o_sistema_é_fechado() throws FindFailed, InterruptedException {
        inclusaoInstrutor.salvar();
        Assert.assertEquals(inclusaoInstrutor.fechaSCA(),Boolean.TRUE);
    }

}
