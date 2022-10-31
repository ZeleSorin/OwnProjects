package javaSwingLearning.OpenANewWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {

    JFrame launchFrame = new JFrame();
    JButton button = new JButton("New window!");

    LaunchPage() {
        button.setBounds(100,160,200,40);
        button.setFocusable(false);
        button.addActionListener(this);
        launchFrame.add(button);
        launchFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        launchFrame.setSize(new Dimension(500,500));
        launchFrame.setLayout(null);
        launchFrame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            launchFrame.dispose(); // This is gonna get rid of the launch page meaning that there is no possibility for
                                   // spamming the new window button
            NewWindow myWindow = new NewWindow();
        }
    }
}
