package com.ocr.nico;


public class  Rodeur extends Char {

    Rodeur(){}

        @Override
        public void basicAtk(Char ennemi) {
            int bowAtk = this.agi;
            System.out.println("Joueur "+this.player+" utilise Tir a l'arc et inflige "+bowAtk+" dommages.");
            ennemi.vit -= bowAtk;
            System.out.println("Le joueur"+ennemi.player+" perd "+bowAtk+" point de vie");
            if (ennemi.vit<=0)
                System.out.println("Joueur "+ennemi.player+" est mort.");
        }

        @Override
        public void specialAtk(Char ennemi) {

            System.out.println("Joueur "+this.player+" utilise Concentration et augmente son agilité.");
            setAgi(this.agi=agi+(this.lvl/2));
    }
    }

