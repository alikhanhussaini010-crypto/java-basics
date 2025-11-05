
import java.util.Scanner;

public class GreatestCommonDiviserMethod {
    
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("This program will cheak the greatest common divisor between two integers:");
        System.out.print("Enter the the first number:");
        int number1=input.nextInt();
        System.out.print("Enter the second number:");
        int number2=input.nextInt();
        
        System.out.printf("The greatest common divisor between %d and %d is %d:\n",number1,number2,gcd(number1, number2));
       
    }
    
    // GCD METHOD
    public static int gcd(int num1,int num2){
        
        int gcd=1;
        int startTestingGcd=2;
        
    while(startTestingGcd<=num1 && startTestingGcd<=num2){
        if(num1%startTestingGcd==0 && num2%startTestingGcd==0)
            gcd=startTestingGcd;
    startTestingGcd++;
    }
    return gcd;
        
    }
    
    
    
    
    
}