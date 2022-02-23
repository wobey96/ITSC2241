public class Bank {
   public static void main (String[] args) {
      
      //create our stack
      Stack stack = new Stack();
      
      //add some money to our stack
      for (int i = 0; i < 5; i++) {
         stack.push ( new Money() );
      }
   
      //remove some money from our stack
      for (int i = 0; i < 5; i++) {
         System.out.println ("Removing: " + stack.pop ());
      }
   
   }
}