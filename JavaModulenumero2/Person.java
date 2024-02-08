public class Person{
   protected String nom ;
   protected String prenom;
   protected int age;
//,int age

    public Person (String nom,String prenom ,int age){
        this.nom = nom ;
        this.prenom =prenom ;
        this.age =age;


    }
    
    public Person (){
        this.nom = " default nom" ;
        this.prenom = " default prenom" ;
        this.age = 15;

    }

    // constructeur d'un seul attribut 
    public Person (String nom){
        this.nom = nom ;
        
    }

    public Person (String nom,String prenom ){
        this.nom = nom ;
        this.prenom =prenom ;
     

    }
    public Person ( int age  ){
        this.age = age ;
     

    }


    public String getNom(){
        return this.nom.toUpperCase();
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public int getAge(){
        return this.age;
    }

    @Override
    public String toString() {
        return "Person [nom = " + nom + ", prenom = " + prenom + ", age = " + age + "]";
    }
    
}