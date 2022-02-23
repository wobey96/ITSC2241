public class LinkedListQueue {

   private Customer first, last;
   private int size;
   private int maxSize;
   private int customerRemoved;

   public LinkedListQueue () {
      size = 0;
      first = last = null;
      maxSize = 0;
   }

   public void add (Customer c) {

      //add CarAlien c to the back of the list
      //if list is empty, update first to the new object
      //since it will be both the first and last object in the line
      if (first == null) {
         first = c;
      }
      else { //list is not empty
         //update next reference of last object to the new object (c)
         last.setNext (c);
      }
      //update last to reference the new object that was put in the back of the line
      last = c;
     System.out.println("New customer added!  Queue length is now: " + getSize() );
      size++;

      if(size > maxSize){
          maxSize = size;
      }
   }

   public Customer remove () {

      //store temp reference to first object so we can return it at the end
      Customer temp = first;

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
      size--;
      customerRemoved++;
      System.out.println(" customer removed!  Queue length is now: " + getSize() );
      return temp;


   }

    public boolean emptyList() {
        //is the list empty?
        return first == null;
    }

    public int getSize() {
        // returns the size of the LinkedListQueue
        return size;
    }

    public int getMaxSize(){
        return maxSize;
    }

    public int getcustomerRemoved(){
        return customerRemoved;
    }



}
