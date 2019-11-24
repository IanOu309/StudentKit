import java.util.concurrent.TimeUnit;
public class Relax{
  public static void main(String[] args) throws InterruptedException 
  {
    long Minutes=0;
    long starttime=System.currentTimeMillis();
    int i = 0;
    System.out.println("Rough day? Follow these steps to slow your heart rate and calm down.Start by SLOWLY inhaling");
    while(Minutes<1)
     {
        TimeUnit.SECONDS.sleep(1);
        long timepassed=System.currentTimeMillis()-starttime;
        long seconds=timepassed/1000;
        if(seconds==0)
        {
         System.out.println("Inhale SLOWLY");
        }
        if(seconds==5)
        {
         System.out.println("Hold");
        }
        if(seconds==8)
        {
         System.out.println("Exhale SLOWLY");
        }
        if(seconds==13)
        {
         System.out.println("Inhale SLOWLY");
        }
        if(seconds==18)
        {
         System.out.println("Hold");
        }
        if(seconds==21)
        {
         System.out.println("Exhale SLOWLY");
        }
        if(seconds==26)
        {
         System.out.println("Inhale SLOWLY");
        }
        if(seconds==31)
        {
         System.out.println("Hold");
        }
        if(seconds==34)
        {
         System.out.println("Exhale SLOWLY");
        }
        if(seconds==39)
        {
         System.out.println("Inhale SLOWLY");
        }
        if(seconds==44)
        {
         System.out.println("Hold");
        }
        if(seconds==47)
        {
         System.out.println("Exhale SLOWLY");
        }
        if(seconds==52)
        {
         System.out.println("Inhale SLOWLY");
        }
        if(seconds==57)
        {
         System.out.println("Hold");
        }
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
    System.out.println("TIME IS UP! I hope you feel much better!");
   }
}
