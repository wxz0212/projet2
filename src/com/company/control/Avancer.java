package com.company.control;

import com.company.Affichage.Affichage;
import com.company.Etat.Etat;

public class Avancer extends Thread{
        //attribute
        private Etat etat;
        private Affichage affichage;
        //constructor
        public Avancer(Etat etat,Affichage affichage){
            this.etat=etat;
            this.affichage= affichage;
        }

        @Override
        public void run(){




        }











}
