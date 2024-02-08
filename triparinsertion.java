public class triparinsertion {




        public static void triParInsertion(int[] tableau) {
            int n = tableau.length;
    
            for (int i = 1; i < n; i++) {
                int valeurActuelle = tableau[i];
                int j = i - 1;
    
                // Déplacer les éléments du tableau qui sont plus grands que la valeur actuelle
                // vers une position à droite de leur position actuelle
                while (j > 0 && tableau[j] > valeurActuelle) {
                    tableau[j + 1] = tableau[j];
                    j--;
                }
    
                // Placer la valeur actuelle à sa position correcte dans le tableau trié
                tableau[j + 1] = valeurActuelle;
            }
        }
    
        public static void afficherTableau(int[] tableau) {
            for (int valeur : tableau) {
                System.out.print(valeur + " ");
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            int[] tableau = {12, 11, 13, 5, 6};
    
            System.out.println("Tableau avant le tri : ");
            afficherTableau(tableau);
    
            triParInsertion(tableau);
    
            System.out.println("Tableau après le tri par insertion : ");
            afficherTableau(tableau);
        }
    
    
}
