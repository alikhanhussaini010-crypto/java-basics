
public class TestVoidMethod {
    public static void main(String[] args) {
        System.out.print("The grade is ");
        printGrade(1002);
        System.out.print("The garde is ");
        printGrade(55);
        
    }
    
    public static void printGrade(double score){
        if(score<0 || score>100){
            System.out.println("invalid score");
            return;
        }
        
        if(score>90.0)
            System.out.println('A');
        else if(score>80.0)
            System.out.println('B');
        else if (score>70.0)
            System.out.println('C');
        else if(score>60)
            System.out.println('D');
        else 
            System.out.println('F');
    }
    
}
