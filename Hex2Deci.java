
import java.util.Scanner;

public class Hex2Deci {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("This program will change a hex number into decimal number:");
        System.out.print("Please enter a hex number:");
        String hex=input.nextLine();
        
        System.out.println("The decimal value for hex number"+hex+" is "+hexToDecimal(hex.toUpperCase()));
     
    }
    
    
    public static int hexToDecimal(String hex){
        int decimalValue=0;
        for(int i=0; i<hex.length(); i++){
            char hexChar=hex.charAt(i);
            decimalValue=decimalValue*16+hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }
    
    
    public static int hexCharToDecimal(char ch){
        if(ch>='A'&& ch<='F')
            return ch+10-'A';
        else
            return ch-'0';
    }
    
}
