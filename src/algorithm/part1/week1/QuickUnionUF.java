package algorithm.part1.week1;

public class QuickUnionUF implements UnionFind {

   private int[] id;

   public QuickUnionUF(int numberOfElements) {
      id = new int[numberOfElements];
      for (int i = 0; i < id.length; i++)
         id[i] = i;
   }

   @Override
   public void union(int first, int second) {
      int rootFirst = root(first);
      int rootSecond = root(second);
      id[rootFirst] = rootSecond;
   }

   @Override
   public boolean connected(int first, int second) {
      return root(first) == root(second);
   }
   
   private int root(int value) {
      int i = value;
      while(i != id[i]) i = id[i];
      return i;
   }

}
