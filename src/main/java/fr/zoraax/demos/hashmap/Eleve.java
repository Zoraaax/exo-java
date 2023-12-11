package fr.zoraax.demos.hashmap;

public class Eleve {
    public String nom;
    public String prenom;
    public String classe;

    public Eleve(String nom, String prenom, String classe) {
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
    }

    public String getClasse() {
        return this.classe;
    }
}
