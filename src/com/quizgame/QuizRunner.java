package com.quizgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizRunner {
    public static void main(String[] args) {

        Verbes verbes = new Verbes();
        Definition definition =new Definition();

        //System.out.println(verbes.str.length);//212
        //System.out.println(definition.defini.length);//212

        List <String> verbesList= new ArrayList<>();

        for (int i = 0; i <verbes.str.length ; i++) {
            verbesList.add(verbes.str[i]);
        }
        //System.out.println(verbesList.size());//212

        List <String> definitionList= new ArrayList<>();

        for (int i = 0; i <definition.defini.length ; i++) {
            definitionList.add(definition.defini[i]);

        }
        //System.out.println(definitionList.size());//212

        int questions;
        String reponse ;
        int compteur= 0;
        int points = 0;
        int compteur2= 0;
        Scanner scanner = new Scanner(System.in);
        String nDQ="";//nobreDeQuestions
        int nobreDeQuestions=0;


        do {
            do{
                System.out.println("Combien de questions souhaitez-vous pour ce quiz?");
                System.out.println("Saisissez un nombre entre 5 et 15");
                nDQ = scanner.nextLine();
            }while (!(LesMethods.estComposéUniquementDeNombres(nDQ)));

            nobreDeQuestions = Integer.parseInt(nDQ);

        }
        while (!(nobreDeQuestions<=212&nobreDeQuestions>=5));


        int definitionSize= definitionList.size();

        for (int i = 0; i < nobreDeQuestions ; i++) {//nobreDeQuestions

            questions = (int) (Math.random() * (definitionSize-1-i));
            //questions=193;//pour les tests
            do {
                System.out.println(definitionList.get(questions));
                System.out.println("appuyez sur 1 pour obtenir un indice, sinon appuyez sur n'importe quelle touche");
                String harfIsteme = scanner.nextLine();
                if (harfIsteme.equals("1")) {
                    if (compteur2 == 0) {
                        System.out.println((verbesList.get(questions)).substring(0, 1));
                        compteur2++;
                    } else if (compteur2 == 1) {
                        System.out.println((verbesList.get(questions)).substring(1, 2));
                        compteur2++;
                    } else if (compteur2 == 2) {
                        System.out.println((verbesList.get(questions)).substring(2, 3));
                        compteur2++;
                    } else {
                        int yardim = (int) (Math.random() * 4 + verbesList.get(questions).length()-3);
                        System.out.println((verbesList.get(questions)).substring(yardim - 1, yardim));
                        compteur2++;
                    }
                }
                System.out.println("Saisissez votre réponse");
                reponse = scanner.nextLine();
                compteur++;
                reponse = reponse.toUpperCase();
                if (compteur == 6) {
                    System.out.println(verbesList.get(questions));
                    System.out.println(((6 - compteur) * 10) - compteur2 * 5-30 + " points.");
                    points -= 30;
                    System.out.println("");
                }
            } while (!verbesList.get(questions).equals(reponse)&&compteur<6);

            if (verbesList.get(questions).equals(reponse)) {
                System.out.println("Vous l'avez obtenu à votre "+compteur + "ème essai.");
                System.out.println(((6 - compteur) * 10) - compteur2 * 5 + " points.");
                System.out.println("");
            }

            points += ((6 - compteur) * 10) - compteur2 * 5;
            compteur2 = 0;
            compteur = 0;

            verbesList.remove(questions);
            definitionList.remove(questions);
            //compteurtest++;
        }
        System.out.println("Votre score total: "+points);
        //System.out.println(compteurtest)



    }
}
