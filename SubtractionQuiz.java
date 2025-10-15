
import java.util.Scanner;
public class SubtractionQuiz {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
         
   final int NUMEBR_OF_QUESTION=5;
   int correctCount=0;
   int wrongCount=0;
   int askedQuestion=0;
   String output="";
   long starTime=System.currentTimeMillis();
   
   while(askedQuestion<NUMEBR_OF_QUESTION){
       int number1=(int)(Math.random()*10);
       int number2=(int)(Math.random()*10);
       askedQuestion++;
       if(number1<number2){
           int temp=number1;
           number1=number2;
           number2=number1;  
       }
       System.out.println("\nwhat is "+number1+"-"+number2+"=?");
       int answer=input.nextInt();
       
       if(number1-number2==answer){
           System.out.println("\nyour answer is correct:");
           correctCount++;
       }
       else{
     System.out.println("your answer is wrong\n"+"It should be"+number1+"-"+number2+"="+(number1-number2));
     wrongCount++;
       }
       output+=("\n"+number1+"-"+number2+"="+answer+((number1-number2==answer)?"correct":"wrong"));
      
   }
      long endTime=System.currentTimeMillis();
      long testTime=endTime-starTime;
      System.out.println("correct count is"+correctCount+"\ntest time is"+testTime/1000+"seconds"+output);
   
   
   
   
    
 
        
        
    }
    
   
}
