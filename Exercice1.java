

public class Exercice1 {
    public static void main(String[] args) {
        

         // Initialisation des variables

        int n = 0;
        int  number1, number2, number3;
        //double nbr = Math.random();
        // Boucle tant que la combinaison n'est pas pair, pair, impair
    do {
      // Générer trois nombres aléatoires entre 0 et 999
        number1 = (int) (Math.random() * 999) ;
        number2 = (int) (Math.random() * 999 );
        number3 = (int) (Math.random() * 999 ) ;
         
        // Incrémenter le compteur
       
        n++;
    
        
         // Afficher les nombres générés
        
        System.out.println("Nombre aléatoire : " + "Number 1: " +   number1  + " , Number 2: " +   number2  +" , Number 3: "  +   number3  ); 
    
        

    }
    while(!((number1 % 2 == 0) && ( number2 % 2 ==0)&& (number3 %2 != 0) ));
    //while(((number1 % 2 != 0) || ( number2 % 2 !=0) || (number3 %2 == 0) ));

      // Afficher le nombre de iteration pour le résultat final
      // Afficher le résultat final
    System.out.println("");
    System.out.println("Resultat obtained in " + n + " attempt(s) ");

    }

    

    

    
    

    


    
}
