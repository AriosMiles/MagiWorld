package com.ocr.nico;
import java.util.Scanner;

class CharType {

    Char valueStats;

    /** Create a new Character
     *
     */

    public Char chooseClass (){
        System.out.println("Veuillez choisir votre classe : 1-Guerrier, 2-Mage, 3-Rôdeur");

        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        if (val==1) {
            System.out.println("Vous avez choisis Guerrier!");
            return valueStats= new Guerrier();}

        else if (val==2){
            System.out.println("Vous avez choisis Mage!");

            return valueStats= new Mage();}

        else if (val==3){
            System.out.println("Vous avez choisis Rôdeur!");
            return  valueStats= new Rodeur();}

        else {
            return valueStats= new Char();

        }
    }


    public Char selectStats (){

        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while (!flag) {

/** @p4 = determine les valeurs des stats
 * @valueStats = valeur enregistré pour le personnage
 * */
            System.out.println("Veuillez choisir votre niveau (1-100)");
            int p4 = sc.nextInt();
            valueStats.setLvl(p4);
            System.out.println("Votre force?");
            p4 = sc.nextInt();
            valueStats.setStr(p4);
            System.out.println("Votre agilité?");
            p4 = sc.nextInt();
            valueStats.setAgi(p4);
            System.out.println("Votre intelligence?");
            p4 = sc.nextInt();
            valueStats.setIntelligence(p4);

            valueStats.vit = 5*valueStats.lvl;





            if (valueStats.lvl==valueStats.str+valueStats.agi+valueStats.intelligence) {
                flag = true;}



        }

        return valueStats ;
    }

    public Char runChar() {
        this.chooseClass();
        this.selectStats();


        return valueStats;
    }


}








