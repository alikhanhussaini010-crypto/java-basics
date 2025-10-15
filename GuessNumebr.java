
import java.util.Scanner;


public class GuessNumebr {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       
       int number=(int)(Math.random()*101);
     
        System.out.println("Guess a magic number between 0 and 100");
        System.out.println(number);
        int guess=-1;
        
        while(guess!=number){
            System.out.print(" Enter your guess:");
            guess=input.nextInt();
            
            if(guess==number)
                System.out.println("yes! the number is "+number);
            else if(guess>number)
                System.out.println("your guess is too high:");
            else
                System.out.println("your guess is too low:");
          
            
        }
        
        
        
        
    }
    
}
