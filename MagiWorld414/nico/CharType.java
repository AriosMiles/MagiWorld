package com.ocr.nico;

import java.util.InputMismatchException;
import java.util.Scanner;

class CharType {

    Char valueStats;

    /**
     * Create a new Character
     */

    public Char chooseClass() {
        System.out.println("Veuillez choisir votre classe : 1-Guerrier, 2-Mage, 3-Rôdeur");

        Scanner sc = new Scanner(System.in);
        try {
            int val = sc.nextInt();


            if (val == 1) {
                System.out.println("Vous avez choisis Guerrier!");
                return valueStats = new Guerrier();
            } else if (val == 2) {
                System.out.println("Vous avez choisis Mage!");

                return valueStats = new Mage();
            } else if (val == 3) {
                System.out.println("Vous avez choisis Rôdeur!");
                return valueStats = new Rodeur();
            } else {
                System.out.println("Valeur incorrecte ");
                return chooseClass();
            }
        } catch (InputMismatchException e) {
            System.out.println("Veuillez n'entrer que des chiffres. ");
            return chooseClass();
        }
    }


    public Char selectStats() {


        Scanner sc = new Scanner(System.in);
        valueStats.lvl = 1;                                                                                              //Ici je met le lvl a 1 afin de lancer ma condition
        while (valueStats.lvl != valueStats.str + valueStats.agi + valueStats.intelligence) {
            System.out.println("La somme de vos statistiques doit être égale a votre niveau de personnage !");

/** @p4 = determine les valeurs des stats
 * @valueStats = valeur enregistré pour le personnage
 * */
            int p4;


            try {
                System.out.println("Veuillez choisir votre niveau (1-100)");
                p4 = sc.nextInt();
                if (p4 <= 0) {
                    System.out.println("Le niveau doit être positif.");
                    return selectStats();
                }

                if (p4 > 100) {                                                                                           //Si le lvl est > a 100 , set le lvl a 100
                    System.out.println("Le niveau maximum est 100.");
                    p4 = 100;
                }
                valueStats.setLvl(p4);
                System.out.println("Votre force?");
                p4 = sc.nextInt();
                if (p4 < 0) {
                    System.out.println("Les statistiques ne peuvent être négative.");
                    return selectStats();
                }

                valueStats.setStr(p4);
                System.out.println("Votre agilité?");
                p4 = sc.nextInt();
                if (p4 < 0) {
                    System.out.println("Les statistiques ne peuvent être négative.");
                    return selectStats();
                }
                valueStats.setAgi(p4);
                System.out.println("Votre intelligence?");
                p4 = sc.nextInt();
                if (p4 < 0) {
                    System.out.println("Les statistiques ne peuvent être négative.");
                    return selectStats();
                }
                valueStats.setIntelligence(p4);

                valueStats.vit = 5 * valueStats.lvl;

            } catch (InputMismatchException e) {
                System.out.println("Vous pouvez seulement entrer des nombres !");
                return selectStats();
            }


        }

        return valueStats;
    }

    public Char runChar() {
        this.chooseClass();
        this.selectStats();
        return valueStats;
    }


}









