package algorithm.part1.week1.exercise;

import org.junit.Test;
import static org.junit.Assert.*;

import algorithm.part1.week1.lecture.QuickFindUF;
import algorithm.part1.week1.lecture.WeightedQuickUnionUF;

public class UnionFindExercise {
   
   
//   (seed = 4822)
//   Give the id[] array that results from the following sequence of union operations
//   on a set of 10 items using the quick-find algorithm.
//
//       8-6 6-1 2-8 4-7 9-2 5-7 
//
//   Recall: our quick-find convention for the union operation p-q is to change id[p]
//   (and perhaps some other entries) but not id[q].
//   
   @Test
   public void shoudBeRightQuickFind() {
      QuickFindUF quickFindUF = new QuickFindUF(10);
      
      quickFindUF.union(8, 6);
      quickFindUF.union(6, 1);
      quickFindUF.union(2, 8);
      quickFindUF.union(4, 7);
      quickFindUF.union(9, 2);
      quickFindUF.union(5, 7);
      
      int [] ids = quickFindUF.getIds();
      
      assertEquals(ids[0],0);
      assertEquals(ids[1],1);
      assertEquals(ids[2],1);
      assertEquals(ids[3],3);
      assertEquals(ids[4],7);
      assertEquals(ids[5],7);
      assertEquals(ids[6],1);
      assertEquals(ids[7],7);
      assertEquals(ids[8],1);
      assertEquals(ids[9],1);
      
      //answer: 0,1,1,3,7,7,1,7,1,1
   }
   
   
//   (seed = 445701)
//   Give the id[] array that results from the following sequence of union operations
//   on a set of 10 items using the weighted quick-union algorithm.
//
//       3-6 8-0 0-9 2-4 4-3 0-5 7-8 9-3 1-8 
//
//   Recall: when joining two trees of equal size, the algorithm makes the root of
//   the second tree point to the root of the first tree.
   @Test
   public void shouldBeRightQuickUnion() {
      WeightedQuickUnionUF weightedQuickUnionUF = new WeightedQuickUnionUF(10);
      weightedQuickUnionUF.union(3, 6);
      weightedQuickUnionUF.union(8, 0);
      weightedQuickUnionUF.union(0, 9);
      weightedQuickUnionUF.union(2, 4);
      weightedQuickUnionUF.union(4, 3);
      weightedQuickUnionUF.union(0, 5);
      weightedQuickUnionUF.union(7, 8);
      weightedQuickUnionUF.union(9, 3);
      weightedQuickUnionUF.union(1, 8);
      
      int [] ids = weightedQuickUnionUF.getIds();
      
      assertEquals(ids[0],8);
      assertEquals(ids[1],8);
      assertEquals(ids[2],8);
      assertEquals(ids[3],2);
      assertEquals(ids[4],2);
      assertEquals(ids[5],8);
      assertEquals(ids[6],3);
      assertEquals(ids[7],8);
      assertEquals(ids[8],8);
      assertEquals(ids[9],8);
      
      //answer: 8 8 8 2 2 8 3 8 8 8
      
   }

}
