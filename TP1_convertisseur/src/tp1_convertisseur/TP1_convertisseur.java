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
        //Demande du type de température à convertir
        Scanner demande = new Scanner(System.in);
        System.out.println("""
                           Quelle température voulez vous convertir : 
                           1)Celcius
                           2)Kelvin
                           3)Farenheit
                           """);
        int type1 = demande.nextInt(); //récupération du type

        // En quoi le convertir
        System.out.println("""
                           En quelle température voulez vous la convertir : 
                           1)Celcius
                           2)Kelvin
                           3)Farenheit
                           """);
        int type2 = demande.nextInt(); //récupération du type

        // La température
        System.out.println("Donnez la température");
        double temp = demande.nextDouble(); //récupération de la température

        if (type1 == type2) {
            System.out.println("La température est déjà dans la bonne unité de mesure.");
        } else {
            switch (type1) {
                case 1 -> {
                    if (type2 == 2) {
                        System.out.println(temp + " celcius fait " + CelciusVersKelvin(temp) + " kelvin.");
                    } else {
                        System.out.println(temp + " celcius fait " + CelciusVersFarenheit(temp) + " Farenheit.");
                    }
                    break;
                }
                case 2 -> {
                    if (type2 == 1) {
                        System.out.println(temp + " kelvin fait " + KelvinVersCelcius(temp) + " celcius.");
                    } else {
                        System.out.println(temp + " kelvin fait " + KelvinVersFarenheit(temp) + " Farenheit.");
                    }
                    break;
                }
                case 3 -> {
                    if (type2 == 1) {
                        System.out.println(temp + " Farenheit fait " + FarenheitVersCelcius(temp) + " celcius.");
                    } else {
                        System.out.println(temp + " Farenheit fait " + FarenheitVersKelvin(temp) + " kelvin.");
                    }
                    break;
                }

            }

        }

    }

    public static double CelciusVersKelvin(double tCelcius) {
        return tCelcius + 274.1;
    }

    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 274.1;
    }

    public static double FarenheitVersCelcius(double tFarenheit) {
        return (tFarenheit - 32) * 5.0 / 9.0;
    }

    public static double CelciusVersFarenheit(double tCelcius) {
        return (tCelcius * 9.0 / 5.0) + 32;
    }

    public static double KelvinVersFarenheit(double tKelvin) {
        return CelciusVersFarenheit(KelvinVersCelcius(tKelvin));
    }

    public static double FarenheitVersKelvin(double tFarenheit) {
        return CelciusVersKelvin(FarenheitVersCelcius(tFarenheit));
    }

}
