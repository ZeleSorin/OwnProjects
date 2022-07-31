package javaSwingLearning;

import javax.swing.*;
import java.awt.*;

public class GridLayoutLearning {

    //GridLayout = places components in a grid of cells.
    // each component takes all the available space within its cell,
    // and each cell is the same size.

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(9,1));

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));

        frame.setVisible(true);
    }


}