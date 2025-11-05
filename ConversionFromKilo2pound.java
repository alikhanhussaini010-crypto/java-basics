
public class ConversionFromKilo2pound {
    public static void main(String[] args) {
        
        
        System.out.println("This progarm will change kilogram into pound:");
        System.out.println("kilogram\tpound");
        
    final double KILOGRAM_PER_POUND=2.2;
    
    for(int kilo1=1; kilo1<=3; kilo1+=2){
        double pound1=kilo1*KILOGRAM_PER_POUND;
        System.out.printf(kilo1+"\t\t %.1f\n",pound1);
    }
    
    
        System.out.println(". . .");
        
        
    for(int kilo2=197;  kilo2<=199; kilo2+=2){
        double pound2=kilo2*KILOGRAM_PER_POUND;
        System.out.printf(kilo2+"\t\t %.1f\n",pound2);
    }
        
        
        
        
        
        
        
        
        
    }
    
}
