public class Node 
{

   private int frequency;
   private String word;
   
   public Node leftChild, rightChild;
   
   public Node() 
   {
      frequency = 1;
      leftChild = rightChild = null;
   }
   
   public Node(int f) 
   {
      frequency = f;
      leftChild = rightChild = null;
   }
   
   public Node(String w)
   {
      frequency = 1;
      word = w;
      leftChild = rightChild = null;
   }
   
   public int getFrequency () 
   {
      return frequency;
   }
   
   public void setFrequency(int number)
   {
      frequency =  number;
   }
   
   public void setLeftChild (Node t) 
   {
      leftChild = t;
   }
   public void setRightChild (Node t) 
   {
      rightChild = t;
   }
   public Node getLeftChild () 
   {
      return leftChild;
   }
   public Node getRightChild () 
   {
      return rightChild;
   }
   
   public String toString () 
   {
      return "" + frequency;
   }
   
   public String getWord()
   {
      return word;
   }
   
   public void printPreOrder()
         {
         
            System.out.println(word);
            
            if(leftChild != null)
            {
               leftChild.printPreOrder();

            }
            
            if(rightChild != null)
            {
              rightChild.printPreOrder(); 
            }
            
         }
         
         public void printInOrder()
         {
            if(leftChild != null)
            {
               leftChild.printInOrder();

            }
            
            System.out.println(word);
            
            if(rightChild != null)
            {
              rightChild.printInOrder(); 
            }

            
         }
         
         public void printPostOrder()
         {
            if(leftChild != null)
            {
               leftChild.printPostOrder();

            }
            
            if(rightChild != null)
            {
              rightChild.printPostOrder(); 
            }

            System.out.println(word);

         }

}
