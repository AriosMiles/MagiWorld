package com.ocr.nico;



public  class Char  {

    int player;
    int lvl ;
    int vit = lvl * 5 ;
    int str;
    int agi ;
    int intelligence;


    public int getPlayer() {
        return player;
    }

    void setPlayer(int player) {
        this.player = player;
    }

    public int getLvl() {
        return lvl;
    }

    void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getStr() {
        return str;
    }

    void setStr(int str) {
        this.str = str;
    }

    public int getAgi() {
        return agi;
    }

    void setAgi(int agi) {
        this.agi = agi;
    }

    public int getIntelligence() {
        return intelligence;
    }

    void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }


    Char (){}

    public void basicAtk(Char ennemi) {

    }

    public void specialAtk(Char ennemi) {

    }

}