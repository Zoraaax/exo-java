package fr.zoraax.tp1.exercice3;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entrez un nombre afin de vérifier si c'est un palindrome : ");
        int inputValue = input.nextInt();

        isPalindrome(inputValue);
    }

    private static boolean isPalindrome(int value) {
        int palindromeValue = value;
        int somme = 0;

        while (palindromeValue != 0) {
           int newPalindromeValue = palindromeValue % 10;
            somme = somme * 10 + newPalindromeValue;
            palindromeValue /= 10;
        }

        if (somme == value) {
            System.out.println(value + "est un palindrome");
            return true;
        } else {
            System.out.println(value + "n'est pas un palindrome");
            return false;
        }
    }
}
