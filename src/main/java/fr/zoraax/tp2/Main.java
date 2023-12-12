package fr.zoraax.tp2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Thermometre thermometre = new Thermometre();
        Scanner input = new Scanner(System.in);

        System.out.println("Saisissez la temperature en celsius");
        double temperature = input.nextDouble();

        System.out.println("Saisissez l'unité de conversion (C, K ou F)");
        char unite = input.next().charAt(0);

        thermometre.setTemperature(temperature, unite);
    }
}
