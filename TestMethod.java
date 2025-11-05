
public  class TestMethod {
    
    // MAX METHOD
    public static double max(double num1,double num2){
        double result;
        if(num1>num2)
            return num1;
        else
            return num2;
    }
    
    
      // ADD METHOD      
    public static int add(int num1,int num2){
        return num1+num2;
    }
    
    
    //WELCOME METHOD
    public static void welcome(String message,int count){
        for(int num=0; num<count;num++)
            System.out.println("Welcome my freind:");
    }
   
    
    
    
    
}
