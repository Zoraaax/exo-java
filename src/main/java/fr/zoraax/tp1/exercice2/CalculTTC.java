package fr.zoraax.tp1.exercice2;

import fr.zoraax.tp1.exercice2.exception.NegativeNumberException;

import java.util.Scanner;

public class CalculTTC {
    public static void main(String[] args) throws NegativeNumberException {

        Scanner input = new Scanner(System.in);

        System.out.println("Indiquez un prix HT");
        float prixHt = input.nextFloat();

        try {
            calculTTC(prixHt);
        } catch (NegativeNumberException error) {
            System.out.println(error.getMessage());
        }
    }

    private static void calculTTC(float prix) throws NegativeNumberException {
        if (prix < 0) {
            throw new NegativeNumberException("Le nombre saisi doit être supérieur à 0");
        }

        final float TTC;

        TTC = (float) (prix * 1.2);

        System.out.println("Le prix TTC du nombre saisi est : " + TTC);
    }
}
