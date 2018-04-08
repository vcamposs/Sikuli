package tests;

import org.sikuli.api.robot.Key;
import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.desktop.DesktopKeyboard;
import org.sikuli.script.ScreenImage;

import static java.lang.Thread.sleep;

public class Uteis {

    public Keyboard keyboard = new DesktopKeyboard();

    public void tabOrder(int qtdTab){

        int cont = 0;
        while(qtdTab > cont){
            keyboard.type(Key.TAB);
            cont++;
        }
    }

    public void dropDown(int qtdDropDown){

        int cont = 0;
        while(qtdDropDown > cont){
            keyboard.type(Key.DOWN);
            cont++;
        }
    }

    public void screenShot(ScreenImage imagem, String mensagem) throws InterruptedException {
        sleep(1000);
        imagem.save("C:\\GitHub\\SikuliSCA\\src\\main\\resources\\screenImage");
        System.out.println("-- [Debug] " + mensagem);
    }
}
