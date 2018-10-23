package com.ocr.nico;


public class Main {

    public static void main(String[] args) {


        CharType n = new CharType();
        Char p1 = n.runChar();
        p1.setPlayer(1);
        CharType m = new CharType();
        Char p2 = m.runChar();
        p2.setPlayer(2);
        Fight init = new Fight(p1,p2);
        init.startFight();



    }


}


