
public class OverloadingMethod {

    public static void main(String[] args) {
        
        System.out.println("The max of 3 and 4 is "+max(3,4));
        System.out.println("The max of 3.4 and 4.5 is "+max(3.4,4.5));
        System.out.println("The max of 3.4 , 4.6 and 7.6 is "+max(3.4, 4.6, 7.6));
       
    }
    
    public static int max(int num1, int num2){
        if(num1>num2)
            return num1;
        else
            return num2;
    }
    
    
    public static double max(double num1, double num2){
        if(num1>num2)
            return num1;
        else
            return num2;
    }
    
    
    public static double max(double num1,double num2,double num3){
        return max(max(num1, num2), num3);
    }
    
}
