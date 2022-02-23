public class BinarySearchTree 
{

   private Node root;
   
   public BinarySearchTree () 
   {
      root = null;
   }
   
   public void insert(String word)
   {
      if(root == null)
      {
         root = new Node(word);
      }
      insert(root, new Node(word) );
   }
   
   public void search(String word)
   {
      if(root == null)
      {
        System.out.println("Node not found ");
      }
      
      System.out.println( search(root, new Node(word) ));
   }
         
   private void insert (Node currentNode, Node addedNode) 
   {
        int comp =  currentNode.getWord().compareTo(addedNode.getWord());
        
        if(comp == -1)
        {
            // go right
            if(currentNode.rightChild == null)
            {
               currentNode.rightChild = addedNode;
            }
            else
            {
               insert(currentNode.rightChild, addedNode);
            
            } 
        }
        
        else if(comp == 1)
        {
         // go left
            if(currentNode.leftChild == null)
            {
               currentNode.leftChild = addedNode;
            }
            else
            {
               insert(currentNode.leftChild, addedNode);
            
            }
        }
        
        else // comp == 0
        {
            // increase frequency of node i'm at
            currentNode.setFrequency(currentNode.getFrequency()+1);
        }
    }
        
private Node search (Node currentNode, Node addedNode) 
   {
        int comp =  currentNode.getWord().compareTo(addedNode.getWord());
        
        if(comp == -1)
        {
            // go right
            if(currentNode.rightChild == null)
            {
               return null;
            }
            else
            {
               return search(currentNode.rightChild, addedNode);
            
            } 
        }
        
        else if(comp == 1)
        {
         // go left
            if(currentNode.leftChild == null)
            {
               return null;
            }
            else
            {
               return search(currentNode.leftChild, addedNode);
            
            }
        }
        
        else // comp == 0
        {   
            return currentNode;
        }
      }
      
      
         public void printPreOrder()
         {
            root.printPreOrder();
         }
         
         public void printInOrder()
         {
            root.printInOrder();
         }
         
         public void printPostOrder()
         {
            root.printPostOrder();
         }
}
  