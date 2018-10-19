package com.ocr.nico;



import java.util.Scanner;

class Fight {


    Fight(Char p1, Char p2) {
        System.out.println("Que le combat commence !");

        while (p1.vit >= 0 || p2.vit >= 0) {

            System.out.println("Joueur 1 (" + p1.vit + "point de vie)." + "Veuillez choisir votre action (1:Attaque Basique, 2:Attaque Spécial)");
            Scanner sc = new Scanner(System.in);
            int atkp1 = sc.nextInt();

            if (atkp1 < 1 || atkp1 > 2) {
                System.out.println("Cette attaque n'existe pas");
            }

            else if (atkp1 == 1) {
                p1.basicAtk(p2);
            }

            else p1.specialAtk(p2);

            if (p2.vit <= 0) {
                System.out.println("Joueur 2 a perdu !");
            break;}




                System.out.println("Au tour du joueur 2.");

                System.out.println("Joueur 2 (" + p2.vit + "point de vie)." + "Veuillez choisir votre action (1:Attaque Basique, 2:Attaque Spécial)");




                int atkp2 = sc.nextInt();

                if (atkp2 < 1 || atkp2 > 2) {
                    System.out.println("Cette attaque n'existe pas");
                } else if (atkp2 == 1) {
                    p2.basicAtk(p1);
                } else p2.specialAtk(p1);

                if (p1.vit <= 0) {
                    System.out.println("Joueur 1 a perdu !");
                    break;


                }

            }
        }
    }

