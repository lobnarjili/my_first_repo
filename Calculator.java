public class Calculator {
    //additin de deux entier 
    public int calcul(int a, int b){
        return a+b;
    }
     //additin de 3 entier 
     public int calcul(int a, int b,int c ){
        return a + b + c;
    }
     //additin de deux double 
     public double calcul(double a, double b){
        return a + b;
    }
     //Multiplication de deux entier 
     public int calcul(int a, int b, boolean multiplication){
        if (multiplication){
            return a*b;

        }else{
            //appel a la methode d'addition des 3 entier 
            return calcul(a, b, 0);
        }
        
    }
    /// definition de la methode main
public static void main(String[] args) {
    Calculator calculator = new Calculator();
     //appel a la methode d'addition des 2 entiers
     int result1 = calculator.calcul(2, 3);
     System.out.println("Resultat 1 Addition : " + result1);
      //appel a la methode d'addition des 3 entiers
      int result2 = calculator.calcul(2, 3,4);
      System.out.println("Resultat 2 Addition : " + result2);

       //appel a la methode d'addition des 2 double
     double result3 = calculator.calcul(2.5, 3.5);
     System.out.println("Resultat 3 Addition : " + result3);
      //appel a la methode de multplication des 2 entiers
      int result4 = calculator.calcul(2, 3,true);
      System.out.println("Resultat 4 multipliction : " + result4);

}
}
