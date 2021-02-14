package com.company.Etat;

import com.company.Affichage.Affichage;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Parcours {
    //attribut de piste
    private ArrayList<Point> ListP = new ArrayList<Point>();
    protected int position;
    protected float vitesse;
    private int MAXF=Affichage.LARGEURMOTO*2;
    private int MAXR=Affichage.LARGEURMOTO*2;

    //constructor
    public Parcours(){
        this.position= Affichage.LARGEURPNL/2;
        this.vitesse =0;
        //add the first point
        this.ListP.add(new Point(Affichage.LARGEURPNL/2,Affichage.HATEURPNL-Affichage.HAUTEUMOTO/2));
        Random rand = new Random();

        for (int i = 2; i <Affichage.HATEURPNL /100; i++) {
            /* Produces a point whose horizontal coordinates and the
             horizontal coordinates of the previous point are not more
             than twice the width of the moto*/
            Point lastPoint = ListP.get(ListP.size()-1);
            int min = lastPoint.x-MAXF;
            int max = lastPoint.x+MAXR;
            // for test if moto exceeds the boundary
            if(min <= 0) { min =0;}
            if(max >= Affichage.LARGEURPNL-Affichage.LARGEURMOTO/2){
                max = Affichage.LARGEURPNL-Affichage.LARGEURMOTO/2;
            }

            int x =  min + (int)(Math.random()*(max - min +1));
            // produces a y between  500-400,400-300,300-200,200-100
            int y = rand.nextInt(100)+(600-(100*(i)));
            Point p = new Point(x, y);
            this.ListP.add(p);

        }





    }







    //getter and setter
    public ArrayList<Point> getListP() {
        return ListP;
    }

    public void setListP(ArrayList<Point> listP) {
        ListP = listP;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public float getVitesse() {
        return vitesse;
    }

    public void setVitesse(float vitesse) {
        this.vitesse = vitesse;
    }










}
