package com.ocr.nico;



abstract  class Char  {

    protected int player;
    protected int lvl ;
    protected int vit ;
    protected int str;
    protected int agi ;
    protected int intelligence;

    Char (){}

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




     public abstract void basicAtk(Char ennemi);



     public abstract void specialAtk(Char ennemi);

}