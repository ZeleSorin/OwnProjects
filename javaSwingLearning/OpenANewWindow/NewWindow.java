package javaSwingLearning.OpenANewWindow;

import javax.swing.*;
import java.awt.*;

public class NewWindow {

    JFrame newFrame = new JFrame();
    JLabel label = new JLabel("Hello!");
    NewWindow() {
        label.setBounds(0,0,100,50);
        label.setFont(new Font(null,Font.PLAIN,26));
        newFrame.add(label);


        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newFrame.setSize(new Dimension(500,500));
        newFrame.setLayout(null);
        newFrame.setVisible(true);
    }

}
