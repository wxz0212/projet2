package com.company;

import javax.swing.*;
import java.awt.*;

public class Affichage extends JPanel {
    //constance
    public static final int LARGEURPNL = 600;// largeur du panel
    public static final int HATEURPNL = 400;//hauteur du panel
    public static final int LARGEUROVAL = 20;// largeur de l'ouvale
    public static final int HAUTEUROVAL = 100;// hauteur de l'ouvale
    public static final  int stroke = 5;
    //Les coordonnes intiales de le moto;
    public static final int X = 20;// X L'abscisse du point le plus  gauche de l'ovale
    public static final int Y = HATEURPNL-HAUTEUROVAL;// L'ordonne du point le plus lev de l'ellipse
    public  Etat etat;
    //attribute




    // constructor
    Affichage(Etat e) {
        this.etat = e;
        setPreferredSize(new Dimension(LARGEURPNL, HATEURPNL));
    }
    //method



    @Override
    public void paint(Graphics g){
        super.paint(g);






    }




}
