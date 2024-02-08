/*   
 public class App {
    public static void main(String[] args) {
        Person person =new Person("nom ", "prenom ", 18);
        Person person2 = new Person("lobna ");
        Person person3 = new Person( 25);
        Person person4 = new Person();



        // n´utilise pas getter et setter 
       // /*System.out.println("hello " + person.nom +person.prenom);
        //System.out.println("Vous avez " + person.age + " ans");
        //on utilise getter et setter methode 
        System.out.println("hello " + person.getNom() +person.getPrenom());
        System.out.println("Vous avez " + person.getAge() + " ans");
        person.setNom("new Nom");

        person.setPrenom("new Prenom ");
        
        System.out.println("Bonjour  " + person.getNom() +" " +person.getPrenom());

        System.out.println("Gutten Morgen  " + person2.getNom() +" " +person2.getPrenom());
        System.out.println(" i am  " + person3.getAge() + " years old ");
        System.out.println(" Bonjourat  " + person4);



        




// declaraetion des tableau de type personne 
        Person[] persons ;
        persons = new Person[3];
        /// en seul ligne
        //  Person[] persons = new Person[5];
        persons[0] = new Person("Demo1","demo1",20);
        persons[1] = new Person("Demo2","demo3");
        persons[2] = new Person();

        for (int i=0; i<persons.length;i++){
            System.out.println("Bonjourrrrr "+ persons[i].getNom() +" "+ persons[i].getPrenom()+  " "+ persons[i].getAge() );

        }

        Customer customer = new Customer("nom", "prenom", 25, "Gold" );


        System.out.println(customer.toString());
         Provider provider = new Provider(" provider nom  "," provider prenom ", 25, "elife");
         System.out.println(provider.toString());



            Customer [] customers = new Customer[2];
         customers[0] = new Customer("Demo1","demo1",20,"goold");
        customers[1] = customer;
        persons[2] = new Person();

        for (Customer c :customers ){
            System.out.println(c );


        }
        for (Person personn :persons ){
          //  personn.infos();


        }
 



    }
    
}
*/

// 5. Classe principale avec méthode main
public class App {
    public static void main(String[] args) {
        ElectronicProduct electronicProduct = new ElectronicProduct("Laptop", 1200.0, "E123", 90.0);
        ClothingProduct clothingProduct = new ClothingProduct("T-Shirt", 25.0, "C456", "M");
        BookProduct bookProduct = new BookProduct("Java Programming", 50.0, "B789", "John Doe");

        Order order = new Order();
        order.addProduct(electronicProduct);
        order.addProduct(clothingProduct);
        order.addProduct(bookProduct);

        order.displayProducts();
        System.out.println("Total order amount: $" + order.total());

        order.removeProduct(clothingProduct);

        order.displayProducts();
        System.out.println("Total order amount: $" + order.total());
    }
}
