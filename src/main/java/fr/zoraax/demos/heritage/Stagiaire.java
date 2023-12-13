package fr.zoraax.demos.heritage;

import java.time.LocalDate;
import java.time.Period;

public class Stagiaire extends Personne {
    private LocalDate debutStage;
    private LocalDate finStage;

    public Stagiaire(String nom, String prenom, LocalDate dateNaissance, LocalDate debutStage, LocalDate finStage) {
        super(nom, prenom, dateNaissance);
        this.debutStage = debutStage;
        this.finStage = finStage;
    }

    public LocalDate getDebutStage() {
        return this.debutStage;
    }

    public void setDebutStage(LocalDate debutStage) {
        this.debutStage = debutStage;
    }

    public LocalDate getFinStage() throws Exception {
        if (this.finStage == null) {
            throw new Exception("Le stage n'est pas encore fini michel");
        }

        return this.finStage;
    }

    public void setFinStage(LocalDate finStage) {
        this.finStage = finStage;
    }

    /**
     * Indique ce que fait le stagiaire
     */
    public void travailler() {
        System.out.println(this.nom + this.prenom + " Travaille mais pour combien de temps avant de tout casser ?");
    }

    /**
     * Mets fin prématurement au stage
     */
    public void licencier() {
        this.finStage = LocalDate.now();
        System.out.println(this.nom + this.prenom + " est licencié, il a fait crash les serveurs en débranchant la mauvaise prise");
    }

    /**
     * Indique la durée du stage en nombre de jours
     * @return int - Nombre de jours
     */
    public int getDureeStage() {
        return Period.between(this.debutStage, this.finStage).getDays();
    }
}
