public class DMV_Driver {
   public static void main (String[] args) {
 
      LinkedListQueue line = new LinkedListQueue ();
      
      for (int i = 0; i < 5; i++) {
         line.add ( new CarAlien () );
      }
      
      for (int i = 0; i < 5; i++) {
         line.remove ();
      }
   }
}