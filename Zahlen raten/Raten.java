
 public class Raten 
 { 
  int z;
  int i;
  public Raten()
  {
    z=(int)(Math.random()*10);
  }
   
  public void raten(int pP)
  {
       if (pP==z)
   {
    System.out.println("You win") ;
   }
   else
   {
    if(pP>z)
     {
     System.out.println("Computer: My number is smaller than" + " " + pP);
      }     
     else
     {
      System.out.println("Computer: My number is bigger than" + " " +pP);
     } 
   } 
     if (pP==z)
   {
    System.out.println("NOTIFICATION: The game is going to reset in 10 secons");
    pause(10000);
    System.out.println("\f ");  
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