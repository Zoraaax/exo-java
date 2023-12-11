package fr.zoraax.tp1.exercice1;
import fr.zoraax.tp1.exercice1.exception.SuperieurAVingtException;
import java.util.Scanner;

public class Moyenne {
    public static void main(String[] args) throws SuperieurAVingtException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir le premier nombre : ");
        int nombre1 = scanner.nextInt();

        System.out.println("Veuillez saisir le deuxième nombre : ");
        int nombre2 = scanner.nextInt();

        System.out.println("Veuillez saisir le troisième nombre : ");
        int nombre3 = scanner.nextInt();

        try {
            calculerMoyenne(nombre1, nombre2, nombre3);
        } catch (SuperieurAVingtException error) {
            System.out.println(error.getMessage());
        }
    }
    private static void calculerMoyenne(int nombre1, int nombre2, int nombre3) throws SuperieurAVingtException {
        if (nombre1 > 20 || nombre2 > 20 || nombre3 > 20) {
            throw new SuperieurAVingtException("Un des nombres est supérieur à 20");
        }

        final int MOYENNE = (nombre1 + nombre2 + nombre3) / 3;
        System.out.println("La moyenne est de : " + MOYENNE);
    }
}

