
public class TestReturnGetMthod {

    public static void main(String[] args) {
        System.out.println("The garde is "+getGrade(78.5));
        System.out.println("The garde is "+getGrade(67));
         
    }
    
    public static char getGrade(double score){
        if(score>90)
            return 'A';
        else if(score>80)
            return 'B';
        else if(score>70)
            return 'c';
        else if(score>60)
            return 'D';
        else
            return 'F';
    }
    
}
