package tests;

import org.junit.Assert;
import org.junit.Test;
import org.sikuli.script.*;
import java.io.IOException;

public class fluxoInstrutor_JUnit {

    @Test
    public void fluxoInstrutorSemPO() throws IOException, FindFailed, InterruptedException {
        Login login = new Login().iniciaAplicacao().userSenha("SCA", "SCA");
        Menu menu = new Menu().acessoCadastroInstrutor();
        InclusaoInstrutor inclusaoInstrutor = new InclusaoInstrutor().cadastro("Victor",
                                                                               "123",
                                                                               "2323232323",
                                                                               "1919191919",
                                                                               "ola@ola.com",
                                                                               "teste executado")
                                                                               .salvar();
        Assert.assertEquals(inclusaoInstrutor.fechaSCA(),Boolean.TRUE);
    }
}
