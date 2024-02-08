public class Provider extends Person {
    private String companyName ;

    public Provider(String nom, String prenom, int age, String companyName) {
        super(nom, prenom, age);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return super.toString() + " Provider [companyName = " + companyName + "]";
    }

  

    
    
}
