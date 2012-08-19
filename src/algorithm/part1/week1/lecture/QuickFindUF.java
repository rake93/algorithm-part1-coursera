package algorithm.part1.week1.lecture;

public class QuickFindUF implements UnionFind {

   private int[] id;

   public QuickFindUF(int numberOfElements) {
      id = new int[numberOfElements];
      for(int i = 0; i < id.length; i++)
         id[i] = i;
   }

   /* (non-Javadoc)
    * @see algorithm.part1.week1.UnionFind#union(int, int)
    */
   @Override
   public void union(int first, int second) {
      int firstValue = id[first];
      int secondValue = id[second];
      
      for(int i = 0; i < id.length; i++) {
         if(id[i] == firstValue) {
            id[i] = secondValue;
         }
      }
   }

   /* (non-Javadoc)
    * @see algorithm.part1.week1.UnionFind#connected(int, int)
    */
   @Override
   public boolean connected(int first, int second) {
      return id[first] == id[second];
   }

   public int[] getIds()
   {
      return id.clone();
   }

}
