
import java.util.Scanner;
public class FirstMethod {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        
        System.out.println("This program will check the max number between three numbers:");
    
        System.out.print("Please enter the first number:");  
    double num1=input.nextDouble();
        
        System.out.print("Please enter the first number:");  
    double num2=input.nextDouble();
                
       System.out.print("Please enter the first number:");  
    double num3=input.nextDouble();
        
    double maxNumber=max(num1, num2, num3);
    
        
    if(maxNumber==0){
        System.out.println("The numbers are eqaul:");
    }
    else
        System.out.println("The max number between three numbers is"+max(num1, num2, num3));
    
         
    }
    
    
     public static double max(double num1,double num2 ,double num3){
        double result;
        
    if(num1>=num2 && num1>=num3)
        result=num1;
    else if(num2>=num1 && num2>=num3)
        result=num2;
    else if(num3>=num1 && num3>=num2)
        result=num3;
    else 
        result=0;
    return result;
    
    }
     
     
}
