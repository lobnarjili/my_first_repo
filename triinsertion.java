public class triinsertion {

    public  static void triinsertion(int [] tableau){
        int taille = tableau.length;
        System.out.println( taille);
        for (int i=1; i <= taille;i++){
            int element = tableau[i];
           int  j = i-1 ;
           while (j>=0 && element<tableau [j] ) {
            tableau[j+1] = tableau [j];
            j--;
            tableau[j+1] = element;
            
           }
        }
    }
    public static void main(String[] args) {
        
            int[] tableau = {8, 3, 9, 5, 2, 4, 7, 6};

            System.out.println("Tableau non tri : ");
            for (int valeur : tableau) {
                
                System.out.print(valeur + " ");
            }
            
            triinsertion(tableau);
            
            System.out.println("Tableau tri : ");
            for (int valeur : tableau) {
                System.out.print(valeur + " ");
            }

    }
}
