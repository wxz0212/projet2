package com.company.Etat;

import com.company.Affichage.Affichage;
public class Etat {
    //constance
    public static final int DISTANCE = 10;// Distance de déplacement
    //attribute
    private int positionX;//

    //constructor
    public Etat(){
        this.positionX=Affichage.LARGEURPNL/2; //pour init la position de moto au milieu

    }



    // method

    //pour ver droit
    public void verD(){
        if(Affichage.LARGEURPNL<=Affichage.LARGEURMOTO/2+DISTANCE){

            this.positionX= this.positionX+DISTANCE;
        }


    }
    // pour ver gauch
    public void verG(){
        if(this.positionX>Affichage.LARGEURMOTO/2){

            this.positionX= this.positionX-DISTANCE;
        }


    }



    public void testPerdu(){




    }





}
