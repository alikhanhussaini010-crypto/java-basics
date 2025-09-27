
import java.util.Scanner;

public class AditionQuiz {
    public static void main (String []   args){
        
        Scanner input = new Scanner(System.in);
        
          int number1 =(int)System.currentTimeMillis()%10;
          int number2 = (int)System.currentTimeMillis()/10%10;
  
      System.out.print(" what is " + number1 + "+" + number2 + "="+ "?" );  
      
      System.out.print(" the answer is "); 
      double answer = input.nextDouble();
      
      System.out.println("your answer " + number1+ "+" + number2 + "is" + (number1+number2==answer));
      
        
        
        
        
        
        
        
        
    }
    
}
