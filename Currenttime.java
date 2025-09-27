public class Calculater {
  public static void main(String[]   args ) {
    
   long totalMilliSeconds =System.currentTimeMillis();
      
   long totalSeconds = totalMilliSeconds/1000;
   long currentSeconds = totalSeconds%60;
     
   long totalMinute = totalSeconds/60;
   long currentMinute =totalMinute%60;
     
   long totalHours = totalMinute/60;
   long currentHour = totalHours%24;
    
   System.out.println("Current time is " + ( currentHour+(4) ) +" : " +( currentMinute +(30)) + " : " + currentSeconds + " GMT ");
   
    
      
  
  }

}

    