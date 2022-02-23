public class CarAlien {

   private String id;
   private CarAlien next;
   
   public CarAlien () {
      //Set random id to A0-99
      id = "A" + (int)(Math.random() * 100);
      next = null;
   }
   
   public void setNext (CarAlien c) {
      next = c;
   }
   public CarAlien getNext () {
      return next;
   }
   
   
   public String toString () {
      return id;
   }


}
