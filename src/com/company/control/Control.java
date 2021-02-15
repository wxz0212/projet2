package com.company.control;

import com.company.Affichage.Affichage;
import com.company.Etat.Etat;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Control implements KeyListener {
    private Etat etat;
    private Affichage affichage;
    public Control(Etat e, Affichage a){
    this.etat =e;
    this.affichage = a;
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //left
        if(e.getKeyCode() == 37) {
            etat.verG();
            //etat.calcul_vitesse();
            affichage.repaint();
        }
        //up
        if(e.getKeyCode() == 38) {

        }
        //right
        if(e.getKeyCode() == 39) {
            etat.verD();
            //etat.calcul_vitesse();
            affichage.repaint();
        }
        //down
        if(e.getKeyCode() == 40) {

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    //



}
