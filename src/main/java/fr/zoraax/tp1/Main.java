package fr.zoraax.tp1;

import fr.zoraax.tp1.exercice5.NombreRomain;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        String roman = "MMIIVVIII";
        System.out.println(NombreRomain.getRomanNumber(roman));
    }
}
