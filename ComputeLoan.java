
        import java.util.Scanner;
public class ComputeLoan {
    public static void main(String []  args){
        Scanner input = new Scanner(System.in);
    
    
        System.out.print(" Enter the annual interet rate: ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate/1200;
                
        System.out.print(" Enter the number of years in integer: ");
        int numberOfYears = input.nextInt();
        
        System.out.print(" Enter the loan amount: ");
        double loanAmount = input.nextDouble();
        
        double monthlyPayment = loanAmount*monthlyInterestRate / (1 - 1/ Math.pow(1+monthlyInterestRate, numberOfYears*12));
        double totalPayment = monthlyPayment*numberOfYears*12;
        
        System.out.println(" the monthly payment is $" + (int)(monthlyPayment*100)/100.0); 
        System.out.println(" the total paement is $" + (int)(totalPayment*100)/100.0  );
        
      
        
        
        
        
        
            
    
    
    
}
    
}
