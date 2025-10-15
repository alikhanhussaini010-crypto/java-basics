
import com.sun.org.apache.xalan.internal.utils.XMLSecurityManager;
import java.util.Scanner;


public class FormatDemo {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.print("   Please enter an angle in degree:");
        double degrees=input.nextDouble();
        double radain=Math.toRadians(degrees);
        
        
        System.out.printf("  %-10s %-10s %-10s %-10s %-10s","Degrees","Radain","Sine","Cosine","Tangent\n");
        
        
        System.out.printf("%-10.4f %-10.4f %-10.4f %-10.4f %-10.4f\n",degrees,radain,Math.sin(radain)
                           ,Math.cos(radain),Math.tan(radain));
        
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
