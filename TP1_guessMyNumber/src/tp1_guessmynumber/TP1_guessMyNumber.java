/*
TP1 Exercice 3
Création d'un jeu de devine nombre
22/09/2023
*/
package tp1_guessmynumber;

import java.util.Random;

/**
 *
 * @author Emma Cunienq
 */
public class TP1_guessMyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random generateurAleat = new Random();
        int n1 = generateurAleat.nextInt(100);
        int n2 = generateurAleat.nextInt(100);
        int n3 = generateurAleat.nextInt(100);
        int n4 = generateurAleat.nextInt(100);
        int n5 = generateurAleat.nextInt(100);
        System.out.println(n1 + "\n" + n2 + "\n"  + n3 + "\n" + n4 + "\n" + n5);
    }
    
}
