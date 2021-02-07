package com.company.Affichage;

import com.company.Etat.Etat;

import javax.swing.*;
import java.awt.*;

public class Affichage extends JPanel {
    //constance
    public static final int LARGEURPNL = 600;// largeur du panel
    public static final int HATEURPNL = 400;//hauteur du panel
    public static final int LARGEURMOTO = 20;// largeur de moto
    public static final int HAUTEUMOTO = 100;// hauteur de moto


    //attribute
    public static final int X = LARGEURPNL/2;// X L'abscisse du point au centre
    public static final int Y = HATEURPNL-HAUTEUMOTO;// L'ordonne du point le plus lev de l'ellipse
    public Etat etat;
    //attribute




    // constructor
    public Affichage(Etat e) {
        this.etat = e;
        setPreferredSize(new Dimension(LARGEURPNL, HATEURPNL));
    }
    //method



    @Override
    public void paint(Graphics g){
        super.paint(g);






    }




}
