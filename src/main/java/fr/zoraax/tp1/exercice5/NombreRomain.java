package fr.zoraax.tp1.exercice5;

import java.util.HashMap;
public class NombreRomain {

    /**
     * Vérifie si la valeur indiqué est bien valide et ensuite calcule la valeur saisie en nombre arabe.
     * @param value
     * @return Le calcul de la valeur romaine en arabe
     * @throws IllegalArgumentException
     */
    public static int getRomanNumber(String value) throws IllegalArgumentException {

        verifieSiInputEstValide(value);

        return calculerNombreRomainEnNombreArabe(value);
    }

    /**
     * Calcul la conversion nombre romain en nombre arabe pour donner la valeur du nombre romain en nombre arabe
     * @param roman
     * @return Le résultat du calcul
     */
    private static int calculerNombreRomainEnNombreArabe(String roman) {
        HashMap map = convertiNombreRomainEnNombreArabe();
        int result = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            String key = roman.substring(i, i + 1);
            int value = (int) map.get(key);

            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }
            prevValue = value;
        }

        return result;
    }

    /**
     * Converti les nombres romains en nombres arabes
     * @return La HashMap contenant les nombres romains et arabes
     */
    private static HashMap convertiNombreRomainEnNombreArabe() {
        HashMap<String, Integer> romanToArabe = new HashMap<String, Integer>();
        romanToArabe.put("I", 1);
        romanToArabe.put("V", 5);
        romanToArabe.put("X", 10);
        romanToArabe.put("L", 50);
        romanToArabe.put("C", 100);
        romanToArabe.put("D", 500);
        romanToArabe.put("M", 1000);
        return romanToArabe;
    }

    /**
     * Lève une Exception si l'entrée utilisateur est inférieur ou égale à 0 ou supérieur à 15
     * @param input
     * @throws IllegalArgumentException
     */
    private static void verifieSiInputEstValide(String input) throws IllegalArgumentException {
        if (input.length() > 15 || input.length() == 0) {
            throw new IllegalArgumentException("La valeur d'entrée doit être comprise entre 1 et 15 caractères");
        }
    }
}
