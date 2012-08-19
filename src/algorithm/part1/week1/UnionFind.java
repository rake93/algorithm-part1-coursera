package algorithm.part1.week1;

public interface UnionFind {

   public abstract void union(int first, int second);

   public abstract boolean connected(int first, int second);

}