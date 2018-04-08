package tests;

import org.sikuli.api.robot.Key;
import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.desktop.DesktopKeyboard;
import org.sikuli.script.Screen;

import java.io.IOException;

public class Login {

    Screen screen = new Screen();
    Keyboard keyboard = new DesktopKeyboard();
    Uteis uteis = new Uteis();

    String CAMINHO = "C:\\Users\\vcampos\\IdeaProjects\\SikuliSCA\\src\\main\\resources\\imagens\\";

    public Login iniciaAplicacao() throws IOException {
        Runtime.getRuntime().exec("cmd /c C://Sca//Sca.lnk");

        return this;
    }

    public Login userSenha(String user, String senha) throws InterruptedException {

        // Se consegue identificar a imagem, insere user e senha
        if(screen.exists(CAMINHO + "telaLogin\\telaLogin_Login.png",5).isValid()){
            screen.write("SCA");
            uteis.tabOrder(1);
            screen.write("SCA");
            uteis.tabOrder(2);

            keyboard.type(Key.ENTER);

            uteis.screenShot((Screen.getScreen(1).getScreen().capture()),"Login Efetuado");
        } else {
            uteis.screenShot((Screen.getScreen(1).getScreen().capture()),"Erro ao logar");
        }

        return this;
    }
}