package passGen;

import javaSwingLearning.MyFrame;
import viewsFactory.mainFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * GUI class manages the GUI of the password generator
 */
public class GUI  {
    mainFactory factory = new mainFactory();
    public static void main(String[] args) {

    }

//    private JFrame mainFrame;
//    private JPanel contentPanel;
//    private JPanel menuPanel;
//
//    private JButton ticTacToeButton = new JButton("TicTacToe");
//
//    GUI() {
//        createMainFrame();
//
//        contentPanel = new JPanel();
//        contentPanel.setBackground(Color.BLACK);
//        contentPanel.setPreferredSize(new Dimension(600, 200));
//        mainFrame.add(contentPanel, BorderLayout.EAST);
//
//        menuPanel = new JPanel();
//        menuPanel.setBackground(Color.BLUE);
//        menuPanel.setPreferredSize(new Dimension(230,200));
//        mainFrame.add(menuPanel, BorderLayout.WEST);
//        setUpMenuPanel();
//
//        setMainFrameVisible();
//    }
//
//    public static void main(String[] args) {
//        new GUI();
//    }
//
//    private void createMainFrame() {
//        mainFrame = new JFrame();
//        mainFrame.setSize(850, 500);
//        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        mainFrame.setLayout(new BorderLayout());
//        mainFrame.setResizable(false);
//    }
//
//    private void setMainFrameVisible() {
//        mainFrame.setVisible(true);
//    }
//
//    /**
//     * method that sets up the graphics for the menu panel
//     */
//    private void setUpMenuPanel(){
//        menuPanel.setLayout(null);
//        ticTacToeButton.setFocusable(false);
//        ticTacToeButton.setBounds(0,0,250,40);
//        ticTacToeButton.addActionListener(this);
//         menuPanel.add(ticTacToeButton);
//
//
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == ticTacToeButton){
//            System.out.println("[LOG]:TicTacToe launched...");
//            new TicTacToe();
//        }
//        System.out.println("THIS");
//    }
}
