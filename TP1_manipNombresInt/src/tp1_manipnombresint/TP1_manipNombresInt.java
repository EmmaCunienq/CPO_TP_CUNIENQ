/*
TP1 Exercice 1
Manipulation de nombres entiers
13/09/2023
*/
package tp1_manipnombresint;

import java.util.Scanner;

/**
 *
 * @author Emma
 */
public class TP1_manipNombresInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Demande de deux entiers
        Scanner demande1 = new Scanner(System.in);
        System.out.println("Entrer le premier nombre :");
        int nb1 = demande1.nextInt(); //récupération de l'entier n°1
        
        Scanner demande2 = new Scanner(System.in);
        System.out.println("Entrer le deuxième nombre :");
        int nb2 = demande2.nextInt(); //récupération de l'entier n°2
        
        //Affichage des nombres
        System.out.println("premier nombre : " + nb1);
        System.out.println("second nombre : " + nb2);
        
        //Affichage de la somme
        System.out.println("somme : " + (nb2 + nb1));
        
        //Affichage de la différence
        System.out.println("différence : " + (nb2 - nb1));
        
        //Affichage du produit
        System.out.println("produit : " + (nb2 * nb1));
        
        //Affichage du quotient entier et reste
        System.out.println("quotient : " + (nb1 / nb2));
        System.out.println("reste : " + (nb1 % nb2));
        
        
        
    }
    
}
