import java.util.concurrent.TimeUnit;
import java.util.Scanner;
public class Reminder{
  public static void main(String[] args) throws InterruptedException 
  {
    Scanner scnr = new Scanner(System.in);
    long Minutes=0;
    long starttime=System.currentTimeMillis();
    int i = 0;
    System.out.println("How many minutes do you want to study? Please enter a number greater than or equal to 1 minute.");
    i = scnr.nextInt();
    while(Minutes<i)
     {
        TimeUnit.SECONDS.sleep(1);
        long timepassed=System.currentTimeMillis()-starttime;
        long seconds=timepassed/1000;
        if(seconds==60)
        {
            seconds=0;
            starttime=System.currentTimeMillis();
        }
        if((seconds%60)==0)
        {
          Minutes++;
        }
        System.out.println(Minutes+":"+seconds);
    }
    System.out.println("TIME IS UP! Take a break and come back to study!");
   }
}