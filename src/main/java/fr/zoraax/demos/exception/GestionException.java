package fr.zoraax.demos.exception;

public class GestionException {
    public static void main(String[] args) throws MonExceptionPersoException {
        int dividende = 0;
        int diviseur = 0;

        try {
            int resultat = dividende / diviseur;
            System.out.println("Le résultat est : " + resultat);
        } catch (ArithmeticException error) {
            throw new MonExceptionPersoException("Claqué au sol le code");
        } finally {
            System.out.println("ça marche pas on s'en fout");
        }
    }
}
