
import java.util.Scanner;
public class ComputeAngles {
    public static void main(String[] args) {
      
    Scanner input = new Scanner (System.in);
    
      System.out.print("Enter the first point of  triangle x1=?  y1=?  ");
      double x1=input.nextDouble() ,y1=input.nextDouble();
        System.out.print("Enter the second point of triangle  x2=?  y2=? ");
      double x2=input.nextDouble(),y2=input.nextDouble();
        System.out.print("Enter the third point of triangle  x3=?  y3=? ");
      double x3=input.nextDouble(),y3=input.nextDouble();
      
      double a= Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
      double b=Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
      double c=Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
      
      double A=Math.toDegrees( Math.acos(  (a*a-b*b-c*c)/(-2*b*c)   ));
      double B=Math.toDegrees(Math.acos(   (b*b-a*a-c*c)/(-2*c*a)   ));
      double C=Math.toDegrees(Math.acos(   (c*c-b*b-a*a)/(-2*b*a)   ));
      
        System.out.println(" The A angle is ="+A);
        System.out.println("The B angle is ="+B);
        System.out.println("The C angle is ="+C);
     
   
    }
    
}