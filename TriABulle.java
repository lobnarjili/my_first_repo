public class TriABulle {


 

        public static void triABulles(int[] tableau) {
            int n = tableau.length;
            boolean echangeEffectue;
    
            for (int i = 0; i < n - 1; i++) {
                echangeEffectue = false;
    
                for (int j = 0; j < n - 1 - i; j++) {
                    if (tableau[j] > tableau[j + 1]) {
                        // Échanger les éléments si ils sont dans le mauvais ordre
                        int temp = tableau[j];
                        tableau[j] = tableau[j + 1];
                        tableau[j + 1] = temp;
    
                        echangeEffectue = true;
                    }
                }
    
                // Si aucun échange n'a été effectué lors d'une passe, le tableau est déjà trié
                if (!echangeEffectue) {
                    break;
                }
            }
        }
    
        public static void afficherTableau(int[] tableau) {
            for (int valeur : tableau) {
                System.out.print(valeur + " ");
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            int[] tableau = {64, 34, 25, 12, 22, 11, 90};
    
            System.out.println("Tableau avant le tri : ");
            afficherTableau(tableau);
    
            triABulles(tableau);
    
            System.out.println("Tableau après le tri à bulles : ");
            afficherTableau(tableau);
        }
    
    
    
}
