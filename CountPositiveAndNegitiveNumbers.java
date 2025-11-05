
import java.util.Scanner;
public class CountPositiveAndNegitiveNumbers {
    public static void main(String[] args) {
        Scanner myscanner=new Scanner(System.in);
        
        int positive=0;
        int negitive=0;
        double total=0;
        int input=-1;
        
        while(input!=0){
            System.out.print("Enter an integer, The program is done if you enter 0:");
            input=myscanner.nextInt();
            
        if(input>0){
            positive++;
        }
        else if(input<0)
            negitive++;
        
        
        total+=input;
        
        }
        
        
        
        if(total==0){
            System.out.println("No numbers are enetred except 0:");
        }
        else{
            System.out.println("The number of positives is "+positive);
            System.out.println("The number of negitives is "+negitive);
            System.out.println("The total is "+total);
            System.out.println("The average is "+total/(positive+negitive));
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
