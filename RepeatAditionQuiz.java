
import java.util.Scanner;
public class RepeatAditionQuiz {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("This is an addition program for elementry students:");
        System.out.print("How many questions do you want to answer? ");
        int numberOfQuestion=input.nextInt();
        
        int correctAnswer=0;
        int wrongAnswer=0;
        int count=0;
        long startTime=System.currentTimeMillis();
        String output="";
        
        
        
    while(count<numberOfQuestion){
        count++;
        
        int random1=1+(int)(Math.random()*15);
        int random2=1+(int)(Math.random()*15);
        
        System.out.print(" What is "+random1+"+"+random2+"=? ");
        int answer=input.nextInt();
        
    if(random1+random2==answer){
        System.out.println("Your answer is correct.\n");
        correctAnswer++;
    }
    else{
        System.out.println("Your answer is wrong:");
        System.out.println("it should be "+random1+"+"+random2+"="+(random1+random2)+"\n");
        wrongAnswer++;
    }
    
        output+="\n"+random1+"+"+random2+"="+answer+((random1+random2==answer)?"   :Correct":"   :Wrong");
    
    }
    
        long endTime=System.currentTimeMillis();
        long testTime=(endTime-startTime)/1000;
        
        System.out.println("Correct answer is: "+correctAnswer);
        System.out.println("Test time is "+testTime+" seconds:\n"+output);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
