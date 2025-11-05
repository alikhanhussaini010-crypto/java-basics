
public class TestPassByValue {

    public static void main(String[] args) {
       
        int num1=5;
        int num2=10;
        
        System.out.printf("Before swapping num1 is %d and num2 is %d:\n",num1,num2);
        swap(num1, num2);
        System.out.printf("After swapping num1 is %d and num2 is %d:\n",num1,num2);
        
        
    }
    
    public static void swap(int n1, int n2){
        System.out.println("\tInside the method:");
        System.out.printf("\tBefore swapping n1 is %d and n2 is %d:\n",n1,n2);
        
        int temp=n1;
        n1=n2;
        n2=temp;
        
        System.out.printf("\tAfter swapping n1 is %d and n2 is %d:\n",n1,n2);
    }
    
}
