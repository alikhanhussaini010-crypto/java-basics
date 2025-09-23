
import java.util.Scanner;

public class ComputeChange {
    public static void main(String []   args){
        
    Scanner input = new Scanner(System.in);
        
    
        System.out.print(" Enetr  amount of dollars in double: ");
        double amount = input.nextDouble();
        
        int totalCents = (int)(amount*100);
        
        int numberOfDollars  = totalCents/100;
        int firstRemainingCents  = totalCents%100;
        
        int numberOfQuarters = firstRemainingCents/25;
        int secondRemainingCents = firstRemainingCents%25;
        
        int numberOfDimes = secondRemainingCents/10;
        int thirdRemainingCents = secondRemainingCents%10;
        
        int numberOfNickles = thirdRemainingCents/5;
        int forthRemainingCents = thirdRemainingCents%5;
        
        int numberOfPennies = forthRemainingCents;
 
          System.out.println(" your amount" + amount + " consist of ");
      
      System.out.println( numberOfDollars + " dollars");
      System.out.println(  numberOfQuarters + " quarters");
      System.out.println(  numberOfDimes + " dimes");
      System.out.println(  numberOfNickles + " nickles");
      System.out.println(  numberOfPennies + " pennies ");
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
