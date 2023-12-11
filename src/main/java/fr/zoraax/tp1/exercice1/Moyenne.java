package fr.zoraax.tp1.exercice1;

public class Moyenne {
    public static double getMoyenne(double[] notes) throws IllegalArgumentException {

        verifierSiContientTroisNotes(notes);

        verifierSiNotesCorrectes(notes);

        return calculerMoyenne(notes);
    }

    /**
     * Calcule la moyenne en fonction des notes saisies
     * @param notes doubles - notes
     * @return double - la moyenne de l'élève
     */
    private static double calculerMoyenne(double[] notes) {
        double somme = 0;

        for (double note: notes) {
            somme += note;
        }

        return somme / notes.length;
    }

    /**
     * Vérifie si toutes les notes sont bien comprise entre 0 et 20
     * @param notes
     * @throws IllegalArgumentException
     */
    private static void verifierSiNotesCorrectes(double[] notes) throws IllegalArgumentException {
        for (double note: notes) {
            if (note < 0 || note > 20) {
                throw new IllegalArgumentException("Les notes doivent être comprise entre 0 et 20");
            }
        }
    }

    /**
     * Lève une exception si le nombre de notes est différent de trois.
     * @param notes
     * @throws IllegalArgumentException
     */
    private static void verifierSiContientTroisNotes(double[] notes) throws IllegalArgumentException {
        if (notes.length != 3) {
            throw new IllegalArgumentException("Il doit y avoir 3 notes");
        }
    }
}

