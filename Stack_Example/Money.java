public class Money {

   private Money next;
   private int amount;

   public Money () {
      next = null;
      
      //create random number between 0-6 for the different bill types
      int r = (int) (Math.random() * 6);
      
      /*Math.random ()
         min = 0.00000000 * 6 = 0               (int) = 0
         max = 0.99999999 * 6 = 5.99999999999   (int) = 5
      */
      
      if (r == 0) {
         amount = 1;
      } else if (r == 1) {
         amount = 5;
      } else if (r == 2) {
         amount = 10;
      } else if (r == 3) {
         amount = 20;
      } else if (r == 4) {
         amount = 50;
      } else if (r == 5) {
         amount = 100;
      }
   }
   
   public void setNext (Money m) {
      next = m;
   }
   
   public Money getNext () {
      return next;
   }
   
   public String toString () {
      return "$" + amount;
   }
}