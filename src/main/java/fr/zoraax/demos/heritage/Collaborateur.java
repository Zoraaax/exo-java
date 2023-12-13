package fr.zoraax.demos.heritage;

import java.time.LocalDate;
import java.time.Period;

public abstract class Collaborateur {
    protected String nom;
    protected String prenom;
    protected LocalDate dateNaissance;
    protected LocalDate debutContrat;
    protected LocalDate finContrat;

    public Collaborateur(String nom, String prenom, LocalDate dateNaissance, LocalDate debutContrat, LocalDate finContrat) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.debutContrat = debutContrat;
        this.finContrat = finContrat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public int getAge() {
        return Period.between(dateNaissance, LocalDate.now()).getYears();
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
     * La personne danse ! Super !
     */

    public abstract void travailler();

    public void licencier(LocalDate dateDeFin) {
        this.finContrat = dateDeFin;
        System.out.println("VIRÉ");
    }

    /**
     * Vérifie si le salarié n'est plus présent dans les entreprises
     * @return Vrai si le salarié n'est plus dans les effectifs
     */
    protected boolean estTermine() {
        return this.finContrat != null && this.finContrat.isBefore(LocalDate.now());
    }
}
