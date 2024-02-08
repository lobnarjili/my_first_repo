public class Customer extends Person {
    private String type;
      


    public Customer(String nom , String prenom , int age  , String type){
        super(nom, prenom, age);
        this.type =type;

    }



    public String getType() {
        return type;
    }



    public void setType(String type) {
        this.type = type;
    }
    
    public void infos(){
        System.out.print(" bonjour Customer "+ this.getNom() + ""+ this.getPrenom() +""+this.getAge());

    }
    //abstract public void infos();


    @Override
    public String toString() {
        return super.toString() + " Customer [type = " + type + "]";
    }

    



    
}
