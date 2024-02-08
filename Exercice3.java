import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;
public class Exercice3 {
  


    public static void main(String[] args) {
        // Initialisation des variables
        double  n; // le nombre entree par l'utilisateur 
        int count = 0; // Inistializer  le compteur d'essais

    
        int nbr = (int) (Math.random() * 999) ; // le nombre aleatoir 
        Scanner scanner = new Scanner(System.in);
        
        // start time 
        LocalTime starTime =LocalTime.now();
        do{
             //Demander à l'utilisateur de deviner le nombre
            System.out.print("Enter a number between 0 and 999 : ");
            n = scanner.nextDouble();


            /*Si la tentative de l'utilisateur est supérieure au nombre aléatoire, le programme informe
                'utilisateur en imprimant "C'est moins."*/
            if( n > nbr  )
           
            {
                
                System.out.println(" It's less . " );
            }

            /*Si la tentative de l'utilisateur est inférieure au nombre aléatoire, le programme informe
                l'utilisateur en imprimant "C'est plus."*/
            else if ( n < nbr )
                {
                   
                    System.out.println(" It's more . " );
             }
            else 
             { 
              //Si la tentative de l'utilisateur corresponde au nombre aléatoire.

                System.out.println("");
                System.out.println(" Congratulations , you guessed the number ");
             }
              // Incrémenter le compteur d'essais

              count++;
        }
        while (nbr != n); 
        // End time 
        LocalTime endTime =LocalTime.now();
        // DUREE TOTALE
        Duration duration= Duration.between(starTime,endTime);

         // Afficher le nombre de iteration pour le résultat finaL

        System.out.println("");
    System.out.println("Resultat obtained in " + count + " attempt(s) ");
         
    // Afficher lE Duree of attempts  de iteration pour le résultat final en heur , minute et second

      System.out.println("Duration of attempts :  " + duration.getSeconds()/360 + " hour(s) " + (duration.getSeconds()%360)/60+" minute(s) " + (duration.getSeconds()%360)%60 +"second (s) ");
       scanner.close();

        
    
    
    }
     
    
}

    
