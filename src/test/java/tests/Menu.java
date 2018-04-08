package tests;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class Menu {

    Uteis uteis = new Uteis();

    private Screen screen = new Screen();

    String CAMINHO = "C:\\Users\\vcampos\\IdeaProjects\\SikuliSCA\\src\\main\\resources\\imagens\\";

    public Menu acessoCadastroInstrutor() throws FindFailed, InterruptedException {

        if(screen.exists(CAMINHO + "telaInicial\\telaInicial_BarraSuperior.png",2000).isValid() ){
            screen.click(CAMINHO + "telaCadastroInstrutor\\telaCadastroInstrutor_botaoCadastroInstrutor.png");
            uteis.screenShot((Screen.getScreen(1).getScreen().capture()),"Login Efetuado");
        } else {
            uteis.screenShot((Screen.getScreen(1).getScreen().capture()),"Login Efetuado");
        }

        return this;
    }
}
