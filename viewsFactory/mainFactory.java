package viewsFactory;

import Views.mainPanel;
import Views.menuPage;
import Views.ticTacToePanel;

import javax.swing.*;
import java.util.Locale;

/**
 * mainFactory used to separate the user from the underliying creationg process of a panel
 */
public class mainFactory {
    public mainPanel frame ;


    /**
     *
     * @param typeOfPanel string that shows the type of panel to be created
     * @return a specific type of panel that extends mainPanel
     * @throws Exception if the parameter is empty or wrong.
     */
    public mainPanel factoryDo(String typeOfPanel) throws Exception {
        if (typeOfPanel.isEmpty()){
            throw new Exception("The type of panel is empty in mainFactory/factoryDO");
        }
        if(typeOfPanel.toLowerCase(Locale.ROOT).equals("tictactoe")){
            frame = new ticTacToePanel();
            frame.makeFrame();
            System.out.println("TicTacToe frame created");
            frame.makeFrameVisible(true);
            return  frame;
        }
        if (typeOfPanel.toLowerCase(Locale.ROOT).equals("menupage")){
            frame = new menuPage();
            frame.makeFrame();
            System.out.println("Launch frame created");

            frame.makeFrameVisible(true);
            return frame;
        }
        throw new Exception("Wrong parameter in mainFactory/factoryDo");
    }


}
