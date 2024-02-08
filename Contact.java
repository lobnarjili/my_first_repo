public class Contact {
    private String name ;
    private String phoneNumber ;
    // constructeur 

    public Contact( String name , String phoneNumber){
        this.name = name ;
        this.phoneNumber = phoneNumber;
    }
    public String getName(){
        return name;
    
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }



    public static void main (String[] args){
        Contact[] tabcontacts  = new Contact[5];
        //
        tabcontacts[0] = new Contact("Contact 1" , "+21611111111");
        tabcontacts[1] = new Contact("Contact 2" , "+21622222222");
        tabcontacts[2] = new Contact("Contact 3" , "+21633333333");
        tabcontacts[3] = new Contact("Contact 4" , "+21644444444");
        tabcontacts[4] = new Contact("Contact 5" , "+21655555555");
         System.out.println( "Contact List:");
        
        for (Contact contact :tabcontacts)
        {
        System.out.print( "Name: " + contact.getName() + ", " );
        System.out.println( " Phone Number: " + contact.getPhoneNumber());}

        }
        
    
}