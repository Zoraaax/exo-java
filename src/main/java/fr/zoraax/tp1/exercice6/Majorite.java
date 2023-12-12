package fr.zoraax.tp1.exercice6;

import java.util.HashMap;

public class Majorite {

    /**
     * Retourne un booleaen si le tableau contient une majorité de la même valeur ou si il n'en contient pas.
     * @param value
     * @return trouverMajorite()
     */
    public static boolean getMajorite(int[] value) {

        verifierLongueurTableau(value.length);
        verifierSiLeTableauContientValeurCorrect(value);

        return trouverMajorite(value);
    }

    /**
     * Vérifie si la HashMap contient une majorité de la même valeur.
     * @param value
     * @return Un boolean si il y a une majorité ou non.
     */
    private static boolean trouverMajorite(int[] value) {

        HashMap<Integer, Integer> map = ajouterNombreDuTableau(value);

        for (int valeur : map.keySet()) {
            if (map.get(valeur) > value.length / 2) {
                System.out.println("La majorité est : " + valeur);
                return true;
            }
        }

        System.out.println("Il n'y a pas de majorité.");
        return false;
    }

    /**
     * Ajoute les valeurs du tableau dans une HashMap pour qu'elle puisse être traité par la suite.
     * @param value
     * @return Une HashMap avec les valeurs du tableau.
     */
    private static HashMap<Integer, Integer> ajouterNombreDuTableau(int[] value) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int valeur : value) {
            if (map.containsKey(valeur)) {
                map.put(valeur, map.get(valeur) + 1);
            } else {
                map.put(valeur, 1);
            }
        }
        return map;
    }

/**
     * Vérifie si la longueur du tableau est correct.
     * @param taille
     * @throws IllegalArgumentException
     */
    private static void verifierLongueurTableau(int taille) throws IllegalArgumentException {
        if (taille > 50000 || taille <= 0) {
            throw new IllegalArgumentException("La longueur du tableau est incorrect, elle doit être entre 1 et 50000");
        }
    }

    /**
     * Vérifie si le tableau contient des valeurs correct.
     * @param array
     * @throws IllegalArgumentException
     */
    private static void verifierSiLeTableauContientValeurCorrect(int[] array) {
        for (int valeur : array) {
            if (valeur < -1000000000 || valeur > 50000) {
                throw new IllegalArgumentException("Le tableau contient une valeur hors de la plage autorisée.");
            }
        }
    }
}
