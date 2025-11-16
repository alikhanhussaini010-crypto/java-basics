
import java.util.Scanner;

public class LotteryUsingString {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        String lottery=""+(int)(Math.random()*10)+(int)(Math.random()*10);
        char lotteryDigit1=lottery.charAt(0);
        char lotteryDigit2=lottery.charAt(1);
        
        System.out.print("Please guess two numbers for wining lotery: ");
        String guess=input.nextLine();
        char guessDigit1=guess.charAt(0);
        char guessDigit2=guess.charAt(1);
        System.out.printf("The lottery is %S\n",lottery);
        
        if(lottery==guess){
            System.out.println("Excelint your guess is exactly right you win $10,000: ");
        }
        else if(guessDigit1==lotteryDigit2 && guessDigit2==lotteryDigit1){
            System.out.println("Your guess is exactly the lottery numbers! you win $3,000: ");
        }
        else if(
                guessDigit1==lotteryDigit1
                ||guessDigit1==lotteryDigit2
                ||guessDigit2==lotteryDigit1
                ||guessDigit2==lotteryDigit2
                )
            System.out.println("Only one digit mactched you win $1,000:");
        else
            System.out.println("sorry no match!");
        
        
        
    }
    
}
