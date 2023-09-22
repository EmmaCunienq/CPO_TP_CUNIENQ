/*
TP0 Exercice 1
MRG
13/09/2023
 */
package tp0_helloword;

import java.util.Scanner;

/**
 *
 * @author iut
 */
public class TP0_helloWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bonjour");
        System.out.println("Au revoir");
        int i = 20;

        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Quel est votre prénom ?");
        prenom = sc.nextLine();
        System.out.println(prenom);
    }

}
