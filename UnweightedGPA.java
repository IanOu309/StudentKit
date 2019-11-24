import java.util.Scanner;
public class UnweightedGPA{ 
  public static void main (String[] args){
    Scanner scnr = new Scanner(System.in);
    double A = 0; 
    double  B = 0; 
    double C = 0;
    double D = 0; 
    double F = 0;
    double classes = 0; 
    double GPA = 0.0;
    
    System.out.println("How many total classes do you have?");
      classes = scnr.nextInt();
      
    System.out.println("How many As do you have?");
      A = scnr.nextDouble();
      
      System.out.println("How many Bs do you have? ");
      B = scnr.nextDouble();
      
      System.out.println("How many Cs do you have?");
      C = scnr.nextDouble();
        
      System.out.println("How many Ds do you have?");
      D = scnr.nextDouble();
      
      System.out.println("How many Fs do you have?");
      F = scnr.nextDouble();    
      
    GPA = (((4*A) + (3*B) + (2*C) + (1*D) + (0*F))/classes);
    System.out.println("Your GPA is " + GPA);
    return;
  }
}
