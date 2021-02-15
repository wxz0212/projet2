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
    public static final int LARGEURPNL = 800;// largeur du panel
    public static final int HATEURPNL = 600;//hauteur du panel
    public static final int LARGEURMOTO = 100;// largeur de moto
    public static final int HAUTEUMOTO = 100;// hauteur de moto
    public static final int LARGEURLBL = 120;
    public static final int HAUTERULBL = 50;

    //attribute
    public static final int X = LARGEURPNL/2;// X L'abscisse du point au centre
    public static final int Y = HATEURPNL-HAUTEUMOTO;// L'ordonne du point le plus lev de l'ellipse
    public Etat etat;
    public int vitesse=0;
    public int temps=50;
    public int score=0;


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
        lbltemps=new JLabel(" temps restant"+":"+temps);
        lblscore=new JLabel("score"+":"+score);
        lblvitesse=new JLabel("vitesse"+":"+vitesse);

        lbltemps.setBounds(LARGEURPNL-2*LARGEURLBL,HATEURPNL-HAUTERULBL,LARGEURLBL,HAUTERULBL);
        lblscore.setBounds(LARGEURLBL/2,HAUTERULBL/2,LARGEURLBL,HAUTERULBL);
        lblvitesse.setBounds(LARGEURPNL-2*LARGEURLBL,HAUTERULBL/2,LARGEURLBL,HAUTERULBL);

        this.add(lbltemps);
        this.add(lblscore);
        this.add(lblvitesse);

        this.setLayout(null);



    }
    //method



    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(image,etat.getPositionX(),Y,LARGEURMOTO,HAUTEUMOTO,null);




    }




}
