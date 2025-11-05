
import java.util.Scanner;
public class CallingMethod {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         
         
        System.out.println("This program will cheack the max number :");
        System.out.println("Enetr the first number:");
        double num1=input.nextDouble();
        System.out.println("Enetr the second number:");
        double num2=input.nextDouble();
        
        System.out.println("The max number betwen two numbers is"+TestMethod.max(num1, num2));
        
        TestMethod.welcome("Hello good morning", 5);
        
        
      
    }
    
}
