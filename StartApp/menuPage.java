package StartApp;

import Views.mainPanel;
import passGen.TicTacToe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Main panel for my application.
 * It will show the selection screen in which multiple applications can be chosen.
 */
public class menuPage extends mainPanel implements ActionListener {
    //TODO: Working here
    /**
     * Jbutton used to launch the tictactoe game.
     */
    private JButton tictac;

    private JPanel contentPanel;
    private JPanel menuPanel;




    /**
     * Constructor for the menu page.
     */
    public menuPage() {
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        contentPanel = new JPanel();
        contentPanel.setBackground(Color.BLACK);
        contentPanel.setPreferredSize(new Dimension(1000, 800));
        this.add(contentPanel, BorderLayout.EAST);
        menuPanel = new JPanel();
        menuPanel.setBackground(Color.blue);
        menuPanel.setPreferredSize(new Dimension(300, 300));
        this.add(menuPanel, BorderLayout.WEST);
        this.setVisible(true);
    }
    //TODO: ADD the rest of the functionality from the GUI to here in order to create the selection screen

    /**
     * Method that automatically adds the buttons for each feature that
     * my application will have.
     */
    public void addButtons() {
        menuPanel.setLayout(null);
        tictac.setFocusable(false);
        tictac.setBounds(0,0,250,40);
        tictac.addActionListener(this);
        menuPanel.add(tictac);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() ==tictac){
            System.out.println("[MOB]: TicTacToe launched...");
            new TicTacToe();
        }
    }
}
