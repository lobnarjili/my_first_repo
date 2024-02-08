class Noeud {
    int valeur;
    Noeud gauche, droite;

    public Noeud(int valeur) {
        this.valeur = valeur;
        gauche = droite = null;
    }
}

public class ArbreBinaireRecherche {
    private Noeud racine;

    public ArbreBinaireRecherche() {
        this.racine = null;
    }

    public void inserer(int valeur) {
        racine = insererRecursive(racine, valeur);
    }

    private Noeud insererRecursive(Noeud racine, int valeur) {
        if (racine == null) {
            return new Noeud(valeur);
        }

        if (valeur < racine.valeur) {
            racine.gauche = insererRecursive(racine.gauche, valeur);
        } else if (valeur > racine.valeur) {
            racine.droite = insererRecursive(racine.droite, valeur);
        }

        return racine;
    }

    public void supprimer(int valeur) {
        racine = supprimerRecursive(racine, valeur);
    }

    private Noeud supprimerRecursive(Noeud racine, int valeur) {
        if (racine == null) {
            return racine;
        }

        if (valeur < racine.valeur) {
            racine.gauche = supprimerRecursive(racine.gauche, valeur);
        } else if (valeur > racine.valeur) {
            racine.droite = supprimerRecursive(racine.droite, valeur);
        } else {
            if (racine.gauche == null) {
                return racine.droite;
            } else if (racine.droite == null) {
                return racine.gauche;
            }

            racine.valeur = minimumValeur(racine.droite);
            racine.droite = supprimerRecursive(racine.droite, racine.valeur);
        }

        return racine;
    }

    private int minimumValeur(Noeud racine) {
        int minValue = racine.valeur;
        while (racine.gauche != null) {
            minValue = racine.gauche.valeur;
            racine = racine.gauche;
        }
        return minValue;
    }

    public void afficher() {
        System.out.print("Elements de l'arbre en ordre croissant: ");
        afficherEnOrdre(racine);
        System.out.println();
    }

    private void afficherEnOrdre(Noeud racine) {
        if (racine != null) {
            afficherEnOrdre(racine.gauche);
            System.out.println();
            System.out.print(racine.valeur + " ");
            System.out.println();
            afficherEnOrdre(racine.droite);
        }
    }

    public static void main(String[] args) {
        ArbreBinaireRecherche arbre = new ArbreBinaireRecherche();
        int[] valeurs = {5, 3, 7, 2, 4, 6, 8};

        for (int valeur : valeurs) {
            arbre.inserer(valeur);
        }

        System.out.print("Arbre initial: ");
        arbre.afficher(); System.out.println();

        int valeurASupprimer = 5;
        arbre.supprimer(valeurASupprimer);
        System.out.print("Après suppression de " + valeurASupprimer + ": ");
        arbre.afficher();
    }
}
