package javaSwingLearning;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutLearning {

    public static void main(String[] args) {
        // Layout Manager = Defines the natural layout for components within a container

        // 3 common manager

        //BroderLayout = A BorderLayout places components in five areas: NORTH, SOUTH,WEST,EAST, CENTER
        //All extra space is placed in the center area

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new java.awt.BorderLayout(10,10));
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3= new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        //------Sub panels ----------------------------

        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8= new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.red);
        panel7.setBackground(Color.green);
        panel8.setBackground(Color.yellow);
        panel9.setBackground(Color.magenta);
        panel10.setBackground(Color.blue);

        panel6.setPreferredSize(new Dimension(100,100));
        panel7.setPreferredSize(new Dimension(100,100));
        panel8.setPreferredSize(new Dimension(100,100));
        panel9.setPreferredSize(new Dimension(100,100));
        panel10.setPreferredSize(new Dimension(100,100));
        panel5.setLayout(new java.awt.BorderLayout(10,10));

        panel5.add(panel6, BorderLayout.NORTH);
        panel5.add(panel7, BorderLayout.WEST);
        panel5.add(panel8, BorderLayout.EAST);
        panel5.add(panel9, BorderLayout.SOUTH);
        panel5.add(panel10,BorderLayout.CENTER);

        //------Sub panels ----------------------------

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4,BorderLayout.SOUTH);
        frame.add(panel5, BorderLayout.CENTER);




    }
}
