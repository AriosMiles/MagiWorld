package com.ocr.nico;

public class  Guerrier extends Char {

   Guerrier (){}

    @Override
    public void basicAtk(Char ennemi) {
        int swordAtk = this.str;
        System.out.println("Joueur "+this.player+" utilise Coup d'épée et inflige "+swordAtk+" dommages.");
        ennemi.vit -= swordAtk;
        System.out.println("Le joueur "+ennemi.player+" perd "+swordAtk+" point de vie");
        if (ennemi.vit<=0)
            System.out.println("Joueur "+ ennemi.player+" est mort");
    }

    @Override
    public void specialAtk(Char ennemi) {
        int rage = this.str *2;
        System.out.println("Joueur "+this.player+" utilise Coup de Rage et inflige "+rage+" dommages.");
        ennemi.vit -= rage;
        setStr(this.str= str/2);
        System.out.println("Le joueur "+this.player+" perds la moitié de sa force.");
        System.out.println("Le joueur "+ennemi.player+" perds "+rage+"point de vie");
        if (ennemi.vit<=0)
            System.out.println("Joueur " + ennemi.player + " est mort.");

    }
}

