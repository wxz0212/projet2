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
        switch(e.getKeyCode())
        {
            case KeyEvent.VK_LEFT:
                etat.verG();
                affichage.repaint();
                break;
            case KeyEvent.VK_RIGHT:
                etat.verD();
                affichage.repaint();
                break;

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    //



}
