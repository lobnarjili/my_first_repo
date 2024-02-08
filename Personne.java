public class Personne implements Human 
{ // class personne qui implemente l'interface humain 
private String firstName;
private String lastName;

// constructeur 
public   Personne (String lastName, String firstName){
    this.firstName = firstName;
    this.lastName = lastName;
}
@Override 
public void introduce(){
    System.out.println("Hello , my name is "+ firstName +" "+ lastName +" ");
}

    
}
    

