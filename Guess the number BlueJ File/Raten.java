
public class Raten 
 { 
  int z;
  int tries;
 public Raten()
  {
   z=(int)(Math.random()*100);
   tries=0;
   }
 public void raten(int pP)
   { 
   tries = tries+1;
   //tries++;
   //tries+=1;
  if (pP==z)
    {
     System.out.println("You win") ;
     System.out.println("NOTIFICATION: The game is going to restart in 10 seconds");
     System.out.println("You needed"+" "+tries +" "+ "attemps/attemp");
     pause(10000);
     System.out.println("\f ");
     tries=0;
     z=(int)(Math.random()*100);
     pP=101;
    }
       if(pP>z)
   {
     System.out.println("Computer: My number is smaller than" + " " + pP);
      }     
     else
     {
     System.out.println("Computer: My number is bigger than" + " " +pP);
    }
  }
 public static void pause(int ms) 
   {
    try {
        Thread.sleep(ms);
    } catch (InterruptedException e) {
        System.err.format("IOException: %s%n", e);
    }
  }
}