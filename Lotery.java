
import java.util.Scanner;
public class Lotery {
    public static void main(String[] args) {
        
       Scanner input  = new Scanner(System.in);
       
        int lotery= (int)(Math.random()*100);    
        int loteryDigit1=lotery/10;
        int loteryDigit2=lotery%10;
        
        System.out.print("Enetr your lotery pick (two digits): ");
        
        int guess= input.nextInt();
        int guessDigit1=guess/10;
        int guessDigit2=guess%10;
        
        System.out.println("the lotery number is "+ lotery);
          
       if(guess==lotery)      
            System.out.println("Exact number: you win $10,000 ");
       else if (guessDigit2==loteryDigit1 && guessDigit1==loteryDigit2)
            System.out.println("Match all didgits you win $3000 ");
       else if ( guessDigit1==loteryDigit1
               || guessDigit1==loteryDigit2  
               ||guessDigit2==loteryDigit1
               ||guessDigit2==loteryDigit2
               )
            System.out.println(" Mach one digit you win $1000");
       else
            System.out.println("sorry: no macth");
        
   
    }
    
}
