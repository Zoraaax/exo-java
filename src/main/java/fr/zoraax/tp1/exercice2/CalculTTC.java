package fr.zoraax.tp1.exercice2;

import fr.zoraax.tp1.exercice2.exception.NegativeNumberException;

import java.util.Scanner;

public class CalculTTC {
    public static void main(String[] args) throws NegativeNumberException {

        Scanner input = new Scanner(System.in);

        System.out.println("Indiquez un prix HT");
        float prixHt = input.nextFloat();

        System.out.println(getPrixTTC(prixHt));

    }

    /**
     * Récupère le prix TTC
     * @param prix
     * @return float prix * 1.20
     * @throws NegativeNumberException
     */
    private static float getPrixTTC(float prix) throws NegativeNumberException {
        verificationSiPrixEstSuperieurAZero(prix);

        return calculPrixTTC(prix);
    }

    /**
     * Calcul le prix TTC par rapport au prix HT saisi
     * @param prix
     * @return Le prix TTC
     */
    private static float calculPrixTTC(float prix) {
        final float TTC;

        TTC = (float) (prix * 1.2);

        return TTC;
    }
    /**
     * Lève une Exception si le nombre est négatif
     * @param prix
     * @throws NegativeNumberException
     */
    private static void verificationSiPrixEstSuperieurAZero(float prix) throws NegativeNumberException {
        if (prix < 0) {
            throw new NegativeNumberException("Le nombre saisi doit être supérieur à 0");
        }
    }
}
