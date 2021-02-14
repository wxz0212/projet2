package com.company.Affichage;

import com.company.Etat.Etat;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Affichage extends JPanel {
    //constance
    public static final int LARGEURPNL = 600;// largeur du panel
    public static final int HATEURPNL = 400;//hauteur du panel
    public static final int LARGEURMOTO = 50;// largeur de moto
    public static final int HAUTEUMOTO = 50;// hauteur de moto


    //attribute
    public static final int X = LARGEURPNL/2;// X L'abscisse du point au centre
    public static final int Y = HATEURPNL-HAUTEUMOTO;// L'ordonne du point le plus lev de l'ellipse
    public Etat etat;
    //attribute de image

    BufferedImage image;
    private JLabel lblvitesse;
    private JLabel lbltemps;
    private JLabel lblscore;






    // constructor
    public Affichage(Etat e) throws IOException {
        this.etat = e;
        setPreferredSize(new Dimension(LARGEURPNL, HATEURPNL));
        image = ImageIO.read(new File("./source/image/moto.jpeg"));
        lbltemps=new JLabel(" temps restant");
        lblscore=new JLabel("score");
        lblvitesse=new JLabel("vitesse");

        lbltemps.setBounds(680,520,120,50);
        lblscore.setBounds(730,30,50,30);
        lblvitesse.setBounds(20,520,50,30);

        this.add(lbltemps);
        this.add(lblscore);
        this.add(lblvitesse);





    }
    //method



    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(image,50,50,LARGEURMOTO,HAUTEUMOTO,null);




    }




}
