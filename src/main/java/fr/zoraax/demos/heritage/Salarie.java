package fr.zoraax.demos.heritage;

import java.time.LocalDate;
import java.time.Period;

public class Salarie extends Personne {
    public static final int HEURES_TRAVAILLEES_MENSUEL_NORMAL = 151;
    private double tauxHoraireBrut;
    private LocalDate debutContrat;
    private LocalDate finContrat;

    public Salarie(
            String nom,
            String prenom,
            LocalDate dateNaissance,
            double tauxHoraireBrut,
            LocalDate debutContrat
    ) {
        super(nom, prenom, dateNaissance);
        this.tauxHoraireBrut = tauxHoraireBrut;
        this.debutContrat = debutContrat;
    }

    public double getTauxHoraireBrut() {
        return this.tauxHoraireBrut;
    }

    public void setTauxHoraireBrut(double tauxHoraireBrut) throws IllegalArgumentException {
        if (tauxHoraireBrut < 20) {
            throw new IllegalArgumentException("On est des radin mais pas à ce point");
        }

        this.tauxHoraireBrut = tauxHoraireBrut;
    }

    public LocalDate getDebutContrat() {
        return this.debutContrat;
    }

    public void setDebutContrat(LocalDate debutContrat) {
        this.debutContrat = debutContrat;
    }

    public LocalDate getFinContrat() throws Exception {
        if (finContrat == null) {
            throw new Exception("Le salarié n'est pas (encore) licencié !");
        }

        return this.finContrat;
    }

    public void setFinContrat(LocalDate finContrat) {
        this.finContrat = finContrat;
    }

    /**
     * Paie le salarié en fonction du temps passé à travailler
     * @param heuresTravaillees
     * @return double - heuresTravaillees
     * @throws IllegalArgumentException
     */
    public double payerSalaireMensuelBrut(double heuresTravaillees) throws IllegalArgumentException {
        if (heuresTravaillees < 0) {
            throw new IllegalArgumentException("Il avait la flemme");
        }

        if (estTermine()) {
            throw new IllegalArgumentException("Il est viré");
        }

        return calculerSalaire(heuresTravaillees);
    }

    /**
     * Calcule le saire en fonction du temps travaillé
     * Applique un taux spécifique aux heures effectuées au-delà de 151 heures
     * @param heuresTravaillees double - Nombre d'heures travaillées
     * @return double - LA THUNE
     */
    private double calculerSalaire(double heuresTravaillees) {
        if (heuresTravaillees > HEURES_TRAVAILLEES_MENSUEL_NORMAL) {
            double salaire = 0;
            salaire += HEURES_TRAVAILLEES_MENSUEL_NORMAL * this.tauxHoraireBrut;
            salaire += (heuresTravaillees - HEURES_TRAVAILLEES_MENSUEL_NORMAL) * this.tauxHoraireBrut;

            return salaire;
        }

        return heuresTravaillees * this.tauxHoraireBrut;
    }

    public double payerSalaireMensuelBrut() {
        return this.payerSalaireMensuelBrut(HEURES_TRAVAILLEES_MENSUEL_NORMAL);
    }

    /**
     * Vérifie si le salarié n'est plus présent dans les entreprises
     * @return Vrai si le salarié n'est plus dans les effectifs
     */
    private boolean estTermine() {
        return this.finContrat != null && this.finContrat.isBefore(LocalDate.now());
    }

    public void travailler(int heuresTravaillees) {
        System.out.println(this.nom + this.prenom + "Travaille dur");
    }

    public void licencier(LocalDate dateDeFin) {
        this.finContrat = dateDeFin;
        System.out.println(this.nom + this.prenom + "T'es viré");
    }

    @Override
    public String toString() {
        return "Le salarié s'appelle " + this.nom + ' ' + this.prenom;
    }
}
