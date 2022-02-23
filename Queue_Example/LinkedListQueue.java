public class LinkedListQueue {

   private CarAlien first, last;
   private int size;
   
   public LinkedListQueue () {
      size = 0;
      first = last = null;
   }
   
   public void add (CarAlien c) {
      //add CarAlien c to the back of the list
       
      //if list is empty, update first to the new object
      //since it will be both the first and last object in the line
      if (first == null) {
         first = c;
      } else { //list is not empty
         //update next reference of last object to the new object (c)
         last.setNext (c);
      }
      
      
      //update last to reference the new object that was put in the back of the line
      last = c;
      
   }
   
   public CarAlien remove () {
      
      //store temp reference to first object so we can return it at the end
      CarAlien temp = first;
      
      //is the line already empty
      if (first == null) {
         System.out.println ("The line is already empty");
         return null;
      }
      
      //update first to now point to the next (2nd) object in the list
      first = first.getNext ();
      
      //is the line now empty after we've removed the first object
      if (first == null) {
         last = null;
      }
      
      return temp;
   
   }


}