public class PriorityQueue_W
{
   private PriorityCustomer[] heap;
   private int size;
   private int maxSize;
   private int customerRemoved;

   public PriorityQueue_W ()
   {
      heap = new PriorityCustomer [50];
      size = 0;
      maxSize = 0;
      customerRemoved = 0;
   }

   public void add (PriorityCustomer t)
   {

      if (size + 1 >= heap.length)
      {                  //Make sure there's room for the new object
         System.out.println ("The heap is full");
         return;
      }

      size++;                                         //Increase size
      System.out.println("New customer added!  Queue length is now: " + getSize() );

       if(size > maxSize)
       {
           maxSize = size;
       }

      heap [size] = t;                                //Add new object to the next open position

      int index = size;                               //Store initial index of the new object
                                                      //index is where our new object is


      while (index > 1)
      {                             //Determine if there is a parent

         int parentIndex = index / 2;                 //Get parent's index

         //Compare value with parent to determine if a swap is necessary
         if (t.getPriority () > heap[parentIndex].getPriority ())
         {

            //Swap parent with t
            heap [index] = heap [parentIndex];
            heap [parentIndex] = t;

            //Update index since we swapped with its parent
            //Again, index keeps track of where t is in the heap
            index = parentIndex;
         } else
         {
            //t is at it's correct location in the heap
            //(i.e., parent value is larger than t)
            break;
         }
      }
   }

   public PriorityCustomer remove ()
   {

      //check to make sure the heap isn't empty
      if (size == 0)
      {
         System.out.println ("The heap is empty");
         return null;
      }

      //store root node in temp variable so we can return it at the end
      PriorityCustomer root = heap [1];

      //take node in the last position and move it to the root
      heap [1] = heap [size];
      heap [size] = null;           //delete node from the bottom since we moved it to the root

      //update size
      size--;
      customerRemoved++;
      System.out.println(" customer removed!  Queue length is now: " + getSize() );

      //check to see if the heap is empty AFTER we removed the root
      if (size == 0)
      {
         return root;
      }

      //if we get to this point in the method, we know there are items left in the heap

      //store index and value of the node we moved to the root so we can compare with children
      int index = 1;
      int value = heap[1].getPriority ();

      //loop while there is at least one child
      //(size / 2) gives us the index to the last parent. Any node after that won't have children
      while (index <= size / 2 )
      {

         //get index to left and right children
         int leftIndex = index * 2;
         int rightIndex = leftIndex + 1;

         //get values for the children
         int leftValue = heap [leftIndex].getPriority ();

         /* initially store a realllly low value for the right child until we know
          * if there's actually a right child. The really low value ensures that we
          * don't swap with the right child if one isn't there.
          */
         int rightValue = Integer.MIN_VALUE;

         //if there is a right child, get it's actual value
         if (heap [rightIndex] != null)
         {
            rightValue = heap [rightIndex].getPriority ();
         }

         //determine which child is larger
         if (leftValue > rightValue)
         {
            //check parent value with left child value
            if (leftValue > value)
            {
               //swap left child with parent
               swap (leftIndex, index);

               //update parent index since we swapped it with the left child
               index = leftIndex;

            }
            else
            {
               //parent is larger, it's in its correct position. BREAK
               break;
            }
         }
         else
         {
            //check parent value with right child value
            if (rightValue > value)
            {
               //swap right child with parent
               swap (rightIndex, index);

               //update parent index since we swapped it with the right child
               index = rightIndex;
            }
            else

            {
               //parent is larger, it's in its correct position. BREAK
               break;
            }
         }
      }

      //return value that we removed from the heap at the beginning of this method
      return root;
   }

   private void swap (int index1, int index2)
   {
      PriorityCustomer temp = heap [index1];
      heap [index1] = heap [index2];
      heap [index2] = temp;
   }




   public int getSize()
   {
       // returns the size of the LinkedListQueue
       return size;
   }

   public int getMaxSize()
   {
       return maxSize;
   }

   public int getcustomerRemoved()
   {
       return customerRemoved;
   }

   public PriorityCustomer getRoot()
   {
       return heap[1];
   }
}
