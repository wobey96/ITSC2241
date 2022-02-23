public class Stack {

   private Money first;
   
   public Stack () {
      first = null;
   }
   
   public void push (Money m) {
      //adds a new Money object (m) to the top/front of the stack
      
      //set new object's next reference (m) to the current top/front object (first)      
      m.setNext (first);
      
      //update first to reference the new object (m)
      first = m; 
   }
   
   public Money pop () {
      //removes and returns the top/front Money object on the stack
      
      //output error message and stop if the list is already empty
      if (first == null) {
         System.out.println ("You cannot remove an object from an empty stack");
         return null;
      }
      
      //store temp reference to the first object so we can return it at the end
      //must be done before you change the first reference or you'll lose access to it
      Money m = first;
      
      //update first to point to the new front/top object
      first = first.getNext();
      
      return m;
   }
   
   public void search (Money m) {
      System.out.println ("Stop trying to search a stack");
   }
}
