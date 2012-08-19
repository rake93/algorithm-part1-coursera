package algorithm.part1.week1;


public class QuickFindUF {

   private int[] id;

   public QuickFindUF(int numberOfElements) {
      id = new int[numberOfElements];
      for(int i = 0; i < id.length; i++)
         id[i] = i;
   }

   public void union(int first, int second) {
      int firstValue = id[first];
      int secondValue = id[second];
      
      for(int i = 0; i < id.length; i++) {
         if(id[i] == firstValue) {
            id[i] = secondValue;
         }
      }
   }

   public boolean connected(int first, int second) {
      return id[first] == id[second];
   }

}
