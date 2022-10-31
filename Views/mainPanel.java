package Views;

import javax.swing.*;

public class mainPanel extends JFrame {

    private JFrame frame = new JFrame();

    /**
     * Initialization of the default frame
     * It is not set visible.
     */
    public void makeFrame(){
        frame.setDefaultCloseOperation(Integer.valueOf(3));
        frame.setSize(1200,980);
        frame.setLayout(null);

    }

    public void makeFrameVisible(boolean bool){
        frame.setVisible(bool);
    }



}
