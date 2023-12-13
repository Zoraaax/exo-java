package fr.zoraax.demos.heritage;

import java.time.LocalDate;
import java.time.Period;

public class Stagiaire extends Collaborateur {

    public Stagiaire(String nom, String prenom, LocalDate dateNaissance, LocalDate debutContrat, LocalDate finContrat) {
        super(nom, prenom, dateNaissance, debutContrat, finContrat);
    }

    /**
     * Indique ce que fait le stagiaire
     */
    public void travailler() {
        System.out.println(this.nom + this.prenom + " Travaille mais pour combien de temps avant de tout casser ?");
    }

    /**
     * Indique la durée du stage en nombre de jours
     * @return int - Nombre de jours
     */
    public int getDureeStage() {
        return Period.between(debutContrat, finContrat).getDays();
    }
}
