/*
TP1 Exrcice 2
Convertisseur de température
13/09/2023
*/
package tp1_convertisseur;

import java.util.Scanner;

/**
 *
 * @author Emma
 */
public class TP1_convertisseur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Demande et affichage d'un double
        Scanner demande1 = new Scanner(System.in);
        System.out.println("Entrer un nombre Réel :");
        double nb = demande1.nextDouble(); //récupération du double
        System.out.println("La valeur rentrée est : " + nb );
    }
    
}
