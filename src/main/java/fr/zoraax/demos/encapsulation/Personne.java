package fr.zoraax.demos.encapsulation;

import java.time.LocalDate;
import java.time.Period;

public class Personne {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;

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
        return Period.between(this.dateNaissance, LocalDate.now()).getYears();
    }
}
