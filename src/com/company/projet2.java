package com.company;

import com.company.Affichage.Affichage;
import com.company.Etat.Etat;
import com.company.control.Control;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.IOException;

public class projet2 {

    public static void main(String[] args) throws IOException {

        JPanel contentPane;
        JFrame frame = new JFrame("Test");

        //for set background
//        ((JPanel)frame.getContentPane()).setOpaque(false);
//
//        ImageIcon img= new ImageIcon("background.jpg");
//        JLabel background = new JLabel(img);
//        frame.getLayeredPane().add(background, new Integer(Integer.MIN_VALUE));
//        background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
//
//        contentPane = new JPanel();
//        contentPane.setOpaque(false);
//        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//        frame.setContentPane(contentPane);
//        contentPane.setLayout(null);
//        frame.setPreferredSize(new Dimension(img.getIconWidth(), img.getIconHeight()));



        //
        Etat etat=new Etat();
        Affichage aff;
        aff = new Affichage(etat);
        Control control=new Control(etat,aff);
        aff.addKeyListener(control);
        frame.add(aff);

        //set
        frame.pack();
        frame.setVisible(true);



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }

}
