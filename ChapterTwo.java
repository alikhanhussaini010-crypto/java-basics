
import java.util.Scanner;
public class ChapterTwo {
    public static void main(String[] args) {
        
     
   Scanner input=new Scanner(System.in);
   /*
   // 2:  THE AREA AND VOLUME OF CYLINDER.
   
      System.out.println(" Enter the radius amount:");
      double radius = input.nextDouble();
      
      System.out.println("Enetr the length amount:");
      double length=input.nextDouble();
      
      double area=radius*radius*3.14;
      double volume=area*length;
      
      System.out.println(" the area for cylinder is "+ area);
      System.out.println("the volume for cylinder is "+volume);
     */ 
   
   
   /*
   // 3:  CONVERT FEET INTO METER
   
        System.out.print(" Enter a value for feet:");
        double feet =input.nextDouble();
        
        final double METER_PER_FOOT=0.3048;
        
        double meter=feet*METER_PER_FOOT;
        System.out.println(feet +" feet is "+ meter+" meters");
   */
  
        
   /*
   // 4:  CNEVER POUND TO KILOGRAM
        System.out.print("Enter a number in pound:");
        double pound =input.nextDouble();
        
        final double KILOGRAM_PER_POUND=0.454;
        
        double kilogram=KILOGRAM_PER_POUND*pound;
        System.out.println(pound+" pound is "+kilogram+" kilogram ");
     */
   
   /*
   // 5:  SUM THE DIGITS IN AN INTEGER.
        System.out.print("Enter a number between 0 and 1000 ");
        int number = input.nextInt();
        
        int num1=number%10;
        int num2=number/10%10;
        int num3=number/100%10;
        
        int sum=(num1+num2+num3);
        System.out.println("the sum of digits is "+ sum);
     */ 
        
   
   /*
   // 6:   FIND THE NUMBER OF YEARS.
   
        System.out.print("ENter the number of minutes:");
        int minutes=input.nextInt();
        
        int days=minutes/1440;
         
        int year=days/365;
        int remainingDays=days%365;
        System.out.println(minutes+ " minutes is approximately "+year+" years and "+ remainingDays+" days ");
     */  
   
   /*
        // 7:   AVERAGE ACCELERATION
        System.out.print(" Enter v0  v1  and  t:   ");
   
        //Enter the velocity in meter/second.  
        double v0=input.nextDouble() , v1=input.nextDouble() , t=input.nextDouble();
        
        double acceleration= (v1-v0)/t;
        System.out.println("the average acceleration is "+ (int)(acceleration*10000)/10000.0);
   */
   
   
   /*
    // 8:  CALCULATING ENERGY  
        System.out.print(" Enter the amount of water in kilogram: ");
        double watwerInKilogram= input.nextDouble();
        
        System.out.print(" Enter the initial temperature in celsius: ");
        double initialTemperature=input.nextDouble();
        
        System.out.print(" Enter the final temperature in celsius: ");
        double finalTemperature=input.nextDouble();
        
       double Energy = watwerInKilogram*(finalTemperature-initialTemperature)*4184;
   
        System.out.println(" the energy needed is "+ Energy);
   */
   
   
   /*
   // 9:  POPULATION PROJECTION.
        System.out.print("Enter the number of year:");
        int year=input.nextInt();
        
          int totalSeconds=year*365*24*60*60;
          int birth=totalSeconds/7;
          int death=totalSeconds/13;
          int immigrant=totalSeconds/45;
          int population= (312032486+birth+immigrant-death);
      
        System.out.println("the population for "+year+" is " + population);
   */
   
   
   
   
   
   
   
   
   
   
   
   
    }

   
        
    
    
    
}
