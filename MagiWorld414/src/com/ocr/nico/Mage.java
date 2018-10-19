package com.ocr.nico;

public class Mage extends Char {

    Mage () {}

        @Override
        public void basicAtk(Char ennemi) {
            int fireBall = this.intelligence;
            System.out.println("Joueur "+this.player+" utilise Boule de feu et inflige "+fireBall+" dommages.");
            ennemi.vit -= fireBall;
            System.out.println("Le joueur "+ennemi.player+" perd "+fireBall+" point de vie");
            if (ennemi.vit<=0)
                System.out.println("Joueur "+ennemi.player+" est mort.");
        }

        @Override
        public void specialAtk(Char ennemi) {
            int maxLifePoint = lvl * 5;
            int soin = this.intelligence * 2;
            if (this.vit < maxLifePoint){
                this.vit += soin;
                System.out.println("Joueur "+this.player+" utilise soin et gagne "+soin+" en vitalité.");
            }else if(vit + soin > maxLifePoint){
                soin = maxLifePoint - vit;
               vit = maxLifePoint;
                System.out.println("Joueur "+this.player+" utilise soin et gagne "+soin+" en vitalité.");
            }
        }

    }
