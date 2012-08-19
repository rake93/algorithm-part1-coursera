package algorithm.part1.week1;

public class WeightedQuickUnionUF implements UnionFind {
   private int[] id;
   private int[] treeSize;
   
   public WeightedQuickUnionUF(int numberOfElements) {
      id = new int[numberOfElements];
      treeSize = new int[numberOfElements];
      
      for (int i = 0; i < id.length; i++)
         id[i] = i;
      
      for (int i = 0; i < treeSize.length; i++)
         treeSize[i] = 1;
   }
   
   @Override
   public void union(int first, int second) {
      int rootFirst = root(first);
      int rootSecond = root(second);
      
      if (treeSize[rootFirst] < treeSize[rootSecond]) {
         id[rootFirst] = rootSecond;
         treeSize[rootSecond] += treeSize[rootFirst];
      } else {
         id[rootSecond] = rootFirst;
         treeSize[rootFirst] += treeSize[rootSecond];
      }
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
