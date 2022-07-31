package javaSwingLearning;

import javax.swing.*;
import java.awt.*;

public class PanelsAndWhatNot {

    public static void main(String[] args) {
        //JPanel = a GUI component that functions as a container to hold other components

        JLabel label = new JLabel();
        label.setText("This is a label! :)");
        ImageIcon imageIcon = new ImageIcon("img_1.png");
        label.setIcon(imageIcon);
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        redPanel.add(label);

        redPanel.setLayout(new BorderLayout());

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(0,redPanel.getHeight(),500,250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(250,0,250,250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}
