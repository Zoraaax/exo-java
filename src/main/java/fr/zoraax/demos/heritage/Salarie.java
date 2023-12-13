package fr.zoraax.demos.heritage;

import java.time.LocalDate;

public class Salarie extends Collaborateur {
    public static final int HEURES_TRAVAILLEES_MENSUEL_NORMAL = 151;
    private double tauxHoraireBrut;

    public Salarie(
            String nom,
            String prenom,
            LocalDate dateNaissance,
            double tauxHoraireBrut,
            LocalDate debutContrat
    ) {
        super(nom, prenom, dateNaissance, debutContrat, null);
        this.tauxHoraireBrut = tauxHoraireBrut;
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

    @Override
    public void licencier(LocalDate dateDeFin) {
        super.licencier(dateDeFin);
    }

    public double payerSalaireMensuelBrut() {
        return this.payerSalaireMensuelBrut(HEURES_TRAVAILLEES_MENSUEL_NORMAL);
    }

    @Override
    public void travailler() {
        System.out.println(this.nom + this.prenom + "Travaille dur");
    }

    @Override
    public String toString() {
        return "Le salarié s'appelle " + this.nom + ' ' + this.prenom;
    }
}
