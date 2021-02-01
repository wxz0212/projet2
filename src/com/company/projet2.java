package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class projet2 {

    public static void main(String[] args){

        JPanel contentPane;
        JFrame frame = new JFrame("Test");

        //for set background
        ((JPanel)frame.getContentPane()).setOpaque(false);
            //setBg
        ImageIcon img= new ImageIcon("background.jpg");
        JLabel background = new JLabel(img);
        frame.getLayeredPane().add(background, new Integer(Integer.MIN_VALUE));
        background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());

        contentPane = new JPanel();
        contentPane.setOpaque(false);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        frame.setContentPane(contentPane);
        contentPane.setLayout(null);
        frame.setPreferredSize(new Dimension(img.getIconWidth(), img.getIconHeight()));

        //set
        frame.pack();
        frame.setVisible(true);



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }

}
