package algorithm.part1.week1.lecture;

import org.junit.Test;

import algorithm.part1.week1.lecture.QuickFindUF;
import algorithm.part1.week1.lecture.UnionFind;
import static org.junit.Assert.*;

public class QuickFindUFTest {

   @Test
   public void shouldBeReflexive() {
      UnionFind quickFindUF = new QuickFindUF(4);
      
      assertTrue(quickFindUF.connected(0,0));
      assertTrue(quickFindUF.connected(1,1));
      assertTrue(quickFindUF.connected(2,2));
      assertTrue(quickFindUF.connected(3,3));
   }
   
   @Test
   public void shouldBeSymetric() {
      UnionFind quickFindUF = new QuickFindUF(10);
      
      quickFindUF.union(0,7);
      quickFindUF.union(1,9);
      
      assertTrue(quickFindUF.connected(0,7));
      assertTrue(quickFindUF.connected(7,0));
      
      assertTrue(quickFindUF.connected(1,9));
      assertTrue(quickFindUF.connected(9,1));
      
      assertFalse(quickFindUF.connected(0,1));
      assertFalse(quickFindUF.connected(0,9));
      
      assertFalse(quickFindUF.connected(7,1));
      assertFalse(quickFindUF.connected(7,9));
   }
   
   @Test
   public void shouldBeTransitie() {
      UnionFind quickFindUF = new QuickFindUF(10);
      
      quickFindUF.union(0,7);
      quickFindUF.union(1,9);
      quickFindUF.union(7,1);
      quickFindUF.union(8,9);
      
      assertTrue(quickFindUF.connected(0,9));
      assertTrue(quickFindUF.connected(0,8));
      
      assertTrue(quickFindUF.connected(9,7));
      assertTrue(quickFindUF.connected(8,0));
   }
}
