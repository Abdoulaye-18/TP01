package Supdeco;

import Supdeco.Modele.Etudiant;

public class Main {

    public static void main(String[] args ){

        System.out.printf("Gestion des Etudiants \n");

        Etudiant e1 = new Etudiant(1,"Gueye","El hadji",12);
        System.out.printf(e1.toString());
    }
}
