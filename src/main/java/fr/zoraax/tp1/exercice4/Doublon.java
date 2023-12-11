package fr.zoraax.tp1.exercice4;

import java.util.Scanner;
import java.util.HashMap;

public class Doublon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau : ");
        int size = input.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Entrez la valeur n°" + (i + 1) + " : ");
            array[i] = input.nextInt();
        }

        containsDoublonWithHashmap(array);
    }

    private static boolean containsDoublonWithHashmap(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int index;

        for (index = 0; index < array.length; index++) {
            if (map.containsKey(array[index])) {
                System.out.println("Le tableau contient un doublon : " + array[index]);
                return true;
            } else {
                map.put(array[index], index);
            }
        }

        System.out.println("Le tableau ne contient pas de doublon");
        return false;
    }
}
