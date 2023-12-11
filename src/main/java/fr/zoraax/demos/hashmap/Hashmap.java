package fr.zoraax.demos.hashmap;
import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        Eleve[] eleves = new Eleve[5];
        eleves[0] = new Eleve("Cule", "Jean", "Java");
        eleves[1] = new Eleve("Terieur", "Alain", "React");
        eleves[2] = new Eleve("Bon", "Jean", "Angular");
        eleves[3] = new Eleve("Michel", "Jean", "Angular");
        eleves[4] = new Eleve("Gerard", "Jean", "Java");

        compteurAvecHashmap(eleves);
    }

    public static void compteurSansHashmap(Eleve[] eleves) {
        int elevesJava = 0;
        int elevesReact = 0;
        int elevesAngular = 0;

        for(Eleve eleve: eleves) {
            if (eleve.getClasse().equals("Java")) {
                elevesJava++;
            } else if (eleve.getClasse().equals("React")) {
                elevesReact++;
            } else if (eleve.getClasse().equals("Angular")) {
                elevesAngular++;
            }
        }

        System.out.println("Il y a " + elevesJava + " élèves en Java");
        System.out.println("Il y a " + elevesReact + " élèves en React");
        System.out.println("Il y a " + elevesAngular + " élèves en Angular");
    }

    public static void compteurAvecHashmap(Eleve[] eleves) {
        HashMap<String, Integer> elevesParClasse = new HashMap<>();

        for (Eleve eleve: eleves) {
            if (elevesParClasse.containsKey(eleve.getClasse())) {
                elevesParClasse.put(eleve.getClasse(), elevesParClasse.get(eleve.getClasse()) + 1);
            } else {
                elevesParClasse.put(eleve.getClasse(), 1);
            }
        }

        System.out.println("Il y a " + elevesParClasse.get("Java") + " élèves en Java");
        System.out.println("Il y a " + elevesParClasse.get("React") + " élèves en React");
        System.out.println("Il y a " + elevesParClasse.get("Angular") + " élèves en Angular");
    }
}
