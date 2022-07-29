package javaSwingLearning;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {



     MyFrame() {

        this.setTitle("JFrame title goes here "); // Set the title of the frame;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes the application and the process when we click on X;

        this.setResizable(false); // Prevents frame from being resized;

        this.setSize(420,420); // this sets the x-dimension and y-dimension of the frame;

        this.setVisible(true); // Sets the frame visible;

        ImageIcon myLogo = new ImageIcon("mob_bikes.jpg"); // Create an imageIcon

        this.setIconImage(myLogo.getImage()); // Change icon of frame

        //frame.getContentPane().setBackground(Color.black); //change color of the background
        this.getContentPane().setBackground(new Color(200,200,209)); // Create new color
    }
}
