
public class TestRandomCharacter {

    public static void main(String[] args) {
        final int NUMBER_OF_CHARS=655;
        final int NUMBER_OF_CHARS_PER_LINE=25;
        
        for(int i=0; i<NUMBER_OF_CHARS;i++ ){
            char ch=RandomCharacter.getRandomUpperCaseLater();
            
            if((i+1)%NUMBER_OF_CHARS_PER_LINE==0)
                System.out.println(ch);
            else
                System.out.print(" "+ch);
        }

    }
    
}
