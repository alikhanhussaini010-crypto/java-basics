
import java.util.Scanner;

public class SaleTax {
      public static void main(String[]   args ) { 
 
        Scanner input = new Scanner(System.in); 
        
        System.out.print(" Please enter the product orignal price: ");
        double productPrice = input.nextDouble();
        
        System.out.print(" Please enter the sale tax : ");
        double saleTax = input.nextDouble();
        
        double saleTaxAmount = ( productPrice * saleTax)/100;
        double totalProductPrice = ( productPrice+saleTaxAmount);
        
        System.out.println(" The final product price is " + (int)( totalProductPrice*1000 )/1000.0);
        
   
      }    
}
