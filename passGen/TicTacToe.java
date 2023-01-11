package passGen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * TicTacToe class that will handle the ticTacToe implementation,visuals and the actual game.
 */
public class TicTacToe implements ActionListener {
    /**
     * Main JFrame
     */
    private final JFrame ticTacFrame = new JFrame();

    /**
     * Button that handles the start of a game.
     */
    private final JButton newGame = new JButton("NewGame!");

    /**
     * Button that handles the options of the game.
     */
    private final JButton options = new JButton("Options");

    /**
     * Button that handles the rankings of the game.
     */
    private final JButton ranking = new JButton("Ranking");

    /**
     * TicTacToeLabel that holds the logo of the game
     */
    private final JLabel icon = new JLabel();


    public TicTacToe() {
        ticTacFrame.setDefaultCloseOperation(Integer.valueOf(3));
        ticTacFrame.setSize(900, 600);
        ticTacFrame.setLayout(null);
        buttonInitialization();
        createLogo();

        ticTacFrame.setVisible(true);
    }

    /**
     * Method that creates and assigns the logo of the main page
     */
    private void createLogo() {
        ImageIcon imageIcon = new ImageIcon("ticTacToeLogo.png");
        icon.setForeground(Color.BLUE);
        icon.setIcon(imageIcon);

        icon.setBounds(0, 0, 1000, 500);
        ticTacFrame.add(icon);
    }

    /**
     * Method that initializes the buttons before adding them on the mainPage
     */
    private void buttonInitialization() {

        // ------------------------------------------------------------------------newGameButton adding
        newGame.setBounds(300, 100, 200, 40);
        newGame.addActionListener(this);
        ticTacFrame.add(newGame);


        // ------------------------------------------------------------------------options Button adding
        options.setBounds(300, 160, 200, 40);
        options.addActionListener(this);
        ticTacFrame.add(options);


        // ------------------------------------------------------------------------ranking Button adding
        ranking.setBounds(300, 220, 200, 40);
        ranking.addActionListener(this);
        ticTacFrame.add(ranking);


    }

    private void mainScreen() {

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newGame) {
            System.out.println("[LOG]: NEWGAME launched..");
            new TTGame();
        } else {
            if (e.getSource() == options) {
                System.out.println("[LOG]: Options launched..");
            } else {
                if (e.getSource() == ranking) {
                    System.out.println("[LOG]: Ranking launched..");
                }
            }
        }
    }

    private class TTGame implements ActionListener {

        private JFrame gameFrame = new JFrame();
        private JButton button1 = new JButton();
        private JButton button2 = new JButton();
        private JButton button3 = new JButton();
        private JButton button4 = new JButton();
        private JButton button5 = new JButton();
        private JButton button6 = new JButton();
        private JButton button7 = new JButton();
        private JButton button8 = new JButton();
        private JButton button9 = new JButton();


        private int[] possitions = new int[9];
        Boolean xOrO = false;

        TTGame() {
            gameFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            gameFrame.setSize(500, 500);
            gameFrame.setLayout(new GridLayout(3, 3, 5, 5));
            gameFrame.setForeground(Color.BLACK);
            setUpButtons();
            gameFrame.setVisible(true);

        }

        private void setUpBoard() {
            for (int i = 0; i < 9; i++) {
                possitions[i] = 0;
            }
        }

        private void setUpButtons() {
            button1.setFont(new Font("MV Bali", Font.BOLD, 40));
            button2.setFont(new Font("MV Bali", Font.BOLD, 40));
            button3.setFont(new Font("MV Bali", Font.BOLD, 40));
            button4.setFont(new Font("MV Bali", Font.BOLD, 40));
            button5.setFont(new Font("MV Bali", Font.BOLD, 40));
            button6.setFont(new Font("MV Bali", Font.BOLD, 40));
            button7.setFont(new Font("MV Bali", Font.BOLD, 40));
            button8.setFont(new Font("MV Bali", Font.BOLD, 40));
            button9.setFont(new Font("MV Bali", Font.BOLD, 40));

            button1.addActionListener(this);
            button2.addActionListener(this);
            button3.addActionListener(this);
            button4.addActionListener(this);
            button5.addActionListener(this);
            button6.addActionListener(this);
            button7.addActionListener(this);
            button8.addActionListener(this);
            button9.addActionListener(this);


            gameFrame.add(button1);
            gameFrame.add(button2);
            gameFrame.add(button3);
            gameFrame.add(button4);
            gameFrame.add(button5);
            gameFrame.add(button6);
            gameFrame.add(button7);
            gameFrame.add(button8);
            gameFrame.add(button9);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button1) {
                System.out.println("[LOG]: Position 1 pressed.. ");
                doMove(0, button1);
            }
            if (e.getSource() == button2) {
                System.out.println("[LOG]: Position 2 pressed.. ");
                doMove(1, button2);
            }
            if (e.getSource() == button3) {
                System.out.println("[LOG]: Position 3 pressed..");
                doMove(2, button3);
            }
            if (e.getSource() == button4) {
                System.out.println("[LOG]: Position 4 pressed..");
                doMove(3, button4);
            }
            if (e.getSource() == button5) {
                System.out.println("[LOG]: Position 5 pressed..");
                doMove(4, button5);
            }
            if (e.getSource() == button6) {
                System.out.println("[LOG]: Position 6 pressed.. ");
                doMove(5, button6);
            }
            if (e.getSource() == button7) {
                System.out.println("[LOG]: Position 7 pressed..");
                doMove(6, button7);
            }
            if (e.getSource() == button8) {
                System.out.println("[LOG]: Position 8 pressed..");
                doMove(7, button8);
            }
            if (e.getSource() == button9) {
                System.out.println("[LOG]: Position 9 pressed..");
                doMove(8, button9);
            }
        }

        private void doMove(int i, JButton button) {
            if (possitions[i] == 1) {
                System.out.println("[LOG]:Wrong move!");
            } else {
                possitions[i] = 1;
                if (xOrO == false) {
                    button.setText("o");
                    xOrO=true;
                } else{
                    button.setText("x");
                    xOrO=false;
                }
            }
        }
    }


}