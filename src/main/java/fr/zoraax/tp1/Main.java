package fr.zoraax.tp1;

import fr.zoraax.tp1.exercice5.NombreRomain;
import fr.zoraax.tp1.exercice6.Majorite;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        System.out.println("Exo 6 ");

        int[] array = new int[]{1, 1, 2, 2, 2, 2, 1};

        System.out.println(Majorite.getMajorite(array));
    }
}
