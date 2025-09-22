
import java.util.Scanner;
public class Bmi {
    public static void main(String[]  args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your weight in pound");
        double weight = input.nextDouble();
        
        System.out.println("Enetr your height in inch");
        double height = input.nextDouble();
        
        final double KILOGRAM_PER_POUND = 0.45359237;
        final double HEIGHT_PER_INCH = 0.0254;
        
        double weightInKilograms = weight*KILOGRAM_PER_POUND;
        double heightInInch = height*HEIGHT_PER_INCH;
        
        double bmi = weightInKilograms/(heightInInch*heightInInch);
        
        System.out.println("BMI is "+bmi);
        
        if(bmi<18.5)
            System.out.println("Underweight");
        else if (bmi<25)
            System.out.println("normal");
        else if (bmi<30)
            System.out.println("overweight");
        else
            System.out.println("obese");
        
        
    }
    
}
