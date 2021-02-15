package com.company.Etat;

import com.company.Affichage.Affichage;
public class Etat {


    //constance
    public static final int DISTANCE_MOVE = 10;// Distance de déplacement
    public static final int Max_ACC = 4;
    public static final int  MAX_VITESSE = 40;



    //attribute
    private int positionX;//


    private Parcours parcours;


    //constructor
    public Etat(){
        this.positionX=Affichage.LARGEURPNL/2; //pour init la position de moto au milieu

    }



    // method
    public static int getDISTANCE_MOVE() {
        return DISTANCE_MOVE;
    }
    public Parcours getParcours() {
        return parcours;
    }
    public int getPositionX() {
        return positionX;
    }
    //pour ver droit
    public void verD(){
        if(Affichage.LARGEURPNL>=Affichage.LARGEURMOTO/2+DISTANCE_MOVE+positionX){

            this.positionX+=DISTANCE_MOVE;
        }


    }
    // pour ver gauch
    public void verG(){
        if(this.positionX>Affichage.LARGEURMOTO/2){

            this.positionX-=DISTANCE_MOVE;
        }


    }




    public void testPerdu(){




    }





}
