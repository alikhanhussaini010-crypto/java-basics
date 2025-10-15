
import java.util.Scanner;
public class PhoneNumber {
    
    public static void main(String[] args) {
        
        
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter a phone number:");
        String phoneNumber=input.next();
        
        if( (phoneNumber.startsWith("077")||phoneNumber.startsWith("076") )&& phoneNumber.length()==10)
            System.out.println("This number is from ATOMA.");
        else if(phoneNumber.startsWith("074") && phoneNumber.length()==10)
            System.out.println("this number is from SALLAM.");
        else if( phoneNumber.startsWith("079") && phoneNumber.length()==10 )
            System.out.println("This number is from ROSHAN.");
        else if(phoneNumber.startsWith("070") && phoneNumber.length()==10)
            System.out.println("This number is from ETSALAT.");
        else 
            System.out.println("This number is not a phone number.");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
