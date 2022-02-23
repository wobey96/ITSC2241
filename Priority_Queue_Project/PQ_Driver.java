import java.util.Random;


public class PQ_Driver
{
    public static void main (String[] args)
    {

       PriorityQueue_W line = new PriorityQueue_W ();
       Random rand = new Random();

       for (int i = 0; i < 60; i++)
       {
           double ranD = rand.nextDouble();

           if(ranD < 0.25)
           {
               line.add ( new PriorityCustomer () );
           }
         System.out.println("----------------------");
       }

       for (int i = 0; i < 60; i++) {
          line.remove ();
       }
       System.out.println("Maximum line length during the simulation: " + line.getMaxSize());
       System.out.println("Total number of customers serviced: " + line.getcustomerRemoved());
    }
}
