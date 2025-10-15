
import java.util.Scanner;


public class Exercise {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        String emailName="Alikhanhussaini010@gmail.com";
        String password="alikhan12345";
        
        System.out.print("Please enter your email:");
        String email=input.next();
        
        if(email.equals(emailName)){
               System.out.print("please enter your password:");
               String code=input.next();
               
            
                        if(code.equals(password)) {
                        System.out.println("Welcome to facebook:");
                
                                    }
                else{
                System.out.println("Incorrect password please try again:");
                }
         
            
                  }
        else{
            System.out.println("Incorrect email please try again:");
        }
        
        
        
        
        
        
      
    }
    
}
