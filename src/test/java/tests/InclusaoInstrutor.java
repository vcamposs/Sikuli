package tests;

import org.sikuli.api.robot.Key;
import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.desktop.DesktopKeyboard;
import org.sikuli.script.*;

public class InclusaoInstrutor {

    private Screen screen = new Screen();
    private Uteis uteis = new Uteis();
    private Keyboard keyboard = new DesktopKeyboard();

    String CAMINHO = "C:\\Users\\vcampos\\IdeaProjects\\SikuliSCA\\src\\main\\resources\\imagens\\";

    public InclusaoInstrutor cadastro(String nome,
                                      String licenca,
                                      String telefone,
                                      String celular,
                                      String email,
                                      String nota) throws InterruptedException {

        if (screen.exists(CAMINHO + "telaCadastroInstrutor\\telaCadastroInstrutor_barraSuperiorSelecaoInstrutores.png", 2000).isValid()) {
            screen.type("n", KeyModifier.CTRL);
        }

        if (screen.exists(CAMINHO + "telaCadastroInstrutor\\telaCadastroInstrutor_barraSuperiorCadastroInstrutores.png", 2000).isValid()) {

            // Nome
            screen.paste(nome);
            uteis.tabOrder(2);

            // Licenca
            screen.paste(licenca);
            uteis.tabOrder(1);

            // Seletor
            uteis.dropDown(2);
            uteis.tabOrder(1);

            // Seletor
            uteis.dropDown(2);
            uteis.tabOrder(1);

            // Telefone
            screen.paste(telefone);
            uteis.tabOrder(1);

            // Celular
            screen.paste(celular);
            uteis.tabOrder(1);

            // Email
            screen.paste(email);
            uteis.tabOrder(1);

            // Nota
            screen.paste(nota);

            uteis.screenShot((Screen.getScreen(1).getScreen().capture()), "Dados incluidos");
        }

        return this;
    }

    public InclusaoInstrutor salvar() {
        screen.type("f", KeyModifier.CTRL);

        screen.type(Key.F4, KeyModifier.ALT);
        screen.type(Key.F4, KeyModifier.ALT);

        return this;
    }

    public boolean fechaSCA() throws FindFailed, InterruptedException {

        screen.type(Key.F4, KeyModifier.ALT);

        uteis.screenShot((Screen.getScreen(1).getScreen().capture()), "após fechar a tela");

        if (screen.exists(("C:\\GitHub\\SikuliSCA\\src\\main\\resources\\imagens\\mensagensComuns\\mensagemSaidaSistema.png"), 5).isValid()) {
            uteis.screenShot((Screen.getScreen(1).getScreen().capture()), "Imagem ESTÁ visivel!");
            uteis.tabOrder(1);
            keyboard.type(Key.ENTER);
            return Boolean.TRUE;
        } else {
            uteis.screenShot((Screen.getScreen(1).getScreen().capture()), "Imagem NÃO está visivel!");
            return Boolean.FALSE;
        }
    }
}
