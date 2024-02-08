

public abstract class  Product {
   String name; 
   Double price ;
   String reference ;
    // Constructeur de la classe
    public Product(String name, double price, String reference ) {
        this.name = name;
        this.price = price;
        this.reference =reference;
    }

     // Méthode pour obtenir le nom
     public String getName() {
        return name;
    }
    // Méthode pour obtenir le price 
    public double getPrice() {
    return price;
    }
    //// Méthode pour obtenir le reference 
    public String getReference(){
        return reference;
    }
    // Méthode pour définir le name
    public void setName(String name) {
        this.name = name;
    }
    // Méthode pour définir le price
    public void setPrice(double price) {
        this.price = price;
    }
    // Méthode pour définir le reference
    public void setReference(String reference) {
        this.reference= reference;
    }

  // Méthode abstraite pour obtenir la description du produit
  public abstract String getDescription();
    
}


// Déclaration de la classe fille ElectronicProduct
class ElectronicProduct extends Product {
    private double power;

    //constructeur 
    public ElectronicProduct(String name, double price, String reference, double power){
        super(name, price, reference);
        this.power = power;
    }

       // Méthode spécifique à ElectronicProduct
       public double getPower() {
        return power;
    }

    // Méthode spécifique à ElectronicProduct
    public void setPower(double power) {
        this.power = power;
    }
    //méthode nommée getDescription() qui renvoie une chaîne de caractères décrivant le produit électronique.
    @Override
    public String getDescription(){
        return "Electronic Product :  Nom: " + getName() + ", Power: " + getPower()  + ", Prix: " + getPrice() + ", Référence: " + getReference();

    }

}

    // Déclaration de la classe fille ClothingProduct
    class ClothingProduct extends Product {
        private String size;


         //constructeur 
    public ClothingProduct(String name, double price, String reference, String size){
        super(name, price, reference);
        this.size = size;
    }

    public String getSize(){
        return size;
    }
    public void setSize (String size) {
        this.size = size;
    }
     //méthode nommée getDescription() qui renvoie une chaîne de caractères décrivant les vetements .
     @Override
     public String getDescription(){
         return "Clothing Product - Nom: " + getName()   + ", Prix: " + getPrice() + ", Référence: " + getReference()+ ", Size: " + getSize();
 
     }


    }

    // Déclaration de la classe fille BookProduct
    class BookProduct extends Product {

        private String author;


        //constructeur 
   public BookProduct(String name, double price, String reference, String author){
       super(name, price, reference);
       this.author = author;
   }

   public String getAuthor(){
       return author;
   }
   public void setAuthor (String author) {
       this.author = author;
   }
    //méthode nommée getDescription() qui renvoie une chaîne de caractères décrivant le livre 
    @Override
    public String getDescription(){
        return "Book Product - Nom: " + getName() +  ", Prix: " + getPrice() + ", Référence: " + getReference() + ", Author: " + getAuthor() ;

    }

    // Declaration de l'interface cart 
    public interface Cart {
        // Méthode abstraite ajoute un produit au panier,

        void addProduct(Product product);

         // Méthode abstraite  retire un produit du panier,
        boolean removeProduct(Product product);
        // Méthode abstraite affiche les produit du panier
        void displayProducts();  
        //  Méthode abstraite retourne le montant total des produits dans le panier.
        double total();

    
        
    }


        
    
    }
