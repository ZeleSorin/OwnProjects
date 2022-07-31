package passGen;

import javaSwingLearning.MyFrame;

import javax.swing.*;
import java.awt.*;

/**
 * GUI class manages the GUI of the password generator
 */
public class GUI {

    private JFrame mainFrame;
    private JPanel contentPanel;
    private JPanel menuPanel;

    GUI() {
        createMainFrame();
        setMainFrameVisible();
        contentPanel = new JPanel();
        contentPanel.setBackground(Color.BLACK);
        contentPanel.setPreferredSize(new Dimension(600, 200));
        mainFrame.add(contentPanel, BorderLayout.EAST);

        menuPanel = new JPanel();
        menuPanel.setBackground(Color.BLUE);
        menuPanel.setPreferredSize(new Dimension(150,200));
        mainFrame.add(menuPanel, BorderLayout.WEST);
        setUpMenuPanel();


    }

    public static void main(String[] args) {
        new GUI();
    }

    private void createMainFrame() {
        mainFrame = new JFrame();
        mainFrame.setSize(750, 500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setResizable(false);
    }

    private void setMainFrameVisible() {
        mainFrame.setVisible(true);
    }

    private void setUpMenuPanel(){
        menuPanel.setLayout(new GridLayout(9,1));
        menuPanel.add(new JButton("PassGen"));
        menuPanel.add(new JButton("TicTacToe"));
        menuPanel.add(new JButton("Contact"));
    }
}
