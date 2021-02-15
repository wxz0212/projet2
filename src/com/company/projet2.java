package com.company;

import com.company.Affichage.Affichage;
import com.company.Etat.Etat;
import com.company.control.Control;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class projet2 {
    public static void main(String[] args) throws IOException {
        JPanel contentPane;
        JFrame frame = new JFrame("Test");
        //
        Etat etat=new Etat();
        Affichage aff ;
        aff = new Affichage(etat);
        Control control=new Control(etat,aff);



        frame.add(aff);
        frame.addKeyListener(control);

        //set
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
    public static class MyFrame extends JFrame {
        private JPanel contentPane;

        public MyFrame(String test) {
            setBg();
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(100, 100, 500, 710);
            init();
        }


        public void init() {
            contentPane = new JPanel();
            contentPane.setOpaque(false);
            contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
            setContentPane(contentPane);
            contentPane.setLayout(null);
            this.setVisible(true);
        }

        public void setBg() {
            ((JPanel) this.getContentPane()).setOpaque(false);
            ImageIcon img = new ImageIcon
                    ("./source/image/background.jpg");
            JLabel background = new JLabel(img);
            this.getLayeredPane().add(background, new Integer(Integer.MIN_VALUE));
            background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        }
    }

}
