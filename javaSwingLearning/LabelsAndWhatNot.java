package javaSwingLearning;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.sql.Connection;

import static java.awt.Font.*;

public class LabelsAndWhatNot {

    public static void main(String[] args) {

        JLabel label = new JLabel(); // Create label
        label.setText("Bro, do you even code?"); // set text to a label
        ImageIcon imageIcon = new ImageIcon("img_1.png");
        Border border = BorderFactory.createLineBorder(Color.GREEN,5);
        label.setIcon(imageIcon);
        label.setHorizontalTextPosition(JLabel.CENTER); // Set text left center or right of the img
        label.setVerticalTextPosition(JLabel.TOP);// set text top center or botom based on the img
        label.setForeground(new Color(0x00FF00)); // Set the color of the text
        label.setFont(new Font("MV Boli", Font.PLAIN,20));
        label.setIconTextGap(-25); // set gap of text with image
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // Set vertical position of icon and text within label
        label.setHorizontalAlignment(JLabel.CENTER); // Set horizontal pozition of icon tand text within label
        //label.setBounds(100,100,750,750);//Set label position within frame and the dimensions

        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(1000,1000);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }

}
