public class Person {
    //Definition des attributs
    private String lastName;
    private String firstName;
    // definition des constructeur 
    public Person (String lastName , String firstName){
        this.firstName =firstName;
        this.lastName = lastName;

    }
    // definition des methodes getter and setter pour lastname 
    public String getLastName(){
        return lastName;

    }
    public void setLastName(String lastName)
    {this.lastName = lastName.toUpperCase();
    }

    // definition des methodes getter and setter pour firstname 
    public String getFirstName(){
        return firstName;

    }
    public void setFirstName(String firstName){
        this.firstName = firstName;

    }

    // definition de la methode to string dans la classe Person
    @Override
    public String toString(){
        return "Person [ lastName= " + lastName +" firstName " + firstName + " ]";
    }


    
        
    
    public static void main(String[] args) {
        //creation d#un nouvel objet Person avec last Name "Stone" and first name "Jason"
        Person person =new Person("Stone", "Jason");
        // Utilisez les methodes getter pour recuperer et afficher last Name "Stone" and first name "Jason" dans person
        System.out.println("Last name  :" + person.getLastName());
        System.out.println(" First name :" + person.getFirstName());
     // Utilisez les methodes getter pour modifier  last Name "Stone" and first name "Jason" dans person
        //person.setLastName("Rich");
        //Person.setFirstName("Ava");
        //person.setfirstname("");
        person.setFirstName("Ava"); 
        person.setLastName("Rich");
        // Affichage de l'objer Person sur la console a l'aide de methode to string 
        System.out.println(person);

    
    }
}
