package Supdeco;

import Supdeco.Modele.Etudiant;

public class Main {

    public static void main(String[] args ){

        System.out.printf("Gestion des Etudiants \n");

        Etudiant e1 = new Etudiant("Gueye","El hadji","Elhadj@gmail.com","A2265");
        System.out.printf(e1.toString());
    }
}
