package com.ocr.nico;


import java.util.Scanner;

class Fight {
    private Char p1;
    private Char p2;


    Fight(Char p1, Char p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    private boolean pureFight(Char p1, Char p2) {
        boolean flag = false;

        while (flag == false) {
            System.out.println("Choisissez votre attaque");


            try {
                Scanner sc = new Scanner(System.in);
                int atkp1 = sc.nextInt();

                if (atkp1 < 1 || atkp1 > 2) {
                    System.out.println("Cette attaque n'existe pas");
                } else if (atkp1 == 1) {
                    p1.basicAtk(p2);
                } else p1.specialAtk(p2);


            } catch (Exception e) {
                System.out.println("Caractere invalide");

             }
             flag = true;
        }



        if (p2.getVit() <= 0)
            return true;

        else  {
            pureFight(p2, p1);
        }

        return false;
    }

    public void startFight() {

        while (pureFight(p1, p2)) {
            if (p2.getVit() <= 0) {
                break;
            }
             else pureFight(p2, p1);

        }

        if (p1.getVit() <= 0) {
            System.out.println("Le joueur 2 gagne ce choc des titans!");

        } else if (p2.getVit() <= 0) {
            System.out.println("Le joueur 1 l'emporte!");

        } else startFight();

    }
}

